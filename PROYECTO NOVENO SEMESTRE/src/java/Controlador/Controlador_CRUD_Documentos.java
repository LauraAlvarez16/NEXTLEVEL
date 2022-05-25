/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author LAURA
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Documentos;
import Modelo.Documento_DAO_CRUD;

public class Controlador_CRUD_Documentos extends HttpServlet {

    String listar = "Listar_Auditados.jsp";
    String add = "Registrar_Auditado.jsp";
    String edit = "Modificar_Auditado.jsp";
    Documentos doc = new Documentos();
    Documento_DAO_CRUD dao = new Documento_DAO_CRUD();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("btn_Buscar");

        switch (accion) {
            case "Buscar":
                String dato = request.getParameter("txt_Buscar");
                List<Documentos> lista = dao.buscar(dato);
                request.setAttribute("datos", lista);
                request.getRequestDispatcher("Listar_Documentos.jsp").forward(request, response);
                break;
            default:
                List<Documentos> datos = dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("Listar_Documentos.jsp").forward(request, response);
                break;
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador_CRUD_Documentos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_CRUD_Documentos at " + request.getContextPath() + "</h1>");
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
            String nom_doc = request.getParameter("txt_Nombre");
            String detalle = request.getParameter("txta_Detalle");
            String tipo = request.getParameter("jcb_Tipo");
            String categoria = request.getParameter("jcb_Categoria");
            String version = request.getParameter("txt_Version");
            String fecha = request.getParameter("datec_Fecha");
            byte[] ruta = request.getParameter("btn_ruta").getBytes();
            String area = request.getParameter("jcb_Area");
            String titulo = request.getParameter("txt_Titulo");
            doc.setNom_doc(nom_doc);
            doc.setDetalle(detalle);
            doc.setTipo_doc(tipo);
            doc.setCategoria(categoria);
            doc.setVersion(version);
            doc.setFecha(fecha);
            doc.setRuta_doc(ruta);
            doc.setArea(area);
            doc.setTitulo(titulo);
            dao.add(doc);
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
