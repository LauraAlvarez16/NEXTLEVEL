<%-- 
    Document   : Documentos
    Created on : 12/05/2022, 10:22:41 AM
    Author     : LAURA
--%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Documentos</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Registro--%>
        <link href="Css/Ingresar_Documentos.css" rel="stylesheet" type="text/css"/>
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
                    <h2><b>REGISTRA TUS EVIDENCIAS</b></h2>
                </div>

                <%--INICIO FORMULARIO AUDITADOS--%>
                <form action="Ingresar_Documentos.jsp" method="post">

                    <div class="informacion">

                       


                            <%--METODO DE INSERCIÓN--%>

                            <%

                                if (request.getParameter("guardar") != null) {
                                    String codigo = request.getParameter("txt_Codigo");
                                    String nom_doc = request.getParameter("txt_Nombre");
                                    String detalle = request.getParameter("txta_Detalle");
                                    String tipo = request.getParameter("jcb_Tipo");
                                    String categoria = request.getParameter("jcb_Categoria");
                                    String version = request.getParameter("txt_Version");
                                    String fecha = request.getParameter("datec_Fecha");
                                    byte[] ruta = request.getParameter("btn_Ruta").getBytes();
                                    String area = request.getParameter("jcb_Area");
                                    String auditoria = request.getParameter("jcb_Auditoria");

                                    Connection con = null;
                                    Statement st = null;
                                    ResultSet rs = null;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st = con.createStatement();

                                    System.out.println("Conexion establecida");

                                    try {

                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                        st = con.createStatement();
                                        st.executeUpdate("INSERT INTO documentos(id_doc,nombre_doc,detalle,tipo_doc,categoria,version,fecha,ruta_doc,id_area,id_auditoria) VALUES('" + codigo + "','" + nom_doc + "','" + detalle + "','" + tipo + "','" + categoria + "','" + version + "','" + fecha + "','" + ruta + "','" + area + "','" + auditoria + "');");

                                        request.getRequestDispatcher("Tabla_Documentos.jsp").forward(request, response);
                                        
                                    } catch (Exception e) {
                                        out.print(e);
                                    }
                                }

                            %>

                        
                        <div class="texto">
                            <%--COLUMNA 1--%>
                            <div class="right1">
                                

                                <div class="form-group">
                                    <label for="codigo">Codigo:</label>
                                    <input type="text" class="form-control" id="codigo" name="txt_Codigo" placeholder="Codigo" required>
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
                                
                                 <div class="form-group">
                                    <label for="fecha" class="control-label col-xs-4">Fecha:</label>                 
                                    <input type="date"  pattern="^\d{2}-\d{2}-\d{4}$" name="datec_Fecha" id="fecha" class="form-control" value="" maxlength="10" placeholder="dd-MM-yyy" required/>
                                </div>

                               

                                <div class="form-group">
                                    <label for="archivo">Seleccionar documento:</label>
                                    <input type="file" class="btn" id="archivo" name="btn_Ruta" value="" required>
                                </div> 


                            </div>

                            <%--COLUMNA 2--%>
                            <div class="right2">
                               
                                
                                <div class="form-group">
                                    <label for="nombre">Nombre:</label>
                                    <input type="text" class="form-control" id="nombre" name="txt_Nombre" placeholder="Nombre" required>
                                </div>
                                
                                <div class="form-group">
                                    <label for="tipo">Tipo:</label>
                                    <select id="lista" class="form-control" name="jcb_Tipo" required>

                                        <option>PDF</option>
                                        <option>WORD</option>
                                        <option>EXCEL</option>
                                        <option>IMAGEN</option>
                                        <option>PPTX</option>


                                    </select>
                                </div>

                                <div class="form-group">
                                    <label for="version">Versión:</label>
                                    <input type="text" class="form-control" id="version" name="txt_Version" placeholder="Versión" required>
                                </div>
                                
                                

                                

                               

                            </div>
                            
                             <%--COLUMNA 3--%>
                            <div class="right3">
                                
                                <div class="form-group">
                                <label for="inputState">Auditoria:</label>


                                <%
                                    
                                    Statement st2 = null;
                                    ResultSet rs2 = null;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/next3", "root", "");
                                    st2 = con.createStatement();
                                    System.out.println("Conexion establecida");
                                    String sql2 = "Select id_auditoria, titulo from ejecucion_auditoria";
                                    rs2 = st2.executeQuery(sql2);


                                %> 
                               
                                <select id="inputState" class="form-control" name="jcb_Auditoria">
                                    <option/>Seleccione una auditoria</option>
                                
                                    <%                                   
                                        while (rs2.next()) {
                                    %>

                                    <option value="<%=rs2.getInt("id_auditoria")%>"><%=rs2.getString("titulo")%></option>
                                   
                                    <%
                                        }
                                    %>
                                </select>
                            </div>
                                
                                
                                <div class="form-group">
                                    <label for="categoria">Categoria:</label>
                                    <select id="lista" class="form-control" name="jcb_Categoria" required>

                                        <option>Contrato</option>
                                        <option>Cartas</option>
                                        <option>Actas</option>
                                        <option>Manuales</option>
                                        <option>Notas</option>
                                        <option>Acuerdos</option>
                                        <option>Reportes</option>
                                        <option>Registros</option>
                                        

                                    </select>
                                </div>
                                
                                 <div class="form-group">
                                    <label for="detalle">Detalle:</label>
                                    <textarea  class="form-control" id="detalle" rows="3" cols="" name="txta_Detalle" placeholder="Escribe aqui de que trata el documento..." required></textarea>
                                </div>
                                
                            </div>
                            
                            
                            
                        </div>
                    </div>

                    <div class="boton">
                        <button type="submit" name="guardar" class="btn btn-primary">Guardar <i class="bi bi-file-earmark-medical-fill"></i></button>
                    </div>

                </form>
            </div>      
        </div>
    </body>

</html>
