/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelets;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author LAURA
 */
@WebServlet(name = "Auditores", urlPatterns = {"/Auditores"})
public class Auditores extends HttpServlet {

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

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

            try {

                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                st = con.createStatement();
                String query = "SELECT id_auditor, nombre_auditor, apellido_auditor, correo_auditor, cargo_auditor, sector_auditor, nivel, nick\n"
                        + "FROM auditor LEFT JOIN niveles ON auditor.id_niveles = niveles.id_niveles";
                String where = " ";
                String busca = request.getParameter("txt_Buscar");

                if (busca != null) {
                    where = " WHERE CONCAT(nombre_auditor,' ', apellido_auditor) LIKE '%" + busca + "%'";

                }

                query = query + where;
                rs = st.executeQuery(query);

                while (rs.next()) {
                    out.print("<tr>"
                            + "<th scope = \"row\" class=\"text-center\">" + rs.getString(1) + "</th>"
                            + "<td class=\"text-center\">" + rs.getString(2) + "</td>"
                            + "<td class=\"text-center\">" + rs.getString(3) + "</td>"
                            + "<td class=\"text-center\">" + rs.getString(4) + "</td>"
                            + "<td class=\"text-center\">" + rs.getString(5) + "</td>"
                            + " <td class=\"text-center\">" + rs.getString(6) + "</td>"
                            + " <td class=\"text-center\">" + rs.getString(7) + "</td>"
                            + " <td class=\"text-center\">" + rs.getString(8) + "</td>"
                            + "<td class=\"text-center\">"
                            + " <a href=\"Modificar_Auditor.jsp?id=" + rs.getString(1) + "&nombre=" + rs.getString(2) + "&apellido=" + rs.getString(3) + "&correo=" + rs.getString(4) + "&cargo=" + rs.getString(5) + "&sector=" + rs.getString(6) + "&nivel=" + rs.getString(7) + "&nick=" + rs.getString(8) + "\"><i class=\"fa fa-pencil fa-lg\" aria-hidden=\"true\"></i></a>"
                            + "<a href=\"Eliminar_Auditor.jsp?id=" + rs.getString(1) + "\" class=\"ml-3\" onclick=\"return confirm('Estás seguro que deseas eliminar el registro?')\"><i class=\"fa fa-trash fa-lg\" aria-hidden=\"true\"></i></a>"
                            + "</td>"
                            + "</tr>"
                    );

                }
            } catch (Exception e) {
                out.print("Error mysql" + e);

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

}
