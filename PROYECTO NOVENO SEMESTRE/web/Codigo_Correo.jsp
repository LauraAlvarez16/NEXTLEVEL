<%-- 
    Document   : Codigo_Correo
    Created on : 23/05/2022, 12:38:11 PM
    Author     : LAURA
--%>

<%@page import="java.awt.Window"%>
<%@page import="Modelo.Correo_Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Codigo Correo</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Login--%>
        <link href="Css/Codigo_Estilo.css" rel="stylesheet" type="text/css"/>
        <%-- Fuente de letra--%>
        <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@300;400;700&display=swap" rel="stylesheet">
        <%--Libreria iconos--%>
        <script src="https://kit.fontawesome.com/8e68de781a.js" crossorigin="anonymous"></script>
        <%-- Imagen/iconos almacenados--%>
        <link rel="icon" type="image/jpg" href="Imagen/Logo1.png">

        <script>
            function ventanaSecundaria2(URL) {
                window.open(URL, "ventana2", "width=1200,height=600,left=100px,scrollbars=NO")
            }

        </script>

    </head>
    <body>


        <form action="Codigo_Correo.jsp" method="post">
            <div class="contenedor-textos">

                <h1>VERIFICAR CODIGO</h1>

                <div class="grupo">
                    <input type="text" name="authcode" id="name" required><span class="barra"></span>
                    <label for="">Ingresar codigo</label>
                </div>

               
                <%
                     
                     
                    if (request.getParameter("verificar") != null) {
                        Correo_Usuario user = (Correo_Usuario) session.getAttribute("authcode");
                       
                        String code = request.getParameter("authcode");

                        if (code.equals(user.getCodigo())) {
                            

                %>

                <div class="alert alert-success" role="alert">
                    ¡Es Correcto!, dirijase a <a href="javascript:ventanaSecundaria2('http://localhost:8080/ProyectoIntegrador9Linea/Cambiar_Contraseñas.jsp')" class="alert-link">Contraseña</a>.
                </div>

                <%                } else {
                %>

                <div>
                    <div class="alert alert-danger" role="alert">Código de verificación incorrecto</div>

                </div>
                <%
                        }
                    }
                %>

                <div class="grupo">
                    <button type="submit" name="verificar" value="verify" >Verificar</button>
                </div>

            </div>
        </form>
    </body>
</html>
