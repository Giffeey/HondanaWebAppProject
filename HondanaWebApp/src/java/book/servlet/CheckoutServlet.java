/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.servlet;

import book.controller.CustomerJpaController;
import book.controller.OrderdetailJpaController;
import book.controller.OrdersJpaController;
import book.controller.PaymentJpaController;
import book.controller.ShippingJpaController;
import book.controller.exceptions.PreexistingEntityException;
import book.controller.exceptions.RollbackFailureException;
import book.model.Cart;
import book.model.Customer;
import book.model.LineItem;
import book.model.Orderdetail;
import book.model.OrderdetailPK;
import book.model.Orders;
import book.model.Payment;
import book.model.Shipping;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

/**
 *
 * @author GIFS
 */
public class CheckoutServlet extends HttpServlet {

    @Resource
    UserTransaction utx;

    @PersistenceUnit(unitName = "HondanaWebAppPU")
    EntityManagerFactory emf;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession(false);
        if (session != null) {
            Customer customer = (Customer) session.getAttribute("customer");
            if (customer != null) {
                Cart cart = (Cart) session.getAttribute("cart");
                if (cart != null) {

                    String address = request.getParameter("shipAddress");

                    String method = request.getParameter("shipMethod");

                    String price = request.getParameter("amount");

                    double amount = Double.valueOf(price);

                    CustomerJpaController customerCtrl = new CustomerJpaController(utx, emf);
                    Customer cust = customerCtrl.findCustomer(customer.getCustomerid());
                    if (cust != null) {

                        List<LineItem> list = cart.getLineItems();
                        System.out.println(list);
                        OrdersJpaController orderCtrl = new OrdersJpaController(utx, emf);
                        Orders orders = new Orders();
                        
                        orders.setCustomerid(customer);
                        orders.setOrderdate(new Date());
                        orders.setOrderno(orderCtrl.getOrdersCount() + 1);
                        orders.setStatus("กำลังดำเนินการชำระเงิน...");
                        orders.setTotalbook(cart.getTotalQuantity());
                        orders.setTotalprice(BigDecimal.valueOf(amount));

                        try {
                            orderCtrl.create(orders);
                        } catch (PreexistingEntityException ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (RollbackFailureException ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (Exception ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        OrderdetailJpaController orderDetailCtrl = new OrderdetailJpaController(utx, emf);
                        List<LineItem> itemList = cart.getLineItems();
                        List<Orderdetail> detailList = new ArrayList<>();
                        Orderdetail orDtail = new Orderdetail();

                        short i = 0;
                        for (LineItem orderItem : itemList) {
                            i++;
                            OrderdetailPK detailPK = new OrderdetailPK(orders.getOrderno(), orderItem.getBook().getIsbn());
                            orDtail.setOrderdetailPK(detailPK);
                            orDtail.setOrders(orders);
                            orDtail.setBook(orderItem.getBook());
                            orDtail.setPriceeach(orderItem.getSalePrice());
                            orDtail.setQuantity(orderItem.getQuantity());
                            orDtail.setOrderlinenumber(i);
                            detailList.add(orDtail);

                            try {
                                orderDetailCtrl.create(orDtail);
                            } catch (RollbackFailureException ex) {
                                Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (Exception ex) {
                                Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        orders.setOrderdetailList(detailList);

                        ShippingJpaController shipCtrl = new ShippingJpaController(utx, emf);
                        
                 
                        Shipping shipping = new Shipping();
                        shipping.setShipno(shipCtrl.getShippingCount() + 1);
                        shipping.setShipaddress(address);
                        shipping.setShipmethod(method);
                        shipping.setShipdate(new Date());
                        shipping.setOrderno(orders);
                        shipping.setOrders(orders);
                        shipping.setShipprice(BigDecimal.valueOf(0.00));
                        shipping.setTrackingno(null);
                        shipping.setShipstatus("กำลังดำเนินการจัดส่ง...");

                        try {
                            shipCtrl.create(shipping);
                        } catch (PreexistingEntityException ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (RollbackFailureException ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (Exception ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        PaymentJpaController paymentCtrl = new PaymentJpaController(utx, emf);
                        Payment payment = new Payment();
                        payment.setPaymentno(paymentCtrl.getPaymentCount() + 1);
                        payment.setOrderno(orders);
                        payment.setOrders(orders);
                        payment.setShipno(shipping);
                        payment.setShipping(shipping);
                        payment.setAmount(BigDecimal.valueOf(amount));

                        try {
                            paymentCtrl.create(payment);
                        } catch (PreexistingEntityException ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (RollbackFailureException ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (Exception ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        shipping.setPayment(payment);
                        shipping.setPaymentno(payment);
                        
                        orders.setPayment(payment);
                        orders.setPaymentno(payment);
                        orders.setShipno(shipping);
                        orders.setShipping(shipping);
                        orders.setStatus("ชำระเงินเรียบร้อยแล้ว กำลังดำเนินการจัดส่ง...");

                        try {
                            orderCtrl.edit(orders);
                            shipCtrl.edit(shipping);
                        } catch (RollbackFailureException ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (Exception ex) {
                            Logger.getLogger(CheckoutServlet.class.getName()).log(Level.SEVERE, null, ex);
                        }
        
                        response.sendRedirect("History");
                        return;
                    }
                }
            }
        }

        getServletContext().getRequestDispatcher("/index.html").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
