<%-- 
    Document   : Registrar_Auditado
    Created on : 12/05/2022, 10:21:17 AM
    Author     : LAURA
--%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Auditados</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Registro--%>
        <link href="Css/Ingresar_Auditado_Estilo.css" rel="stylesheet" type="text/css"/>
        <%-- ICONOS TRAIDOS DESDE BOOTSTRAP--%>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css" integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" crossorigin="anonymous">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <%-- Fuente de letra--%>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
        <%-- Imagen/iconos almacenados--%>
        <link rel="icon" type="Image/jpg" href="Imagen/Logo1.png">
    </head>
    <body>


        <div class="container">

            <div class="contact-box">

                <div class="titulo">
                    <h2><b>REGISTRAR AUDITADOS</b></h2>
                </div>

                <%--INICIO FORMULARIO AUDITADOS--%>
                <form action="Registrar_Auditado.jsp" method="post">

                    <div class="informacion">

                        <div class="left">


                            <img src="Imagen/Ingresar_Auditados.png" alt="" class="img"/>

                            <div class="form-check form-switch">
                                <input class="form-check-input" type="checkbox" id="flexSwitchCheckDefault" required>
                                <label class="form-check-label" for="flexSwitchCheckDefault">Los datos personales del usuario seran tratados de acuerdo a las <a href="">políticas</a> 1581 de 2012 y 1377 de 2013* </label> 
                            </div>

                            <%--METODO DE INSERCIÓN--%>

                            <%

                                if (request.getParameter("enviar") != null) {
                                    String nom_usu = request.getParameter("txt_Nombre");
                                    String ape_usu = request.getParameter("txt_Apellido");
                                    String cif_niif = request.getParameter("txt_Cif");
                                    String correo_usu = request.getParameter("txt_Correo");
                                    String tel_usu = request.getParameter("txt_Telefono");
                                    String area = request.getParameter("jcb_Area");
                                    String cargo_usu = request.getParameter("txt_Cargo");

                                    boolean exite = false;
                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();
                                    System.out.println("Conexion establecida");
                                    String sql = "SELECT * FROM usuario  where cif_niif = '" + cif_niif + "'";
                                    rs = st.executeQuery(sql);
                                    if (rs.next()) {
                                        if (rs.getRow() > 0) {
                                            exite = true;
                            %>

                            <div>
                                <div class="alert alert-danger" role="alert"><b>El usuario ya existe en el sistema</b></div>

                            </div>

                            <%
                                        }
                                    } else {

                                        try {

                                            Class.forName("com.mysql.jdbc.Driver");
                                            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                            st = con.createStatement();
                                            st.executeUpdate("INSERT INTO usuario(nombre_usuario,apellido_usuario,cif_niif,correo_usuario,telefono_usuario,id_area,cargo_usuario) VALUES('" + nom_usu + "','" + ape_usu + "','" + cif_niif + "','" + correo_usu + "','" + tel_usu + "','" + area + "','" + cargo_usu + "');");
                                            request.getRequestDispatcher("Crud_Auditados.jsp").forward(request, response);
                                        } catch (Exception e) {
                                            out.print(e);
                                        }
                                    }
                                }
                            %>

                        </div>

                        <%--COLUMNA 1--%>
                        <div class="right1">


                            <div class="form-group">
                                <label for="nombre">Nombre:</label>
                                <input type="text" class="form-control" id="nombre" name="txt_Nombre" placeholder="Nombre" required>
                            </div>

                            <div class="form-group">
                                <label for="cif_niif">Cif_Niif:</label>
                                <input type="text" class="form-control" id="cif_niif" name="txt_Cif" placeholder="Cif_Niif" pattern="[[A-H][J-N][P-S]UVW][0-9]{7}[0-9A-J]" title="Por favor ingresar el formato requerido" required>
                            </div>

                            <div class="form-group">
                                <label for="telefono">Telefono:</label>
                                <input type="tel" class="form-control" id="telefono" name="txt_Telefono" placeholder="Telefono" pattern="[0-9]{7,10}" title="Por favor ingresar solo Números" required>
                            </div>

                            <div class="form-group">
                                <label for="cargo">Cargo:</label>
                                <input type="text" class="form-control" id="cargo" name="txt_Cargo" placeholder="Cargo" required>
                            </div>

                        </div>
                        <%--COLUMNA 2--%>
                        <div class="right2">

                            <div class="form-group">
                                <label for="apellido">Apellido:</label>
                                <input type="text" class="form-control" id="apellido" name="txt_Apellido" placeholder="Apellido" required>
                            </div>

                            <div class="form-group">
                                <label for="exampleInputEmail1">Correo:</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" name="txt_Correo" aria-describedby="emailHelp" placeholder="email@example.com" required>
                            </div>


                            <div class="form-group">
                                <label for="inputState">Área</label>


                                <%
                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();
                                    System.out.println("Conexion establecida");
                                    String sql = "Select id_area, nombre_area from area";
                                    rs = st.executeQuery(sql);


                                %> 
                               
                                <select id="inputState" class="form-control" name="jcb_Area">
                                    <option/>Seleccione un área</option>
                                
                                    <%                                   
                                        while (rs.next()) {
                                    %>

                                    <option value="<%=rs.getInt("id_area")%>"><%=rs.getString("nombre_area")%></option>
                                   
                                    <%
                                        }
                                    %>
                                </select>
                            </div>

                        </div>
                    </div>


                    <div class="boton">
                        <button type="submit" name="enviar" class="btn btn-primary">Guardar <i class="bi bi-person-plus"></i></button>
                    </div>

                </form>
            </div>      
        </div>

    </body>
</html>
