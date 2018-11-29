/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.servlet;

import book.controller.CustomerJpaController;
import book.controller.exceptions.RollbackFailureException;
import book.model.Customer;
import static book.servlet.LoginServlet.cryptWithMD5;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
import javax.transaction.UserTransaction;

/**
 *
 * @author GIFS
 */
public class RegisterServlet extends HttpServlet {

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

        if (request.getSession(false).getAttribute("customer") != null) {
            response.sendRedirect("Home");
            return;
        }

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        if (fName != null && lName != null && username != null && password != null && address != null && phone != null && email != null) {
            CustomerJpaController customerCtrl = new CustomerJpaController(utx, emf);

            List<Customer> customerList = customerCtrl.findCustomerEntities();
            Customer cumodel = new Customer();
            for (Customer cust : customerList) {
                if (cust.getUsername().equalsIgnoreCase(username)) {
                    cumodel = cust;
                }
            }

            if (cumodel.getCustomerid() == null) {
                int custId = customerCtrl.getCustomerCount() + 1;
                password = password = cryptWithMD5(password).substring(0, 24);
                Customer customer = new Customer();
                customer.setAddress(address);
                customer.setCustomerid(custId);
                customer.setEmail(email);
                customer.setFirstname(fName);
                customer.setLastname(lName);
                customer.setPhone(phone);
                customer.setUsername(username);
                customer.setPassword(password);
                customer.setOrdersList(null);

                try {
                    customerCtrl.create(customer);

                } catch (RollbackFailureException ex) {
                    Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                } catch (Exception ex) {
                    Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }

                request.setAttribute("msg", "สมัครสมาชิกเรียบร้อยแล้ว");
                getServletContext().getRequestDispatcher("/Home.jsp").forward(request, response);
                return;
            }
            request.setAttribute("msg", "USERNAME นี้มีคนใช้แล้ว");
            getServletContext().getRequestDispatcher("/Register.jsp").forward(request, response);
            return;
        }
        request.setAttribute("msg", "กรุณากรอกข้อมูลให้ถูกต้อง");
        getServletContext().getRequestDispatcher("/Register.jsp").forward(request, response);
    }

    public static String cryptWithMD5(String pass) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] passBytes = pass.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < digested.length; i++) {
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
        return null;
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
