<%-- 
    Document   : login
    Created on : 4/03/2017, 11:31:43 AM
    Author     : adsi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="bootstrap/css/diseno.css">
        <link rel="stylesheet" href="img">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.js"></script> 
        <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.0/css/bootstrapValidator.min.css"/>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.0/js/bootstrapValidator.min.js"></script>
        
        <script src="js/func.js"></script>
        
        <style type="text/css">

        </style>
    </head>

    <body>
        <%@include file="jsp/header.jsp" %>
        <div class="container containerFormularioEmpleado">
            <form  action="InsertarUsuario"  class="col-md-12 col-md-offset-5" id="FormularioRegistroEmpleado" name="formulario" method="POST">


                <div class="loginentradas  ">


                    <h1>Formulario de registro</h1>
                    <p>por favor diligencie todos los datos.</p>


                    <div class="form-group col-md-12">
                        <label class="control-label">Usuario</label>                           
                        <input type="text" name="usuario" class="form-control" id="usuario" style="display: inline-block">   
                    </div>


                    <div class="form-group col-md-12 " >
                        <label class=" control-label">Contraseña</label>

                        <input type="password" name="contrasena" class="form-control" id="contrasena">

                    </div>

                    <div class="form-group col-md-12" >
                        <label class="  control-label">rol</label>

                        <input type="text" name="rol" class="form-control" id="rol">

                    </div>



                    <div class="form-group col-md-12">
                        <label class=" control-label">Nombre</label>

                        <input type="text" name="nombre" class="form-control" id="nombre">

                    </div>


                    <div class="form-group espacio col-md-12">
                        <label class=" control-label">Cedula</label>

                        <input type="text" name="cedula" class="form-control" id="cedula">

                    </div>
                    <div id="mensajes"></div>
                    <div class="col-md-offset-7">

                        <input type="submit" class="btn btn-success"
                               value="ingresar" id="aceptarUser">
                    </div>


                </div>








            </form>
        </div>
        <%@include file="jsp/footer.jsp" %>
        <script type="text/javascript" src="bootstrap/js/ft.js"></script>
    </body>
</html>
