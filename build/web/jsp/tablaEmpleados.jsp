<%-- 
    Document   : tablaEmpleados
    Created on : 21/03/2017, 07:36:11 PM
    Author     : ALEJANDRA MOLINA
--%>
<%@page import="BaseDeDatos.Empleados"%>
<%@page import="java.util.ArrayList"%>
<%@page import="BaseDeDatos.DBEmpleados"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="bootstrap/css/diseno.css">
<link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
<!--div class="tabla">
    <form action="EliminarEmpleado">
        <table class="" border="1">
            <thead><th>ID</th><th>USUARIO</th><th>CONTRASENA</th><th>ROL</th><th>NOMBRE</th><th>CEDULA</th><th>EDITAR</th><th>ELIMINAR</th><th>VER DETALLE</th></thead>
            <tbody>
                
                <tr>
                    <td></label></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>

                    <td><a href="#"<button class="icon-pencil" type="submit" value="editar" name="botones"></button></a></td>
                    <td><a href="#"><span class="icon-heart"></span></a></td>


                    <td></td>
                </tr>
               
            </tbody>
            <tfoot><tr><td colspan="9" style="text-align: center">Inside Prestamo De Peliculas</td></tr></tfoot>
        </table>

    </form>
            
</div-->
<div class="listaEmpleados">
    <h1></h1>
        <table class="rwd-table col-md-12 col-md-offset-6"  border="1" >
        <tr>
            <th>#</th>
            <th>Nombre</th>
            <th>Cedula</th>
            <th>Usuario</th>
            <th>rol</th>
            <th></th>
            <th>Ver</th>
            <th>Editar</th>
            <th>Eliminar</th>
        </tr>
        
        <tbody>
            <%DBEmpleados emp = new DBEmpleados();
                    ArrayList<Empleados> Listar = new ArrayList();
                    Listar.clear();
                    Listar=emp.ListarEmpleados();
                    int cont=1;
                %>
                <%for (Empleados rs : Listar) {%>
        <tr>
            <td data-th="Movie Title"><%=cont%></td>
            <td data-th="Genre"><%=rs.getNombre()%></td>
            <td data-th="Year"><%=rs.getCedula()%></td>
            <td data-th="Gross"><%=rs.getUsuarioId().getUsuario()%></td>
            <td data-th="Year"><%=rs.getRol()%></td>
            <td><p class="id" style="visibility: hidden"><%=rs.getId()%></p></td>
            <td><a href="#"><span class="icon-biblioteca iconostabla ver"></span></a></td>
            <td><a href="#"><span class="icon-pencil iconostabla editar"></span></a></td>
            <td><a href="#"><span class="icon-trash-4 iconostabla eliminar"></span></a></td>
        </tr>
         <%cont+=1;}%>
        
        </tbody>
    </table>

    <p>&larr; Drag window (in editor or full page view) to see the effect. &rarr;</p>
</div>




