<%-- 
    Document   : Listar_Documentos
    Created on : 17/05/2022, 11:14:30 AM
    Author     : LAURA
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Documentos"%>
<%@page import="Modelo.Documento_DAO_CRUD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LISTAR DOCUMENTOS</title>
    </head>
    <body>
        <h1>DOCUMENTOS</h1>
        <%--<a href="Controlador_CRUD_Usuarios?accion=add">Agregar Nuevo</a>--%>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>NOMBRE</th>
                    <th>DETALLE</th>
                    <th>TIPO</th>
                    <th>CATEGORÍA</th>
                    <th>VERSIÓN</th>
                    <th>FECHA</th>
                    <th>RUTA</th>
                    <th>ÁREA</th>
                    <th>AUDITORÍA</th>
                </tr>
            </thead>
            <%
                Documento_DAO_CRUD dao = new Documento_DAO_CRUD();
                List<Documentos> list = dao.listar();
                Iterator<Documentos> iter = list.iterator();
                Documentos doc = null;
                while (iter.hasNext()) {
                    doc = iter.next();

            %>
            <tbody>
                <tr>
                    <td><%= doc.getId_doc()%></td>
                    <td><%= doc.getNom_doc()%></td>
                    <td><%= doc.getDetalle()%></td>
                    <td><%= doc.getTipo_doc()%></td>
                    <td><%= doc.getCategoria()%></td>
                    <td><%= doc.getVersion()%></td>
                    <td><%= doc.getFecha()%></td>
                    <td><%= doc.getRuta_doc()%></td>
                    <td><%= doc.getArea()%></td>
                    <td><%= doc.getTitulo()%></td>
                    <td>
                        
                        <a>Eliminar</a>
                    </td>
                </tr>
                <% }%>
            </tbody>
        </table>

    </div>
</body>
</html>
