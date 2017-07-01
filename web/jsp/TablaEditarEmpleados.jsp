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


<script src="js/TablaEdicionEmpleados.js"></script>

<div class="listaEmpleados">
    <h1></h1>
        <table class="rwd-table col-md-12 col-md-offset-6"  border="1" >
            <%DBEmpleados emp = new DBEmpleados();
                    ArrayList<Empleados> Listar = new ArrayList();
                    Listar.clear();
                    
                    String id1;
                    int id;
                    
                    id1 = request.getParameter("id");
                    id = Integer.parseInt(id1);
                    
                    
                    Listar=emp.BucarEmpleadosPorId(id);
                    int cont=1;
                %>
                <%for (Empleados myemp : Listar) {%>
        <tr>
            
            <th>Nombre:</th>
            <td data-th="Movie Title"><%=myemp.getNombre()%> </td>
            
            
            
            
        </tr>
        
        <tbody>
            
        <tr>
            <th>Cedula</th>
            
            <td data-th="Genre"><%=myemp.getCedula()%> </td>
            
        </tr>
         
         <tr>
             <th>Usuario</th>
             <td data-th="Movie Title"><input class="form-control" value="<%=myemp.getUsuarioId().getUsuario() %>"></td>
             
         </tr>
         <tr>
             <th>Rol</th>
             <td data-th="Movie Title"><input class="form-control" value="<%=myemp.getRol() %>"></td>
             
         </tr>
         
         <%}%>
        </tbody>
        
        </table>
        <div class="col-md-3">
            
            <button class="btn btn-success" id="aceptarEdicion"></button>
            
        </div>
    <p>&larr; Drag window (in editor or full page view) to see the effect. &rarr;</p>
</div>

    
    

