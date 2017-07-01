/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import BaseDeDatos.DBEmpleados;
import BaseDeDatos.DBUsuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Juan
 */
@WebServlet(name = "InsertarUsuario", urlPatterns = {"/InsertarUsuario"})
public class InsertarUsuario extends HttpServlet {

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

            DBEmpleados emp = new DBEmpleados();
            DBUsuarios user = new DBUsuarios();

            boolean validarUser = false;
            boolean validarEmp = false;

            String nombre, rol, cedula, usuario, contrasena;
            nombre = request.getParameter("nombre");
            rol = request.getParameter("rol");
            cedula = request.getParameter("cedula");
            usuario = request.getParameter("usuario");
            contrasena = request.getParameter("contrasena");

            validarUser = user.RegistroUser(usuario, contrasena);
            if (validarUser == true) {
                int id;
                id = user.SearchIdUser(usuario, contrasena);
                validarEmp = emp.RegistroEmpleado(nombre, cedula, rol, id);
                if (validarEmp == true) {
                    out.println("Insercion Exitosa");
                }
            } else if (validarUser == false) {

                out.println("Error en la insercion");

            } else {

                out.println("Cargando");

            }

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
