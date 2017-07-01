<%-- 
    Document   : login
    Created on : 4/03/2017, 11:31:43 AM
    Author     : adsi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="bootstrap/css/diseno.css">
        
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="js/fun.js"></script>
        <script src="js/funimg.js"></script>
    </head>

    <body>
        <%@include file="jsp/header.jsp" %>
        <div class="container">
            <form class="formulariopeliculas col-md-12  col-md-offset-4" action="InsertarPelicula" enctype="MULTIPART/FORM-DATA" method="POST" id="formulario">


                <div class="form-group col-md-12">
                    <label for="text">Nombre:</label>
                    <input type="text" class="form-control" id="nombre"  name="nombre">
                </div>
                
                


                <div class="form-group col-md-12">
                    <label for="genero" >Genero</label>
                    <select name="genero" id="genero">
                        <option value="drama">Drama</option>
                        <option value="accion">Accion</option>
                        <option value="comedia">Comedia</option>
                        <option value="terror">Terror</option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="duracion">Duracion:</label>
                    <input type="text" class="form-control" id="duracion"  name="duracion">
                </div>

                <div class="form-group col-md-12">
                    <label for="calificacion" >Calificacion</label><br>

                    <select name="calificacion">
                        <option value="excelente">Exelente</option>
                        <option value="bueno">Bueno</option>
                        <option value="regular">Regular</option>
                        <option value="mala">Mala</option>
                    </select>
                </div>


                
                <div class="form-group">
                    <label for="text">Estado:</label>
                    <select name="estado">
                        <option value="Disponible">Disponible</option>
                        <option value="Prestado">Prestado</option>
                        <option value="Dañada">Mala</option>
                        <option value="Reservada">Reservada</option>
                    </select>
                </div>
                <div class="form-group col-md-12">

                    <label for="ejemplares" >Ejemplare</label><br>
                    <input type="text" name="ejemplares">
                </div>
               
                <div class="form-group">
                    <label for="text">Insertar imagen</label>
                    <input type="file" class="form-control" id="file"  name="file"  id="imagen" >
                </div>


                
                <div class="form-group col-md-12">
                    <button type="submit" class="btn-primary boton" id="aceptar" >Registrar</button>
                </div>

            </form>
        </div>
        <%@include file="jsp/footer.jsp" %>
        <script type="text/javascript" src="bootstrap/js/ft.js"></script>
    </body>
</html>
