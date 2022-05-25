<%-- 
    Document   : Plantillas
    Created on : 12/05/2022, 10:22:10 AM
    Author     : LAURA
--%>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plantilla</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Registro--%>
        <link href="Css/Plantillas_Estilo.css" rel="stylesheet" type="text/css"/>
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
                    <h2><b>PLANTILLAS</b></h2>
                </div>


                <form action="Plantillas.jsp" method="post">




                    <%

                        if (request.getParameter("siguiente") != null) {
                            String valor = request.getParameter("flexRadioDefault");
                            request.getRequestDispatcher(valor).forward(request, response);
                        }

                    %> 

                    <div class="informacion">

                        <div class="form-group" >
                            <input class="form-check-input" value="Cuestionario.jsp" type="radio" name="flexRadioDefault" id="flexRadioDefault1" required>
                            <label class="form-check-label" for="flexRadioDefault1">
                                <b>Auditoria interna ISO 27001:2013</b>
                            </label>
                        </div>

                        <div class="form-group">
                            <input class="form-check-input" type="radio" name="flexRadioDisabled" id="flexRadioDisabled" disabled>
                            <label class="form-check-label" for="flexRadioDisabled">
                                <b> Auditoria interna ISO 9001:2008</b>
                            </label>
                        </div>

                        <div class="form-group">
                            <input class="form-check-input" type="radio" name="flexRadioDisabled" id="flexRadioDisabled" disabled>
                            <label class="form-check-label" for="flexRadioDisabled">
                                <b> Evaluación de competencia operativa </b>
                            </label>
                        </div>

                    </div>

                    <%--PREGUNTAS GENERALES--%>
                    <div class="contenedor-general">

                        <div class="general">
                            <h2><b>Datos de la auditoria</b></h2>
                        </div>

                       

                            <%                            if (request.getParameter("siguiente") != null) {
                                    //Datos generales
                                    String titulo = request.getParameter("txt_Titulo");
                                    String auditor = request.getParameter("jcb_Auditor");
                                    String fecha = request.getParameter("datec_Fecha");
                                    String auditado = request.getParameter("jcb_Usuario");

                                    Connection con = null;
                                    Statement st = null;

                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();

                                    System.out.println("Conexion establecida");
                                    System.out.println(titulo);
                                    System.out.println(auditor);
                                    System.out.println(auditado);
                                    System.out.println(fecha);

                                    try {

                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                        st = con.createStatement();

                                        st.executeUpdate("INSERT INTO ejecucion_auditoria(titulo,id_auditor,fecha_auditoria,id_usuario) VALUES('" + titulo + "','" + auditor + "','" + fecha + "','" + auditado + "');");

                                        request.getRequestDispatcher("Ingresar_Documentos.jsp").forward(request, response);

                                    } catch (Exception e) {
                                        out.print(e);
                                    }
                                }

                            %>

                            <div class="preguntas">

                                <div class="form-group">
                                    <label for="titulo">Titulo:</label>
                                    <input class="form-control" id="auditoria" name="txt_Titulo" placeholder="Titulo" required>
                                </div>

                                <div class="form-group">
                                    <label for="inputState">Auditor</label>
                                    <%                                Connection con = null;
                                        Statement ste = null;
                                        ResultSet rse = null;
                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                        ste = con.createStatement();
                                        System.out.println("Conexion establecida");
                                        String sql = "Select id_auditor, nombre_auditor, apellido_auditor from auditor";
                                        rse = ste.executeQuery(sql);


                                    %> 

                                    <select id="inputState" class="form-control" name="jcb_Auditor">
                                        <option/>Seleccione el Auditor</option>
                                        <%                        while (rse.next()) {
                                        %>

                                        <option value="<%=rse.getInt("id_auditor")%>"> <%=rse.getString("nombre_auditor")%></option>

                                        <%
                                            }
                                        %>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <label for="fecha" class="control-label col-xs-4">Fecha:</label>                 
                                    <input type="date"  pattern="^\d{2}-\d{2}-\d{4}$" name="datec_Fecha" id="fecha" class="form-control" value="" maxlength="10" placeholder="dd-MM-yyy" required/>
                                </div>


                                <div class="form-group">
                                    <label for="inputState">Auditado</label>
                                    <%
                                        Statement st1 = null;
                                        ResultSet rs1 = null;
                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                        st1 = con.createStatement();
                                        System.out.println("Conexion establecida");
                                        String sql1 = "Select id_usuario, nombre_usuario,apellido_usuario from usuario";
                                        rs1 = st1.executeQuery(sql1);


                                    %> 

                                    <select id="inputState" class="form-control" name="jcb_Usuario">
                                        <option/>Seleccione un Usuario</option>

                                        <%                                        while (rs1.next()) {
                                        %>

                                        <option value="<%=rs1.getInt("id_usuario")%>"><%=rs1.getString("nombre_usuario")%></option>

                                        <%
                                            }
                                        %>
                                    </select>
                                </div>

                         
                        </div>
                    </div>


                    <div class="boton">
                        <button type="submit" name="siguiente"  class="btn btn-primary"><b>Continuar <i class="bi bi-person-plus"></i></b></button>
                    </div>



                </form>

            </div>  
        </div>

    </body>

</html>
