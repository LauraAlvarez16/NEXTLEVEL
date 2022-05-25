<%-- 
    Document   : Cambiar_Contraseñas
    Created on : 23/05/2022, 07:12:34 PM
    Author     : LAURA
--%>
<%@page import="Modelo.Encriptar"%>
<%@page import="Modelo.Correo_Usuario"%>
<%@page import="Modelo.Auditor"%>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cambio de contraseña</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Login--%>
        <link href="Css/Cambiar_Contra_Estilo.css" rel="stylesheet" type="text/css"/>
        <%-- Fuente de letra--%>
        <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@300;400;700&display=swap" rel="stylesheet">
        <%--Libreria iconos--%>
        <script src="https://kit.fontawesome.com/8e68de781a.js" crossorigin="anonymous"></script>
        <%-- Imagen/iconos almacenados--%>
        <link rel="icon" type="image/jpg" href="Imagen/Logo1.png">


        <%--PLUGIN CONTRASEÑA FUERTE--%>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

        <%--PLUGIN MOSTRAR CONTRASEÑA--%>
        <link type="text/css" rel="stylesheet"href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" integrity="sha256-h20CPZ0QyXlBuAw7A+KluUYx/3pK+c7lYEpqLTlxjYQ=" crossorigin="anonymous" />
        <script>src = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css"</script>

        <%--CONTRASEÑA FUERTE--%>
        <script>
            $(function () {
                var pruebas = $(".pruebas"),
                        nivelesColores = $("#nivelesColores"),
                        inputs = $("input"),
                        inputClaveActual = $("#claveActual"),
                        inputRepetirClaveActual = $("#repetirClaveActual"),
                        fieldset = $("fieldset"),
                        nivel;

                function devuelveNivel(esteInput, evento) {
                    var nivelBajo = 8,
                            nivelMedio = 12,
                            nivelAlto = 16,
                            numCaracteres = esteInput.val().length,
                            estaId = esteInput.attr("id"),
                            espanNivelesColores = $(".spanNivelesColores");
                    evento.stopPropagation();
                    limpiarError();
                    if (estaId === "claveActual") {
                        if (numCaracteres > 0 && numCaracteres < nivelBajo) {
                            nivel = "bajo";
                            espanNivelesColores.removeClass().addClass("spanNivelesColores bajo");
                        } else if (numCaracteres >= nivelBajo && numCaracteres < nivelMedio) {
                            nivel = "medio";
                            espanNivelesColores.removeClass().addClass("spanNivelesColores medio");
                        } else if (numCaracteres >= nivelMedio && numCaracteres < nivelAlto) {
                            nivel = "alto";
                            espanNivelesColores.removeClass().addClass("spanNivelesColores alto");
                        } else if (numCaracteres >= nivelAlto) {
                            nivel = "muy alto";
                            espanNivelesColores.removeClass().addClass("spanNivelesColores muyAlto");
                        }
                        if (numCaracteres === 0) {
                            espanNivelesColores.removeClass().addClass("spanNivelesColores");
                        }
                    }
                }

                function comprobarClave(e) {
                    var divClaveCorrecta = $(".clavecorrecta"),
                            espanNivelesColores = $(".spanNivelesColores"),
                            nivelSeguridad = $("#nivelseguridad");
                    e.preventDefault();
                    e.stopPropagation();
                    if (inputClaveActual.val() === inputRepetirClaveActual.val()) {
                        divClaveCorrecta.removeClass("oculto");
                        espanNivelesColores.removeClass().addClass("spanNivelesColores nulo");
                        nivelSeguridad.html("");
                        return true;
                    } else {
                        inputClaveActual.focus();
                        mostrarError();
                        inputs.val("");
                    }
                }
                function mostrarError() {
                    var divError = $(".error"),
                            espanNivelesColores = $(".spanNivelesColores"),
                            nivelSeg = $("#nivelseguridad");
                    divError.removeClass("oculto", 600);
                    nivel = "bajo";
                    nivelSeg.html(nivel);
                    espanNivelesColores.removeClass().addClass("spanNivelesColores nulo");
                }
                function limpiarError() {
                    var divError = $(".error");
                    if (!divError.hasClass("oculto")) {
                        divError.addClass("oculto");
                    }
                }
                $(document).on('keyup', 'input', function (e) {
                    var nivelSeg = $("#nivelseguridad");
                    devuelveNivel($(this), e);
                    nivelSeg.html(nivel);
                });



                inputs.focus(limpiarError);
            });
        </script> 

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
                      
       
        <form  action="Cambiar_Contraseñas.jsp"  method="post">


            <div class="contenedor-textos">
                <%
                
                Connection con = null;
            PreparedStatement ps;
            ResultSet rs;
            Correo_Usuario user = (Correo_Usuario) session.getAttribute("authcode");
            System.out.println("USUARIOCONTRa "+ user.getNombre());
            String nick = user.getNombre();
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
            Encriptar enc = new Encriptar();
                
                %>

               

                <h1>CAMBIO DE CONTRASEÑA</h1>


                <div class="grupo">
                    <input type="password" name="txt_Contra1" id="claveActual" class="password1" required><span class="barra"></span>
                    <label for="">Contraseña</label>
                    <span class="fa fa-fw fa-eye password-icon show-password"></span>
                </div>

                <div class="nivelSeguridad">
                    <span id="nivelseguridad">bajo</span>
                    <div class="nivelesColores">
                        <div class="spanNivelesColores"></div>
                    </div>
                    <div class="NivelesColores"></div>
                </div>

                <div class="grupo">
                    <input type="password" class="password2" name="txt_Contra2" required/><span class="barra"></span>
                    <label for="">Repita su contraseña</label>
                </div>
                
                 <%--METODO DE MODIFICAR--%>

                <%                    
                    
                    
                    
                    String contraseña = request.getParameter("txt_Contra1");

                    if (contraseña != null) {

                        try {

                            ps = con.prepareStatement("UPDATE auditor SET contraseña='" + enc.getMD5(contraseña) + "'WHERE nick='" + nick + "';");
                            ps.executeUpdate();
                %>
                <div class="alert alert-success" role="alert">
                    Se almaceno correctamente, dirijase al inicio de sesión.
                </div>
                <%
                } catch (Exception e) {

                %>
                <div class="alert alert-danger" role="alert">
                    Error al ingresar los datos
                </div>
                <%            out.print(e);
                        }
                    }

                %>

                <div class="grupo">
                    <button type="submit" name="accion">Guardar</button>
                    
                </div>
            </div>

        </form>
        
    </body>
</html>