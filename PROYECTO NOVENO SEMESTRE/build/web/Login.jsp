<%-- 
    Document   : Login
    Created on : 12/05/2022, 10:07:11 AM
    Author     : LAURA
--%>

<%@page import="java.sql.*"%>
<%@page import="Modelo.Encriptar" %>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Login--%>
        <link href="Css/Login_Estilo.css" rel="stylesheet" type="text/css"/>
        <%-- Fuente de letra--%>
        <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@300;400;700&display=swap" rel="stylesheet">
        <%--Libreria iconos--%>
        <script src="https://kit.fontawesome.com/8e68de781a.js" crossorigin="anonymous"></script>
        <%-- Imagen/iconos almacenados--%>
        <link rel="icon" type="image/jpg" href="Imagen/Logo1.png">

        <%--PLUGIN MOSTRAR CONTRASEÑA--%>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" integrity="sha256-h20CPZ0QyXlBuAw7A+KluUYx/3pK+c7lYEpqLTlxjYQ=" crossorigin="anonymous" />
        <script>src = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css"</script>


        <%--MOSTRAR CONTRASEÑA --%>
        <script>
            window.addEventListener("load", function () {

                // icono para mostrar contraseña
                showPassword = document.querySelector('.show-password');
                showPassword.addEventListener('click', () => {

                    // elementos input de tipo clave
                    password1 = document.querySelector('.password1');
                    password2 = document.querySelector('.password2');

                    if (password1.type === "text") {
                        password1.type = "password"
                        password2.type = "password"
                        showPassword.classList.remove('fa-eye-slash');
                    } else {
                        password1.type = "text"
                        password2.type = "text"
                        showPassword.classList.toggle("fa-eye-slash");
                    }

                })

            });
        </script>

    </head>
    <body>

        <main class="contenedor" >

            <div class="contenedor-imagen">
                <img src="Imagen/Logo NL 1 1.svg" alt="" class="img">
            </div>

            <form action="Auditor_Roles?accion=verificar" method="POST">

                <div class="contenedor-textos">

                    <h1>INICIO DE SESIÓN</h1>

                    <div class="grupo">
                        <input type="text" name="txt_User" id="txt_User" required><span class="barra"></span>
                        <label for="">Usuario</label>
                    </div>

                    <div class="grupo">
                        <input type="password" name="txt_Pass" id="txt_Pass" class="password1" required><span class="barra"></span>
                        <label for="">Contraseña</label>
                        <span class="fa fa-fw fa-eye password-icon show-password"></span>
                    </div>

                      

                    <%
                        Connection con = null;
                        Statement st = null;
                        ResultSet rs = null;
                        Encriptar enc = new Encriptar();
                        if (request.getParameter("verificar") != null) {
                            String user = request.getParameter("txt_User");
                            String pass = request.getParameter("txt_Pass");
                            HttpSession sesion = request.getSession();

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next_level", "root", "");
                                st = con.createStatement();
                                rs = st.executeQuery("Select * from auditor where nick='" + user + "' and contraseña='" + enc.getMD5(pass) + "' ;");
                                while (rs.next()) {
                                    sesion.setAttribute("logueado", "1");
                                    sesion.setAttribute("user", rs.getString("nick"));
                                    sesion.setAttribute("id", rs.getString("id_auditor"));
                                }
                    %>
                   
                    <div>
                        <div class="alert alert-danger" role="alert"> Usuario y/o contraseña incorrectos</div>
                    </div>
                    
                    <%
                            } catch (Exception e) {
                            
                                out.print(e);

                            }
                        }
                    %>

                    
                    <button type="submit" name="verificar" value="Verificar" >Ingresar</button>
                   
                    <nav>
                        <a href="Recuperar.jsp">Has olvidado tu contraseña...</a>
                    </nav>
                    
                </div>

                     
                    
            </form>

        </main>
    </body>
</html>
