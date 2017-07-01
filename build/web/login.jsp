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
        <link rel="stylesheet" href="img">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script></script>
    </head>

    <body>
        <%@include file="jsp/header.jsp" %>
        <div class="container">
            <div class="formulariologinDiv">
        <form class="formuladiologin" action="ValidarLoguin">

            <div class="loginentradas">
                
                <label for="usuario" >Nombre</label><br>
                <input type="text" name="usuario" class="texto">

                <label for="clave" >Contraseña</label><br>
                <input type="password" name="clave">
                
                <div class="aceptarlogin">
                    <button type="submit" class="btn-primary boton"><h6>Ingresar</h6></button>
                    
                </div>
                <div class="cancelarlogin">
                <button type="submit" class="btn-primary boton"><h6>Cancelar</h6></button>
                    
                </div>
                
            </div>
            
             
            
        </form>
            </div>
        </div>v
        <%@include file="jsp/footer.jsp" %>
        <script type="text/javascript" src="bootstrap/js/ft.js"></script>
    </body>
</html>
