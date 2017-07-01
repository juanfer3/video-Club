/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALEJANDRA MOLINA
 */
public class ControlBD {

    public boolean ValidarUsuario(String usuario, String contrasena) {

        String sql;
        sql = "SELECT * FROM empleados WHERE USUARIO='" + usuario + "' AND CONTRASENA='" + contrasena + "';";

        ConectarDB bd = new ConectarDB();
        Connection con = bd.conectar();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {

                bd.cierraConexion();
                return true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public int RegistrarPelicula(
            String nombre,
            String genero,
            String  duracion,
            String calificacion,
            String disponibilidad,
            int ejemplares,
            String empleado
            ) {

        int r = 0;
        String habilitado;
        habilitado="si";
        String sql = "INSERT INTO peliculas VALUES('" + nombre + "', '" + genero + "', '" + duracion + "', '" + calificacion + "', '" + disponibilidad + "', '" + ejemplares + "', '" + habilitado + "');";
        ConectarDB bd = new ConectarDB();
        Connection con = bd.conectar();

        Statement st;
        try {
            st = con.createStatement();
            r = st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return r;
    }

    public int RegistrarUsuario(
            String usuario,
            String contrasena,
            String rol,
            String nombre,
            int cedula
            ) {
        int r = 0;
        String habilitado;
        habilitado="si";
        String sql = "INSERT INTO empleados (USUARIO,CONTRASENA, ROL, NOMBRE, CEDULA,HABILITADO) VALUES(?,?,?,?,?,?);";
        ConectarDB bd = new ConectarDB();
        Connection con = bd.conectar();

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            pst.setString(3, rol);
            pst.setString(4, nombre);
            pst.setInt(5, cedula);
            pst.setString(6, habilitado);
            pst.executeUpdate();
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return r;

    }

//    public String[] listacompleta() {
//
//        
//        try {
//            int id1;
//            String nombre, telefono, id;
//            String[] contenido=new String[3];
//            String sql = "SELECT * FROM Empleados;";
//            ConectarDB conn = new ConectarDB();
//            Connection con = conn.conectar();
//            Statement st = con.createStatement();   
//            
//            ResultSet rs = st.executeQuery(sql);
//
//            while (rs.next()) {
//                id1 = rs.getInt("ID");
//                nombre = rs.getString("NOMBRE");
//                telefono = rs.getString("TELEFONO");
//                id=String.valueOf(id1);
//                for (int i = 0; i < contenido.length; i++) {
//                    String  = contenido[i];
//                    
//                }
//            }
//            conn.cierraConexion();
//        } catch (SQLException ex) {
//            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
//       }
//        
//        return contenido; 
//   }
    public int EditarUsuario(int id, String usuario, String contrasena, String rol, String nombre, int cedula ) {

        int r = 0;
        String sql;
        sql = "UPDATE empleados SET USUARIO='" + usuario + "', CONTRASENA='" + contrasena + "', ROL='" + rol + "', NOMBRE='" + nombre + "',CEDULA='"+cedula+"' WHERE ID='"+id+"';";
        ConectarDB bd = new ConectarDB();
        Connection con = bd.conectar();
        try {
            Statement st = con.createStatement();
            r = st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public ResultSet ListarEmpleados() {
        ResultSet rs=null;
        String habilitado="si";
        String sql="SELECT * FROM empleados WHERE HABILITADO='"+habilitado+"';";
        ConectarDB bd = new ConectarDB();
        Connection con = bd.conectar();
        try {
            Statement st = con.createStatement();
            rs= st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
        }return rs;

    }
    public int EliminarEmpleado(String habilitado, String nombre){
    
        int r=0;
        String sql="UPDATE  empleados SET HABILITADO='"+habilitado+"'  WHERE NOMBRE='"+nombre+"'";
        ConectarDB bd = new ConectarDB();
        Connection con = bd.conectar();
        try {
            Statement st = con.createStatement();
            r=st.executeUpdate(sql);
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
        }return r;
    }
   public ResultSet BuscarPornombre(String nombre){
       ResultSet rs=null;
        String sql="SELECT * FROM empleados WHERE NOMBRE='"+nombre+"';";
        ConectarDB bd = new ConectarDB();
        Connection con = bd.conectar();
        try {
            Statement st = con.createStatement();
            rs= st.executeQuery(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
        }return rs;
   
   
   }
   
   public Boolean BuscarPorCedula(int cedula){
       ResultSet rs=null;
        String sql="SELECT * FROM empleados WHERE CEDULA='"+cedula+"';";
        ConectarDB bd = new ConectarDB();
        Connection con = bd.conectar();
        try {
            Statement st = con.createStatement();
            rs= st.executeQuery(sql);
            if(rs.next()){
                bd.cierraConexion();
                return true;
                
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
        }return false;
   
   
   }
   

}
