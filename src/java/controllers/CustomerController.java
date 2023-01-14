/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import config.CustomerDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Customer;
import models.LoginModel;

/**
 *
 * @author janto
 */
@WebServlet(name = "CustomerController", urlPatterns = {"/CustomerController"})
public class CustomerController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CustomerController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CustomerController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
       // CustomerDao custList = new CustomerDao();
        String accion = request.getParameter("accion");
        RequestDispatcher dispatcher = null;
        if(accion == null || accion.isEmpty()){
            dispatcher = request.getRequestDispatcher("views/Customer1.jsp");
        } else if (accion.equals("log_out")){
           /*List<Customer>listaclientes;
            try {
                listaclientes = custList.list();
            
           request.setAttribute("listCus", listaclientes);
           } catch (Exception ex) {
                Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
            }*/
           dispatcher = request.getRequestDispatcher("views/Index.jsp");
                    
              
        } else if (accion.equals("last_service")){
            dispatcher = request.getRequestDispatcher("views/Customer_lastService.jsp");
        }else if (accion.equals("book_an")){
            dispatcher = request.getRequestDispatcher("views/Customer_bookAppointment.jsp");
        }else if (accion.equals("booked")){
            dispatcher = request.getRequestDispatcher("views/Customer_booked.jsp");
        }else if (accion.equals("annulaService")){
            dispatcher = request.getRequestDispatcher("views/Customer_Service_Annual.jsp");
        }else if (accion.equals("majorService")){
            dispatcher = request.getRequestDispatcher("views/Customer_Service_Major.jsp");
        }else if (accion.equals("repairFault")){
            dispatcher = request.getRequestDispatcher("views/Customer_Service_Repair.jsp");
        }else if (accion.equals("majorRepair")){
            dispatcher = request.getRequestDispatcher("views/Customer_Service_MajorRepair.jsp");
        }else if (accion.equals("mainPage")){
            dispatcher = request.getRequestDispatcher("views/Customer1.jsp");
        }else if (accion.equals("ProceedBook")){
            dispatcher = request.getRequestDispatcher("views/Customer_bookApService.jsp");
        }else if (accion.equals("saveBook")){
            dispatcher = request.getRequestDispatcher("views/Customer1.jsp");
        }
        dispatcher.forward(request, response);
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
        doGet(request,response);
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
