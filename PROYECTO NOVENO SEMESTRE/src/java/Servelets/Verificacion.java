/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Modelo.Correo_Usuario;
import Modelo.EnviarEmail;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LAURA
 */

@WebServlet(name = "Verificacion", urlPatterns = {"/Verificacion"})
public class Verificacion extends HttpServlet {

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

            String name = request.getParameter("txt_User");
            String email = request.getParameter("txt_Correo");

            //create instance object of the SendEmail Class
            EnviarEmail sm = new EnviarEmail();
            //get the 6-digit code
            String code = sm.getRandom();
            
            //craete new user using all information
            Correo_Usuario user = new Correo_Usuario(email, name, code);

            //call the send email method
            boolean test = sm.EnviarEmail(user);

            //check if the email send successfully
            if (test) {
                HttpSession session = request.getSession();
                session.setAttribute("authcode", user);
                
            } else {
                out.println("No se pudo enviar el código de verificación");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}


    
