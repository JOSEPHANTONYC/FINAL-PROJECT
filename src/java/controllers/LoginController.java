/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.LoginModel;

/**
 *
 * @author janto
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        String accion = request.getParameter("accion");
        RequestDispatcher dispatcher = null;
        if(accion == null || accion.isEmpty()){
            dispatcher = request.getRequestDispatcher("views/view_login.jsp");
            dispatcher.forward(request, response);
        }else if(accion.equals("login")){
	LoginModel lm = new LoginModel();
	LoginModel lmc = new LoginModel();
        LoginModel lmM = new LoginModel();
	
	String u = request.getParameter("user");
	String p = request.getParameter("pwd");  
	
	System.out.println("Adentro");

	try {
		boolean conectado = lm.conectarA(u,p);
	  	if(conectado == true){
			dispatcher = request.getRequestDispatcher("views/Administrator1.jsp");
			System.out.println("Conectado");
		}else {
			boolean conecta = lmc.conectarC(u,p);
			if(conecta == true){
				dispatcher = request.getRequestDispatcher("views/Customer1.jsp");
				System.out.println("Conectado");
		  	}else {
			boolean conectad = lmM.conectar(u,p);
			if(conectad == true){
				dispatcher = request.getRequestDispatcher("views/Mechanic1.jsp");
				System.out.println("Conectado");
		  	}else {
				dispatcher = request.getRequestDispatcher("views/view_login.jsp");
				System.out.println("No Conectado");
			}
		}
		
	}
                dispatcher.forward(request, response);
        }catch (Exception ex) {
		Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
	}  
}


            
        }

        
        
        /*else if(accion == "modificar_user)"{
        }*/
    

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
