/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import Modelo.Auditor;
import Modelo.Niveles_DAO_CRUD;
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
@WebServlet(name = "Auditor_Roles", urlPatterns = {"/Auditor_Roles"})

public class Auditor_Roles extends HttpServlet {

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
        String accion = request.getParameter("accion");

        try {
            if (accion != null) {

                switch (accion) {
                    case "verificar":/*Verificar Credencias si existe o no*/
                        verificar(request, response);
                        break;
                    case "cerrar":
                        cerrarsession(request, response);
                        break;
                    default:
                        response.sendRedirect("Login.jsp");
                }
            } else {
                response.sendRedirect("Login.jsp");
            }
        } catch (Exception e) {
            try {
                System.out.println("ERROR Servicio "+e.getMessage());
            } catch (Exception ex) {
                System.out.println("Error" + ex.getMessage());
            }
        }
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

    private void verificar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession sesion;
        Niveles_DAO_CRUD dao;
        Auditor auditor;
        auditor = this.obtenerUsuario(request);
        dao = new Niveles_DAO_CRUD();
        auditor = dao.identificar(auditor);
        System.out.println("1 "+auditor);
        if (auditor != null && auditor.getNivel().getNiveles().equals("Nivel 1")) {
            System.out.println("2 "+auditor);
            sesion = request.getSession();
            sesion.setAttribute("nivel1", auditor);
            System.out.println("3 "+auditor);
           this.getServletConfig().getServletContext().getRequestDispatcher("/Principal_Nivel1.jsp").forward(request, response);
            
        } else if (auditor != null && auditor.getNivel().getNiveles().equals("Nivel 2")) {
            sesion = request.getSession();
            sesion.setAttribute("nivel2", auditor);
            this.getServletConfig().getServletContext().getRequestDispatcher("/Principal_Nivel2.jsp").forward(request, response);
            
        } else if (auditor != null && auditor.getNivel().getNiveles().equals("Nivel 3")) {
            sesion = request.getSession();
            sesion.setAttribute("nivel3", auditor);
            this.getServletConfig().getServletContext().getRequestDispatcher("/Principal_Nivel3.jsp").forward(request, response);
            
        } else if (auditor != null && auditor.getNivel().getNiveles().equals("Nivel 4")) {
            sesion = request.getSession();
            sesion.setAttribute("nivel4", auditor);
            this.getServletConfig().getServletContext().getRequestDispatcher("/Principal.jsp").forward(request, response);
        } else {
            System.out.println("ERROR VERIFICAR");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
    }

    private void cerrarsession(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession sesion = request.getSession();
        sesion.setAttribute("auditor", null);
        sesion.invalidate();
        response.sendRedirect("Login.jsp");
    }

    private Auditor obtenerUsuario(HttpServletRequest request) {
        Auditor u = new Auditor();
        u.setNick(request.getParameter("txt_User"));
        u.setContraseña(request.getParameter("txt_Pass"));
        return u;
    }

}
