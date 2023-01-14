/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import config.CustomerDao;
import config.MechanicDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Customer;
import models.Mechanic;

/**
 *
 * @author janto
 */
@WebServlet(name = "RegisterControllers", urlPatterns = {"/RegisterControllers"})
public class RegisterControllers extends HttpServlet {

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
            out.println("<title>Servlet RegisterControllers</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterControllers at " + request.getContextPath() + "</h1>");
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
        
        String accion = request.getParameter("accion");
        RequestDispatcher dispatcher = null;
        if(accion == null || accion.isEmpty()){
            dispatcher = request.getRequestDispatcher("views/Register.jsp");
            dispatcher.forward(request, response);
        }else if(accion.equals("registrar")){
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String birth = request.getParameter("birth");
            int phone = Integer.parseInt(request.getParameter("phone"));
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            Customer c = new Customer();
            c.setC_name(name);
            c.setC_surname(surname);
            c.setC_birth(birth);
            c.setC_phone(phone);
            c.setC_email(email);
            c.setC_password(password);
            
            if (CustomerDao.newRegister(c)){
            request.setAttribute("message", "you have been registered");
            dispatcher = request.getRequestDispatcher("views/view_login.jsp");
            } else {
            request.setAttribute("message","you have not been registered");
            dispatcher = request.getRequestDispatcher("views/Register.jsp");
            } 
            
            
        }else if(accion.equals("registrarNewMechanic")){
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            //String birth = request.getParameter("birth");
            int phone = Integer.parseInt(request.getParameter("phone"));
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            Mechanic m = new Mechanic();
            m.setM_name(name);
            m.setM_surname(surname);
           // c.setC_birth(birth);
            m.setM_phone(phone);
            m.setM_email(email);
            m.setM_password(password);
            
            if (MechanicDao.newRegisterM(m)){
            request.setAttribute("message", "you have been registered");
            dispatcher = request.getRequestDispatcher("views/Administrator1.jsp");
            } else {
            request.setAttribute("message","you have not been registered");
            dispatcher = request.getRequestDispatcher("views/Administrator_RegNewMechanic.jsp");
            } 
        
        
      /**/
           // request.getRequestDispatcher("views/view2.jsp").forward(request, response);
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
        
        //processRequest(request, response);
        doGet(request, response);
        
        /* String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String birth = request.getParameter("birth");
            int phone = Integer.parseInt(request.getParameter("phone"));
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            Customer c = new Customer();
            c.setC_name(name);
            c.setC_surname(surname);
            c.setC_birth(birth);
            c.setC_phone(phone);
            c.setC_email(email);
            c.setC_password(password);
            
            if (CustomerDao.newRegister(c)){
            request.setAttribute("message", "you have been registered");
            } else {
            request.setAttribute("message","you have not been registered");
            }
            request.getRequestDispatcher("views/view2.jsp").forward(request, response);*/
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
