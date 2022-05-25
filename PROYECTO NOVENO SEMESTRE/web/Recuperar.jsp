<%-- 
    Document   : Recuperar
    Created on : 22/05/2022, 09:21:12 PM
    Author     : LAURA
--%>
<%@page import="Modelo.Auditor"%>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperacion</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Login--%>
        <link href="Css/Recuperar_Estilo.css" rel="stylesheet" type="text/css"/>
        <%-- Fuente de letra--%>
        <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@300;400;700&display=swap" rel="stylesheet">
        <%--Libreria iconos--%>
        <script src="https://kit.fontawesome.com/8e68de781a.js" crossorigin="anonymous"></script>
        <%-- Imagen/iconos almacenados--%>
        <link rel="icon" type="image/jpg" href="Imagen/Logo1.png">


        <script>
            function ventanaSecundaria(URL) {
                ventana = window.open(URL, "ventana1", "width=550,height=300,left=400px,scrollbars=NO");

            }


        </script>
    </head>
    <body>

        <form  action="Recuperar.jsp"  method="post">


            <div class="contenedor-textos">

                <h1>RECUPERACION DE CONTRASEÑA</h1>

                <div class="grupo">
                    <input type="text" name="txt_User" id="name" required><span class="barra"></span>
                    <label for="">Usuario</label>
                </div>

                <div class="grupo">

                    <input type="email" id="exampleInputEmail1" name="txt_Correo" aria-describedby="emailHelp" required><span class="barra"></span>
                    <label for="exampleInputEmail1">Correo</label>
                </div>

                <%
                    String nick;
                    if (request.getParameter("accion") != null) {

                        nick = request.getParameter("txt_User");
                        String boton = request.getParameter("accion");
                        
                        boolean exite = false;
                        Connection con = null;
                        Statement st = null;
                        ResultSet rs = null;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                        st = con.createStatement();
                        System.out.println("Conexion establecida");
                        String sql = "SELECT * FROM auditor where nick = '" + nick + "'";
                        rs = st.executeQuery(sql);
                        if (rs.next()) {
                            if (rs.getRow() > 0) {

                                exite = true;

                %>

                <div class="alert alert-success" role="alert">
                    Usuario encontrado en el sistema, diríjase a su correo e ingrese el codigo en este <a href="javascript:ventanaSecundaria('http://localhost:8080/ProyectoIntegrador9Linea/Codigo_Correo.jsp')" class="alert-link">link</a>.
                </div>
                <tbody>
                    <jsp:include page="Verificacion"/> 
                </tbody>

                <%                    }
                } else {
                %>

                <div>
                    <div class="alert alert-danger" role="alert">El usuario no se encuentra registrado en el sistema</div>

                </div>

                <%
                        }
                    }


                %>
                <button type="submit" name="accion" value="" >Enviar</button>

            </div>

        </form>
    </body>
</html>

