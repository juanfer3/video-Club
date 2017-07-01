/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import BaseDeDatos.DBPeliculas;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.commons.fileupload.FileItem;
//import org.apache.commons.fileupload.FileItemFactory;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Juan
 */
@WebServlet(name = "InsertarPelicula", urlPatterns = {"/InsertarPelicula"})
public class InsertarPelicula extends HttpServlet {

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

//            FileItemFactory File_Archivo =new DiskFileItemFactory();
//            ServletFileUpload sfu=new ServletFileUpload(File_Archivo);
//            
//            ArrayList<String> campos = new ArrayList();
////            ArrayList<String> img= new ArrayList();
//            String dir= null;
//            try {
//                
//                List items=sfu.parseRequest(request);
//                for(int i=0;i<items.size();i++){
//                    FileItem item=(FileItem) items.get(i);
//                if(!item.isFormField()){
//                    System.err.println(item.getName()+"aqui entra");
//                    File archivo=new File("C:\\Users\\Juan\\Documents\\NetBeansProjects\\Prestamo de peliculas\\web\\img\\"+item.getName());
//                    item.write(archivo);
////                    img.add("img/"+item.getName());
//                    dir="img/"+item.getName();
//                    
//                }else{
//                    campos.add(item.getString());
//                
//                   
//                }
//                
//                
//                
//                }
//                
//                
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//                    
//            
//            
//            
//            DBPeliculas peli= new DBPeliculas();
////            String nombre, duracion, genero,calificacion, disponibilidad, empleado,ref_pelicula,estado,img,ejemplares1;
//            int ejemplares;
//            boolean validar=false;
//            System.out.println("nombre= "+campos.get(0));
//            System.out.println("genero= "+campos.get(1));
//            System.out.println("duracion= "+campos.get(2));
//            System.out.println("clasificacion= "+campos.get(3));
//            System.out.println("estado= "+campos.get(4));
//                       
//            ejemplares=Integer.parseInt(campos.get(5));
//            System.out.println("ejemplares= "+ejemplares);
//            System.out.println("img= "+dir);
//            validar=peli.InsertarPelicula(campos.get(0),campos.get(1),campos.get(2),campos.get(3),campos.get(4),ejemplares,dir);
//            
//            if(validar=true){
//            
//                out.println("Insercion Correcta y el se almaceno la imagen ");
//            
//            
//            }else{
//            
//            
//                out.println("Insercion Incorrecta");
//            
//            }
////            ref_pelicula=request.getParameter("ref_pelicula");
////            nombre=request.getParameter("nombre");
////            genero=request.getParameter("genero");
////            duracion=request.getParameter("duracion");
////            calificacion=request.getParameter("calificacion");
////            disponibilidad=request.getParameter("disponibilidad");
////            estado=request.getParameter("estado");
////            ejemplares1=request.getParameter("ejemplares");
////            ejemplares=Integer.parseInt(ejemplares1);
////            img=request.getParameter("img");
////            
////            validar=peli.InsertarPelicula(ref_pelicula, nombre, genero, duracion, calificacion, disponibilidad, estado, ejemplares, img);
////            if(validar==true){
////            
////            out.println("yhea!!!");
////            
////            }else{
////            out.println("nonono");
////            
////            }
//            
//            
//            
////            out.println("</html>");
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
