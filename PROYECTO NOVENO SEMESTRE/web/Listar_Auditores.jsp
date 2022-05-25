<%-- 
    Document   : Listar_Auditores
    Created on : 21/05/2022, 12:14:06 AM
    Author     : LAURA
--%>
<%@page import="Modelo.Usuario_DAO_CRUD"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Auditor"%>
<%@page import="Modelo.Auditor_DAO_CRUD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <div>
        <h1>Auditor</h1>
        <a href="Controlador_CRUD_Auditor?accion=add">Agregar Nuevo</a>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    <th>CORREO</th>
                    <th>CARGO</th>
                    <th>SECTOR</th>
                    <th>NICK</th>
                    <th>NIVELES</th>
                </tr>
            </thead>
            <%
                Auditor_DAO_CRUD dao = new Auditor_DAO_CRUD();
                List<Auditor> list = dao.listar();
                Iterator<Auditor> iter = list.iterator();
                Auditor usu = null;
                while (iter.hasNext()) {
                    usu = iter.next();

            %>
            <tbody>
                <tr>
                    <td><%= usu.getId_auditor()%></td>
                    <td><%= usu.getNom_auditor()%></td>
                    <td><%= usu.getApe_auditor()%></td>
                    <td><%= usu.getCorreo()%></td>
                    <td><%= usu.getCargo()%></td>
                    <td><%= usu.getSector()%></td>
                    <td><%= usu.getNick()%></td>
                    <td><%= usu.getNivel()%></td>
                    <td>
                        <a>Editar</a>
                        <a>Eliminar</a>
                    </td>
                </tr>
                <% }%>
            </tbody>
        </table>

    </div>
</body>
</html>
