<%-- 
    Document   : ListarRegistros
    Created on : 5/03/2017, 09:07:15 AM
    Author     : adsi
--%>

<%@page import="java.sql.*"%>
<%@page import="BaseDeDatos.ControlBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%ControlBD control=new ControlBD();   

    


%>
<div class="tabla">
    <form action="ListarEmpleados">
<table class="" border="1">
    <thead><th>Nombre</th><th>Genero</th><th>Duracion</th><th>Calificacion</th><th>Disponibilidad</th><th>Ejemplares</th><th>Empleado</th></thead><%--cabecera de la tabla--%>
<tbody>
    <%ResultSet r=(ResultSet)request.getAttribute("listar"); 
    
    while(r.next()){%>
   
    <tr><%--columna--%>
        <td ><%= r.getString(1) %></td> <%--filas--%>
        <td><%= r.getString(2) %></td><%--filas--%>
        <td><%= r.getString(3) %></td><%--filas--%>
        <td><%= r.getString(4) %></td><%--filas--%>
        <td><%= r.getString(5) %></td><%--filas--%>
        <td><%= r.getInt(6) %></td><%--filas--%>
        <td><%= r.getString(7) %></td><%--filas--%>
    </tr>
    <%}%>
</tbody>
<tfoot><tr><td colspan="7" style="text-align: center">Inside Prestamo De Peliculas</td></tr></tfoot>
</table>
    </form>
</div>

