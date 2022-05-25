<%-- 
    Document   : Eliminar_Auditor
    Created on : 21/05/2022, 12:20:30 AM
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
                st.executeUpdate("DELETE FROM auditor where id_auditor='"+request.getParameter("id") +"';");
                 request.getRequestDispatcher("Crud_Auditor.jsp").forward(request, response);
            } catch (Exception e) {
                out.print(e);
            }

        %>
    </body>
</html>
