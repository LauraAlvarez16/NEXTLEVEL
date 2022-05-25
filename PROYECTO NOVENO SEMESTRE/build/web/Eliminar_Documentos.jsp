<%-- 
    Document   : Eliminar_Documentos
    Created on : 17/05/2022, 11:11:09 PM
    Author     : LAURA
--%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            Connection con = null;
            Statement st = null;
            try {

                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                st = con.createStatement();
                st.executeUpdate("DELETE FROM documentos where id_doc='"+request.getParameter("id") +"';");
                 request.getRequestDispatcher("Tabla_Documentos.jsp").forward(request, response);
            } catch (Exception e) {
                out.print(e);
            }

        %>

    </body>
</html>
