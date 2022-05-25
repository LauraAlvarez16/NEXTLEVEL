<%-- 
    Document   : Crud_Auditor
    Created on : 20/05/2022, 11:18:16 AM
    Author     : LAURA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Auditados</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Registro--%>
        <link href="Css/Crud_Auditor_Estilo.css" rel="stylesheet" type="text/css"/>
        <%-- ICONOS TRAIDOS DESDE BOOTSTRAP--%>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css" integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" crossorigin="anonymous">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <%--BOOTSTRAP VERSIÓN ANTERIOR--%>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

        <%-- Fuente de letra--%>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
        <%-- Imagen/iconos almacenados--%>
        <link rel="icon" type="Image/jpg" href="Imagen/Logo1.png">


    </head>
    <body>
        <h2 class="text-center" id="titulo"><b>AUDITOR</b></h2>


        <div class="container mt-5">

            <div class="row mt-2">


                <div class="col-sm">

                    <form  action="Crud_Auditor.jsp" method="get">

                        <%--FUNCIÓN DE BUSCAR--%>

                        <div class="Buscar">
                            <div class="texto">
                                <input type="text" name="txt_Buscar" class="form-control" placeholder="Buscar"/>

                            </div>

                            <div class="boton_buscar">
                                <input type="submit" value="Buscar" name="btn_Buscar" class="form-control btn btn-primary"/>

                            </div>

                        </div>
                        <div class="scrolltable">
                            <table  class="table table-hover table-light" style="white-space: nowrap;overflow:scroll">
                                <thead>

                                    <tr>



                                        <th scope="col" colspan="6" class="text-center"></th>

                                        <th></th>

                                        <th scope="col" class="text-right">
                                            <a  href="Crud_Auditor.jsp"><i class="fa fa-refresh fa-2x fa-spin" aria-hidden="true"></i><a>
                                                    </th>

                                                    <th scope="col" class="text-center">
                                                        <a  href="Registro_Auditor.jsp"><i class="fa fa-user-plus fa-2x" aria-hidden="true"></i></a>
                                                    </th>

                                                    </tr>
                                                    <tr>
                                                        <th scope="col" class="text-center">ID</th>
                                                        <th scope="col" class="text-center">NOMBRE</th>
                                                        <th scope="col" class="text-center">APELLIDO</th>
                                                        <th scope="col" class="text-center">CORREO</th>
                                                        <th scope="col" class="text-center">CARGO</th>
                                                        <th scope="col" class="text-center">SECTOR</th>
                                                        <th scope="col" class="text-center">NIVEL</th>
                                                        <th scope="col" class="text-center">USUARIO</th>
                                                        <th scope="col" class="text-center">ACCIONES</th>
                                                    </tr>
                                                    </thead>
                                                    <tbody>
                                                        <jsp:include page="Auditores"/> 
                                                    </tbody>
                                                    </table>
                                                    </div>
                                                    </form>
                                                    </div>
                                                    </div>
                                                    </div>
                                                    </body>

                                                    </html>
