/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.servlet;

import book.controller.BookJpaController;
import book.model.Book;
import book.model.Cart;
import book.model.Customer;
import java.io.IOException;
import java.io.PrintWriter;
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
public class ShowCartServlet extends HttpServlet {

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
            Customer cust = (Customer) session.getAttribute("customer");
            if (cust != null) {
                Cart cart = (Cart) session.getAttribute("cart");

                if (cart != null) {
                    if(cart.getTotalQuantity() != 0){
                    String increase = request.getParameter("increase");
                    String decrease = request.getParameter("decrease");
                    String remove = request.getParameter("remove");
                    BookJpaController bookCtrl = new BookJpaController(utx, emf);
                    if (increase != null) {

                        Book book = bookCtrl.findBook(increase);
                        if (book != null) {
                            cart.increaseBook(book);
                        }

                    }
                    if (decrease != null) {

                        Book book = bookCtrl.findBook(decrease);
                        if (book != null) {
                            cart.decreaseBook(book);
                        }

                    }
                    if (remove != null) {

                        Book book = bookCtrl.findBook(remove);
                        if (book != null) {
                            cart.remove(book);
                        }
                        
                        if (cart.getTotalQuantity() == 0){
                            response.sendRedirect("Home");
                            return;
                        }

                    }
                    session.setAttribute("cart", cart);
                    getServletContext().getRequestDispatcher("/ShowItemInCart.jsp").forward(request, response);
                    return;
                }
                }
              
                request.setAttribute("msg", "ไม่มีสินค้าในตะกร้า");
                response.sendRedirect("Home");
                return;
            }
        }

        request.setAttribute("msg", "เข้าสู่ระบบก่อนทำการเพิ่มสินค้าลงตะกร้า");
        response.sendRedirect("Login");
        
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
