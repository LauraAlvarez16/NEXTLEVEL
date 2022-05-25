<%-- 
    Document   : Listar_Auditados
    Created on : 14/05/2022, 08:41:24 PM
    Author     : LAURA
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Usuario"%>
<%@page import="Modelo.Usuario_DAO_CRUD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LISTAR USUARIOS</title>
    </head>
    <body>
        <div>
            <h1>Usuarios</h1>
            <a href="Controlador_CRUD_Usuarios?accion=add">Agregar Nuevo</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>APELLIDO</th>
                        <th>CIF/NIIF</th>
                        <th>CORREO</th>
                        <th>TELÉFONO</th>
                        <th>ÁREA</th>
                        <th>CARGO</th>
                    </tr>
                </thead>
                <%
                Usuario_DAO_CRUD dao=new Usuario_DAO_CRUD();
                List<Usuario>list=dao.listar();
                Iterator<Usuario>iter=list.iterator();
                Usuario usu=null;
                while(iter.hasNext()){
                usu=iter.next();
               
                %>
                <tbody>
                    <tr>
                        <td><%= usu.getId_usuario()%></td>
                        <td><%= usu.getNombre()%></td>
                        <td><%= usu.getApellido()%></td>
                        <td><%= usu.getCif_niif()%></td>
                        <td><%= usu.getCorreo()%></td>
                        <td><%= usu.getTelefono()%></td>
                        <td><%= usu.getArea()%></td>
                        <td><%= usu.getCargo()%></td>
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
