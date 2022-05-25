/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Usuario;
import Modelo.Usuario_DAO_CRUD;

/**
 *
 * @author LAURA
 */
public class Controlador_CRUD_Usuarios extends HttpServlet {

    String listar = "Listar_Auditados.jsp";
    String add = "Registrar_Auditado.jsp";
    String edit = "Modificar_Auditado.jsp";
    Usuario usu = new Usuario();
    Usuario_DAO_CRUD dao = new Usuario_DAO_CRUD();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("btn_Buscar");

        switch (accion) {
            case "Buscar":
                String dato = request.getParameter("txt_Buscar");
                List<Usuario> lista = dao.buscar(dato);
                request.setAttribute("datos", lista);
                request.getRequestDispatcher("Crud_Auditados.jsp").forward(request, response);
                break;
            default:
                List<Usuario> datos = dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("Crud_Auditados.jsp").forward(request, response);
                break;
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador_CRUD_Usuarios</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_CRUD_Usuarios at " + request.getContextPath() + "</h1>");
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
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        } else if (action.equalsIgnoreCase("add")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("Agregar")) {
            String nom_usu = request.getParameter("txt_Nombre");
            String ape_usu = request.getParameter("txt_Apellido");
            String cif_niif = request.getParameter("txt_Cif");
            String correo_usu = request.getParameter("txt_Correo");
            String tel_usu = request.getParameter("txt_Telefono");
            String area = request.getParameter("jcb_Area");
            String cargo_usu = request.getParameter("txt_Cargo");
            usu.setNombre(nom_usu);
            usu.setApellido(ape_usu);
            usu.setCif_niif(cif_niif);
            usu.setCorreo(correo_usu);
            usu.setTelefono(tel_usu);
            usu.setArea(area);
            usu.setCargo(cargo_usu);
            dao.add(usu);
            acceso = listar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
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
