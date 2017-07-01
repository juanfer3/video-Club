<%-- 
    Document   : listarEmpleados
    Created on : 21/03/2017, 07:48:03 PM
    Author     : ALEJANDRA MOLINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="bootstrap/css/diseno.css">
        <link rel="stylesheet" href="img">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="java/alertify.min.js"></script>
        <!-- include alertify.css -->
        <link rel="stylesheet" href="estilos/alertify.core.css">
        <link rel="stylesheet" href="estilos/alertify.default.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <script src="js/TablaEmpleadosFunc.js"></script>
    </head>
    <body>
        
         <%@include file="jsp/header.jsp" %>
         <div class="container tabla tablaEmpleados">
         
         <%@include file="jsp/tablaEmpleados.jsp" %>
         </div>
         <%@include file="jsp/footer.jsp" %>
        <script type="text/javascript" src="bootstrap/js/ft.js"></script>
    </body>
</html>
