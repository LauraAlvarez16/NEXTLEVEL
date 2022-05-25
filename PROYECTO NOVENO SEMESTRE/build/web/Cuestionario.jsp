<%-- 
    Document   : Cuestionario
    Created on : 12/05/2022, 10:22:22 AM
    Author     : LAURA
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Registro--%>
        <link href="Css/Cuestionario_Estilo.css" rel="stylesheet" type="text/css"/>
        <%-- ICONOS TRAIDOS DESDE BOOTSTRAP--%>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css" integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" crossorigin="anonymous">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <%--BOOTSTRAP VERSIÓN ANTERIOR--%>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <%--LIBRERIA PARA FOREACH--%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%-- Fuente de letra--%>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
        <%-- Imagen/iconos almacenados--%>
        <link rel="icon" type="Image/jpg" href="Imagen/Logo1.png">

    </head>
    <body>
        <div class="navbar">
            <div class="imagen">
                <img src="Imagen/Logo1.png" alt=""/>
            </div>
            <h2 class="text-center" id="titulo"><b>CUESTIONARIO</b></h2>
        </div>

        <form action="Principal_Nivel2.jsp" method="post">
            

            <%-- CUESTIONARIO--%>
            <div class="casillas">
                <%
                    Connection con = null;
                    Statement st3 = null;
                    ResultSet rs3 = null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next_level", "root", "");
                    st3 = con.createStatement();
                    System.out.println("Conexion establecida");
                    String sql3 = "SELECT id_pregunta, nom_pregunta FROM preguntas";
                    rs3 = st3.executeQuery(sql3);
                    while (rs3.next()) {
                %>

                <div class="contenedor-textos">
                    <div class="seccion">
                        <div class="pregunta">

                            <h2><b>Pregunta <%= rs3.getInt("id_pregunta")%></b></h2>
                            <label><%= rs3.getString("nom_pregunta")%></label>
                        </div>

                        <div class="respuesta">

                            <%
                                Statement st = null;
                                ResultSet rs = null;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next_level", "root", "");
                                st = con.createStatement();
                                System.out.println("Conexion establecida");
                                String sql = "Select id_respuesta, descri_respuesta from respuestas";
                                rs = st.executeQuery(sql);


                            %> 

                            <select id="inputState" class="form-control" name="jcb_Respuestas">
                                <option/>Seleccione una opcion</option>                

                                <%                        while (rs.next()) {
                                %>

                                <option value="<%=rs.getInt("id_respuesta")%>"><%=rs.getString("descri_respuesta")%></option>

                                <%
                                    }
                                %>

                            </select>
                        </div>
                    </div>
                </div>
            
            <%
                }
            %>
            </div>
            
            <div class="boton">
                <button type="submit" name="accion" value="" >Ingresar</button>
            </div>
        </form>  
            
        <%--Footer--%>
        <footer>
            <div class="contenedor-footer">
                <h2 class="titulo-footer">NEXT LEVEL</h2>
                <h2 class="subtitulo-footer">Software de Gestión de Auditoria</h2>
            </div>
        </footer>
    </body>
</html>




