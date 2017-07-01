<%-- 
    Document   : header
    Created on : 4/03/2017, 09:23:24 AM
    Author     : adsi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% HttpSession sesion=  request.getSession();

    if(sesion.getAttribute("rol")==null){
%>
<header class="cabecera">
    <a href="#"> <span class="icon-menu" id="boton"></span> </a>
        </header>
<div class="container titulo">
        <h1>Inside Prestamos de peliculas</h1>
        </div>
<div class="entrar">
    <a href="#" id="login"><span class="icon-hombre"></span> </a>
</div>
<hr class="raya">



<header class="menu" id="menu">
    <h5>bienvenido nulo</h5>
        <hr>
    <ul class="lista">
        
        <li class="menu-item"><a href="RegistrarEmpleado.jsp">
            Empleados</a>
        </li>
        <li class="menu-item"><a href="RegistrarPelicula.jsp">
            Peliculas</a>
        </li>
        <li class="menu-item"><a href="#">
            Insertar</a>
        </li>
        
        
    </ul>
</header>
    
<%}else if(sesion.getAttribute("rol").equals("adm")){%>
<header class="cabecera">
    <a href="#"> <span class="icon-menu" id="boton"></span> </a>
        </header>
<div class="container titulo">
        <h1>Inside Prestamos de peliculas</h1>
        </div>
<div class="entrar">
    <a href="#" id="login"><span class="icon-sign-in"></span> </a>
</div>
<hr class="raya">



<header class="menu" id="menu">
    <h5>bienvenido adm</h5>
        <hr>
    <ul class="lista">
        
        <li class="menu-item"><a href="#">
            Buscar</a>
        </li>
        <li class="menu-item"><a href="#">
            Mi Perfil</a>
        </li>
        <li class="menu-item"><a href="#">
            Insertar</a>
        </li>
        
        
    </ul>
</header>
<%}else if(sesion.getAttribute("rol").equals("Vendedora")){%>
<header class="cabecera">
    <a href="#"> <span class="icon-menu" id="boton"></span> </a>
        </header>
<div class="container titulo">
        <h1>Inside Prestamos de peliculas</h1>
        </div>
<div class="entrar">
    <a href="#" id="login"><span class="icon-sign-in"></span> </a>
</div>
<hr class="raya">





<header class="menu" id="menu">
    <h5>bienvenida Vendedora</h5>
        <hr>
    <ul class="lista">
        
        <li class="menu-item"><a href="#">
            Buscar</a>
        </li>
        <li class="menu-item"><a href="#">
            Mi Perfil</a>
        </li>
        <li class="menu-item"><a href="#">
            Insertar</a>
        </li>
        
        
    </ul>
</header>
<%}%>