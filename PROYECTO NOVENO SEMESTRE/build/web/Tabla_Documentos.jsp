<%-- 
    Document   : Listar_Documentos
    Created on : 12/05/2022, 10:21:54 AM
    Author     : LAURA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Documentos</title>
        <%-- Libreria de bootstrap--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <%--Redirección estilos Registro--%>
        <link href="Css/Listar_Documentos_Estilo.css" rel="stylesheet" type="text/css"/>
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
        <h2 class="text-center" id="titulo"><b>DOCUMENTOS</b></h2>

        <div class="container mt-5">

            <div class="row mt-2">

                <div class="col-sm">

                    <form  action="Tabla_Documentos.jsp" method="get">

                        <%--FUNCIÓN DE BUSCAR--%>

                        <div class="Buscar">

                            <div class="texto">
                                <input type="text" name="txt_Buscar" class="form-control" placeholder="Buscar"/>

                            </div>

                            <div class="boton_buscar">
                                <input type="submit" value="Buscar" name="btn_Buscar" class="form-control btn btn-primary"/>

                            </div>

                        </div>

                        <table  class="table table-hover table-light" style="white-space: nowrap;overflow-x:auto">
                            <thead>

                                <tr>

                                    <th scope="col" colspan="8" class="text-center"></th>

                                    <th></th>

                                    <th scope="col" class="text-center">
                                        <a  href="Tabla_Documentos.jsp"><i class="fa fa-refresh fa-2x fa-spin" aria-hidden="true"></i><a>
                                                </th>


                                                <th scope="col" class="text-center">
                                                    <a  href="Ingresar_Documentos.jsp"<i class="fa fa-file-text fa-2x" aria-hidden="true"></i></a>
                                                </th>

                                                </tr>
                                                <tr>
                                                    <th scope="col" class="text-center">ID</th>
                                                    <th scope="col" class="text-center">NOMBRE</th>
                                                    <th scope="col" class="text-center">DETALLE</th>
                                                    <th scope="col" class="text-center">TIPO</th>
                                                    <th scope="col" class="text-center">CATEGORÍA</th>
                                                    <th scope="col" class="text-center">VERSIÓN</th>
                                                    <th scope="col" class="text-center">FECHA</th>
                                                    <th scope="col" class="text-center">RUTA</th>
                                                    <th scope="col" class="text-center">ÁREA</th>
                                                    <th scope="col" class="text-center">AUDITORÍA</th>
                                                    <th scope="col" class="text-center">ACCIONES</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                    <jsp:include page="S_Documentos"/> 
                                                </tbody>
                                                </table>
                                                </form>
                                                </div>
                                                </div>
                                                </div>

                                                </body>
                                                </html>
