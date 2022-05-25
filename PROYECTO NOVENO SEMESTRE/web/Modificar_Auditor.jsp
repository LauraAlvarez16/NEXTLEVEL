<%-- 
    Document   : Modificar_Auditor
    Created on : 20/05/2022, 10:52:19 PM
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
        <title>Modificar Auditados</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Registro--%>
        <link href="Css/Modificar_Auditor_Estilo.css" rel="stylesheet" type="text/css"/>
        <%-- ICONOS TRAIDOS DESDE BOOTSTRAP--%>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css" integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" crossorigin="anonymous">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <%-- Fuente de letra--%>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
        <%-- Imagen/iconos almacenados--%>
        <link rel="icon" type="Image/jpg" href="Imagen/Logo1.png">


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

        <%

            Connection con = null;
            PreparedStatement ps;
            ResultSet rs;
            String id = request.getParameter("id");
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
            ps = con.prepareStatement("SELECT * FROM auditor where id_auditor=" + id);
            rs = ps.executeQuery();
            while (rs.next()) {


        %>

        <div class="container">

            <div class="contact-box">

                <div class="titulo">
                    <h2><b>MODIFICAR AUDITOR</b></h2>
                </div>

                <%--INICIO FORMULARIO AUDITADOS--%>
                <form action="Modificar_Auditor.jsp" method="post">

                    <div class="informacion">

                        <div class="left">


                            <img src="Imagen/Modificar_Auditado.png" alt="" class="img"/>

                            <div class="nivelSeguridad">
                                <span id="nivelseguridad">bajo</span>
                                <div class="nivelesColores">
                                    <div class="spanNivelesColores"></div>
                                </div>
                                <div class="NivelesColores"></div>
                            </div>

                            <%--METODO DE MODIFICAR--%>

                            <%                                
                                String nom = request.getParameter("txt_Nombre");
                                String ape = request.getParameter("txt_Apellido");
                                String cedula = request.getParameter("txt_Cedula");
                                String correo = request.getParameter("txt_Correo");
                                String tel = request.getParameter("txt_Telefono");
                                String cargo = request.getParameter("txt_Cargo");
                                String sector = request.getParameter("txt_Sector");
                                String nick = request.getParameter("txt_Usuario");
                                String pass = request.getParameter("txt_Contra");
                                String nivel = request.getParameter("jcb_Nivel");

                                if (nom != null && ape != null && cedula != null && correo != null && tel != null && cargo != null && sector != null && nick != null && pass != null && nivel != null) {

                                    try {

                                        ps = con.prepareStatement("UPDATE auditor SET nombre_auditor='" + nom + "',apellido_auditor='" + ape + "',cedula_auditor='" + cedula + "',correo_auditor='" + correo + "',telefono_auditor='" + tel + "',cargo_auditor='" + cargo + "',sector_auditor='" + sector + "',nick='" + nick + "',contraseña='" + pass + "',id_niveles='" + nivel + "' WHERE id_auditor='" + id + "';");
                                        ps.executeUpdate();
                                        response.sendRedirect("Crud_Auditor.jsp");
                                    } catch (Exception e) {
                                        out.print(e);
                                    }
                                }


                            %>

                        </div>


                        <%--COLUMNA 1--%>
                        <div class="right1">


                            <div class="form-group">
                                <label for="nombre">Nombre:</label>
                                <input type="text" class="form-control" id="nombre" value="<%= rs.getString("nombre_auditor")%>" name="txt_Nombre" placeholder="Nombre" required>
                            </div>

                            <div class="form-group">
                                <label for="exampleInputEmail1">Correo:</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" value="<%= rs.getString("correo_auditor")%>" name="txt_Correo" aria-describedby="emailHelp" placeholder="email@example.com" required>
                            </div>

                            <div class="form-group">
                                <label for="sector">Sector:</label>
                                <input type="text" class="form-control" id="sector" value="<%= rs.getString("sector_auditor")%>" name="txt_Sector" placeholder="Sector" required>
                            </div>


                            <div class="form-group">
                                <label for="exampleInputPassword1">Contraseña:</label>
                                <input type="password" class="form-control password1" id="claveActual" value="<%= rs.getString("contraseña")%>" name="txt_Contra" placeholder="Password" title="Para que la contraseña sea valida debe tener una longitud entre 12 y 20 caracteres, contener letras mayúsculas y minúsculas, un dígito, o los símbolos " required/> 
                                <span class="fa fa-fw fa-eye password-icon show-password"></span>


                            </div>

                        </div>

                        <%--COLUMNA 2--%>
                        <div class="right2">

                            <div class="form-group">
                                <label for="apellido">Apellido:</label>
                                <input type="text" class="form-control" id="apellido" value="<%= rs.getString("apellido_auditor")%>" name="txt_Apellido" placeholder="Apellido" required>
                            </div>

                            <div class="form-group">
                                <label for="telefono">Telefono:</label>
                                <input type="tel" class="form-control" id="telefono" value="<%= rs.getString("telefono_auditor")%>" name="txt_Telefono" placeholder="Telefono" pattern="[0-9]{7,10}" title="Por favor ingresar solo Números" required>
                            </div>



                            <div class="form-group">
                                <label for="inputState">Nivel</label>


                                <%
                                    
                                    Statement st = null;

                                    Statement st2 = null;
                                    ResultSet rse;
                                    ResultSet rss;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();
                                    st2 = con.createStatement();
                                    System.out.println("Conexion establecida");

                                   String sql = "SELECT auditor.id_niveles, nivel, id_auditor FROM niveles LEFT JOIN auditor ON auditor.id_niveles = niveles.id_niveles WHERE auditor.id_auditor =" + id;
                                    rse = st.executeQuery(sql);
                                    String sql2 = "SELECT id_niveles, nivel FROM niveles";
                                    rss = st2.executeQuery(sql2);

                                %> 

                                <select id="inputState" class="form-control" name="jcb_Nivel">

                                    <%                                        while (rss.next()) {
                                            while (rse.next()) {
                                    %>

                                    <option selected value="<%=rse.getInt("id_niveles")%>"><%=rse.getString("nivel")%></option>

                                    <%                                            }

                                    %>

                                    <option value="<%=rss.getInt("id_niveles")%>"><%=rss.getString("nivel")%></option>

                                    <%                                            
                                        }
                                    %>

                                </select>
                            </div>


                        </div>

                        <%--COLUMNA 3--%>
                        <div class="right3">
                            <div class="form-group">
                                <label for="cedula">Cedula:</label>
                                <input type="text" class="form-control" id="cedula" value="<%= rs.getString("cedula_auditor")%>" name="txt_Cedula" placeholder="Cedula" pattern="[0-9]{8,12}" title="Por favor ingresar solo Números" required>
                            </div>

                            <div class="form-group">
                                <label for="cargo">Cargo:</label>
                                <input type="text" class="form-control" id="cargo" value="<%= rs.getString("cargo_auditor")%>" name="txt_Cargo" placeholder="Cargo" required>
                            </div>

                            <div class="form-group">
                                <label for="usuario">Usuario:</label>
                                <input type="text" class="form-control" id="usuario" value="<%= rs.getString("nick")%>" name="txt_Usuario" placeholder="UserName" required>
                            </div>

                        </div>
                    </div>

                    <div class="boton">
                        <button type="submit" name="enviar" class="btn btn-primary">Modificar <i class="bi bi-person-check-fill"></i></button>
                        <input type="hidden" name="id" value="<%= rs.getInt("id_auditor")%>">
                    </div>

                </form>
            </div>      
        </div>
        <%}%>

    </body>
</html>
