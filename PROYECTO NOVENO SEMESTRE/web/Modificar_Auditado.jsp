<%-- 
    Document   : Modificar_Auditado
    Created on : 12/05/2022, 10:21:33 AM
    Author     : LAURA
--%>
<%@page import="java.sql.*"%>
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
        <link href="Css/Modificar_Auditado_Estilo.css" rel="stylesheet" type="text/css"/>
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

        <%

            Connection con = null;
            PreparedStatement ps;
            ResultSet rs;
            String id = request.getParameter("id");
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
            ps = con.prepareStatement("SELECT * FROM usuario where id_usuario=" + id);
            rs = ps.executeQuery();
            while (rs.next()) {


        %>

        <div class="container">

            <div class="contact-box">

                <div class="titulo">
                    <h2><b>MODIFICAR AUDITADOS</b></h2>
                </div>

                <%--INICIO FORMULARIO AUDITADOS--%>
                <form action="Modificar_Auditado.jsp" method="post">

                    <div class="informacion">

                        <div class="left">


                            <img src="Imagen/Modificar_Auditado.png" alt="" class="img"/>

                            

                            <%--METODO DE MODIFICAR--%>

                            <%                                
                                String nom_usu = request.getParameter("txt_Nombre");
                                String ape_usu = request.getParameter("txt_Apellido");
                                String cif_niif = request.getParameter("txt_Cif");
                                String correo_usu = request.getParameter("txt_Correo");
                                String tel_usu = request.getParameter("txt_Telefono");
                                String area = request.getParameter("jcb_Area");
                                String cargo_usu = request.getParameter("txt_Cargo");

                                if (nom_usu != null && ape_usu != null && cif_niif != null && correo_usu != null && tel_usu != null && area != null && cargo_usu != null) {

                                    try {

                                        ps = con.prepareStatement("UPDATE usuario SET nombre_usuario='" + nom_usu + "',apellido_usuario='" + ape_usu + "',cif_niif='" + cif_niif + "',correo_usuario='" + correo_usu + "',telefono_usuario='" + tel_usu + "',id_area='" + area + "',cargo_usuario='" + cargo_usu + "'WHERE id_usuario='" + id + "';");
                                        ps.executeUpdate();
                                        response.sendRedirect("Crud_Auditados.jsp");
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
                                <input type="text" class="form-control" id="nombre" value="<%= rs.getString("nombre_usuario")%>" name="txt_Nombre" placeholder="Nombre" required>
                            </div>

                            <div class="form-group">
                                <label for="cif_niif">Cif_Niif:</label>
                                <input type="text" class="form-control" id="cif_niif" value="<%= rs.getString("cif_niif")%>" name="txt_Cif" placeholder="Cif_Niif" pattern="[[A-H][J-N][P-S]UVW][0-9]{7}[0-9A-J]" title="Por favor ingrese el formato predeterminado" required>
                            </div>

                            <div class="form-group">
                                <label for="telefono">Telefono:</label>
                                <input type="tel" class="form-control" id="telefono" value="<%= rs.getString("telefono_usuario")%>" name="txt_Telefono" placeholder="Telefono" pattern="[0-9]{7,10}" title="Por favor ingresar solo Números" required>
                            </div>

                            <div class="form-group">
                                <label for="cargo">Cargo:</label>
                                <input type="text" class="form-control" id="cargo" value="<%= rs.getString("cargo_usuario")%>" name="txt_Cargo" placeholder="Cargo" required>
                            </div>

                        </div>
                        <%--COLUMNA 2--%>
                        <div class="right2">

                            <div class="form-group">
                                <label for="apellido">Apellido:</label>
                                <input type="text" class="form-control" id="apellido" value="<%= rs.getString("apellido_usuario")%>" name="txt_Apellido" placeholder="Apellido" required>
                            </div>

                            <div class="form-group">
                                <label for="exampleInputEmail1">Correo:</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" value="<%= rs.getString("correo_usuario")%>" name="txt_Correo" aria-describedby="emailHelp" placeholder="email@example.com" required>
                            </div>



                            <div class="form-group">
                                <label for="inputState">Área</label>


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

                                    
                                    String sql = "SELECT area.id_area, nombre_area, id_usuario FROM area LEFT JOIN usuario ON usuario.id_area = area.id_area WHERE usuario.id_usuario =" + id;
                                    rse = st.executeQuery(sql);
                                    String sql2 = "Select id_area, nombre_area from area";
                                    rss = st2.executeQuery(sql2);

                                %> 

                                <select id="inputState" class="form-control" name="jcb_Area">

                                    <%                                        while (rss.next()) {
                                            while (rse.next()) {
                                    %>

                                    <option selected value="<%=rse.getInt("id_area")%>"><%=rse.getString("nombre_area")%></option>

                                    <%                                            }

                                    %>

                                    <option value="<%=rss.getInt("id_area")%>"><%=rss.getString("nombre_area")%></option>

                                    <%                                            
                                        }
                                    %>

                                </select>
                            </div>


                        </div>
                    </div>


                    <div class="boton">
                        <button type="submit" name="enviar" class="btn btn-primary">Modificar <i class="bi bi-person-check-fill"></i></button>
                        <input type="hidden" name="id" value="<%= rs.getInt("id_usuario")%>">
                    </div>

                </form>
            </div>      
        </div>
        <%}%>
    </body>
</html>
