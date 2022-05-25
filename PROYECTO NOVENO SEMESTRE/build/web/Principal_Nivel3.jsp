<%-- 
    Document   : Principal_Nivel3
    Created on : 20/05/2022, 12:52:37 PM
    Author     : LAURA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<%
if (session.getAttribute("nivel3") != null){
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nivel 3</title>
        <%-- Libreria de bootstrap--%>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
        
        <%--Redirección estilos Principal--%>
        <link href="Css/Principal3_Estilo.css" rel="stylesheet" type="text/css"/>
        <%-- Fuente de letra--%>
        <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@300;400;700&display=swap" rel="stylesheet">
        <%--Libreria iconos--%>
        
        <%--ICONOS FONTAWESOME--%>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">


        <%-- Imagen/iconos almacenados--%>
        <link rel="icon" type="image/jpg" href="Imagen/Logo1.png">
    </head>
    <body>
        <div class="hero">
            <%-- Barra superior--%>
            <div class="navbar">
                <a href="Login.jsp" ><b>Cierre de Sesion</b><img src="Imagen/Perfil.png" alt=""/></a>
            </div>

            <%-- Informacion Superior--%>
            <div class="banner">
                <h1><b>BIENVENIDO</b></h1>
                <p>"Mejora las practicas con funciones especialmente diseñadas para <br>
                    verificar y validar el cumplimiento de las labores"
                </p>
            </div>

            <%-- Opciones--%>
            <div class="contenedor">
                
                <%-- Cuadro 1--%>
                <div class="cuadro">
                    <div class="funciones">
                        <a href="Quienes_Somos.jsp"><img src="Imagen/Quienes_somos.png" alt=""/>
                            <div class="titulo">
                                <h4><b>Quienes Somos</b></h4>
                            </div>
                            <div class="descripcion">
                                <p>Encontraras la Mision, Vision, <br>
                                    y Politicas de la Organización.
                                </p>
                            </div>
                        </a>
                    </div>
                </div>

                
                <%-- Cuadro 2--%>
                <div class="cuadro">
                    <div class="funciones">
                        <img src="Imagen/Auditados.png" alt=""/>
                        <div class="titulo">
                            <h4><b>Información</b></h4>
                        </div>
                        <div class="descripcion">
                            <p>Informacion con respecto <br>
                                a las evidencias.
                            </p>
                        </div>
                        <div class="links">
                            <a href="Crud_Auditados.jsp"><b>Auditados <i class="bi bi-people"></i></b></a></li>
                        <a href="Tabla_Documentos.jsp"><b>Documentos <i class="bi bi-file-earmark-medical"></i></b></a></li>
                        </div>
                    </div>
                </div>

                <%-- Cuadro 3--%>
                <div class="cuadro">
                    <div class="funciones">
                        <a href="Plantillas.jsp"><img src="Imagen/Inspección.png" alt=""/>
                            <div class="titulo">
                                <h4><b>Inspección</b></h4>
                            </div>
                            <div class="descripcion">
                                <p>Aqui encuentras plantillas<br>
                                    para realizar las auditorias.<br> 
                                    las auditorias.
                                </p>
                            </div>
                        </a>
                    </div>
                </div>

                
            </div>
        </div>

        <%-- Footer o Parte Inferior--%>
        <footer>
            <div class="main-content" id="Footer">
                <div class="left box">
                    <h2>NEXT LEVEL</h2>
                    <div class="content">
                        <p>Software de Gestión de Auditoria</p>
                    </div>
                </div>
                <div class="rigt box">
                    <h2>Contactanos</h2>
                    <div class="content">
                        <div class="place">
                            
                            <span class="text"><i class="bi bi-geo-alt-fill"></i> Fusagasugá, Colombia</span>
                        </div>
                        <div class="phone">
                            
                            <span class="text"><i class="bi bi-telephone-fill"></i> +57 320-879-1391</span>
                        </div>
                        <div class="email">
                            
                            <span class="text"><i class="bi bi-envelope-open-fill"></i> NextLevel@gmail.com</span>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
<%
}else{
response.sendRedirect("Login.jsp");
}
%>