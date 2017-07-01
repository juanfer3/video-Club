/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import BaseDeDatos.ControlBD;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ALEJANDRA MOLINA
 */
@WebServlet(name = "AcepatarEdicionEmpleado", urlPatterns = {"/AcepatarEdicionEmpleado"})
public class AcepatarEdicionEmpleado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ControlBD control=new ControlBD();
            
            int cedulas,id,lista;
            lista=0;
            String usuario, contrasena, rol, nombre, cedula,id1;
            id1=request.getParameter("id");
            id=Integer.parseInt(id1);
            usuario=request.getParameter("usuario");
            contrasena=request.getParameter("contrasena");
            rol=request.getParameter("rol");
            nombre=request.getParameter("nombre");
            cedula=request.getParameter("cedula");
            cedulas=Integer.parseInt(cedula);
            lista=control.EditarUsuario(id, usuario, contrasena, rol, nombre, cedulas);
            
                ResultSet rs=control.ListarEmpleados();
                request.setAttribute("listarEmpleados", rs);
                RequestDispatcher rd=request.getRequestDispatcher("listarEmpleados.jsp");
                rd.forward(request, response);
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
