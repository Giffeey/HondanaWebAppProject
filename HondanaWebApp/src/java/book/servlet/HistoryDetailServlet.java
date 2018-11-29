/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.servlet;

import book.controller.OrderdetailJpaController;
import book.controller.OrdersJpaController;
import book.controller.PaymentJpaController;
import book.controller.ShippingJpaController;
import book.model.Customer;
import book.model.Orderdetail;
import book.model.OrderdetailPK;
import book.model.Orders;
import book.model.Payment;
import book.model.Shipping;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class HistoryDetailServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        if (session != null) {
            Customer customer = (Customer) session.getAttribute("customer");
            if (customer != null) {
                String orderNo = request.getParameter("orderNo");

                String orderSession = (String) request.getAttribute("orderNo");
                if (orderNo != null || orderSession != null) {
                    int orderNum = 0;
                    if (orderSession == null) {
                        orderNum = Integer.valueOf(orderNo);
                    }else if(orderNo == null){
                        orderNum = Integer.valueOf(orderSession);
                    }
                    
                    OrdersJpaController orderCtrl = new OrdersJpaController(utx, emf);
                    Orders order = orderCtrl.findOrders(orderNum);
                    if (order != null) {

                        OrderdetailJpaController orDetailCtrl = new OrderdetailJpaController(utx, emf);
                        List<Orderdetail> orDetail = orDetailCtrl.findOrderdetailEntities();
                        List<Orderdetail> orderDetail = new ArrayList<>();

                        for (Orderdetail orderDe : orDetail) {
                            if (orderDe.getOrderdetailPK().getOrderno() == orderNum) {
                                orderDetail.add(orderDe);
                            }
                        }

                        PaymentJpaController paymentCtrl = new PaymentJpaController(utx, emf);
                        Payment payment = paymentCtrl.findPayment(order.getPayment().getPaymentno());

                        ShippingJpaController shippingCtrl = new ShippingJpaController(utx, emf);
                        Shipping shipping = shippingCtrl.findShipping(order.getShipno().getShipno());

                        session.setAttribute("orderNo", orderNo);
                        session.setAttribute("historyDetail", orderDetail);
                        session.setAttribute("paymentDetail", payment);
                        session.setAttribute("shippingDetail", shipping);
                        getServletContext().getRequestDispatcher("/HistoryDetail.jsp").forward(request, response);
                        return;
                    }
                }
            }
        }
        response.sendRedirect("Home");

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
