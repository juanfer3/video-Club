/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;
import BaseDeDatos.ControlBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author adsi
 */
@WebServlet(name = "RegistrarPelicula", urlPatterns = {"/RegistrarPelicula"})
public class RegistrarPelicula extends HttpServlet {

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
            
            String nombre, duracion, genero,calificacion, disponibilidad, empleado, cantidad;
            int ejemplares,r;
            
            nombre = request.getParameter("nombre") ;
            genero = request.getParameter("genero") ;
            duracion = request.getParameter("duracion") ;            
            calificacion = request.getParameter("calificacion") ;
            disponibilidad = request.getParameter("disponibilidad") ;
            cantidad = request.getParameter("ejemplares") ;
            ejemplares= Integer.parseInt(cantidad);
            empleado = request.getParameter("empleados") ;
            
            r=control.RegistrarPelicula(nombre, genero, duracion, calificacion, disponibilidad, ejemplares, empleado);
            if(r!=0){
            
                
            out.println("ingreso correcto");
                
            }else{
            
            
                response.sendRedirect("error.jsp");
            }
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrarPelicula</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrarPelicula at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
