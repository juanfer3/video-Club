<%-- 
    Document   : file
    Created on : 24/05/2017, 06:26:58 PM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="imagenes">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="js/funimg.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="POST" enctype="multipart/form-data" class="formulario" action="../Control/AgregarNC.php">

<input type="file" id="archivo" name="archivo[]" /><a id="archivoadicional"><i class="icon-plus-sign"></i></a>

</form>  
    </body>
</html>
