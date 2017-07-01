/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class DBEmpleados {
    public boolean RegistroEmpleado(String nombre, String cedula,String rol,int usuario_id){
    ConectarDB db=new ConectarDB();
    Connection con= db.conectar();
    int r=0;
    String habilitado="si";
    String sql;
    sql="INSERT INTO empleados(rol, nombre, cedula, usuario_id,habilitado) VALUES(?,?,?,?,?);";
    
    
        try {
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, rol);
            pst.setString(2, nombre);
            pst.setString(3, cedula);
            pst.setInt(4, usuario_id);
            pst.setString(5, habilitado);
            r=pst.executeUpdate();
            
            if(r!=0){
            
                
                
            pst.close();
            con.close();
            db.cierraConexion();
            return true;
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    return false;
    }
    
    public ArrayList ListarEmpleados(){
    ConectarDB db=new ConectarDB();
    Connection con= db.conectar();
    ArrayList<Empleados> Listar=new ArrayList();
    Listar.clear();
    String habilitado="si";
    
    String sql;
    sql="SELECT empleados.id, empleados.rol, empleados.nombre, empleados.cedula,usuarios.usuario from  usuarios inner join empleados on usuarios.id = empleados.usuario_id WHERE empleados.habilitado <= ?; ";
    
    
        try {
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, habilitado);
         
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
            Empleados emp=new Empleados();
            Usuarios user=new Usuarios();
            
            emp.setId(rs.getInt("id"));
            emp.setRol(rs.getString("rol"));
            emp.setNombre(rs.getString("nombre"));
            emp.setCedula(rs.getString("cedula"));
            user.setUsuario(rs.getString("usuario"));
            
            emp.setUsuarioId(user);
            
            Listar.add(emp);
            
            }
            pst.close();
            con.close();
            db.cierraConexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    return Listar;
    }
    
    public ArrayList BucarEmpleadosPorId(int id){
    ConectarDB db=new ConectarDB();
    Connection con= db.conectar();
    ArrayList<Empleados> Listar=new ArrayList();
    Listar.clear();
    String habilitado="si";
    
    String sql;
    sql="SELECT empleados.id, empleados.rol, empleados.nombre, empleados.cedula,usuarios.usuario from  usuarios inner join empleados on usuarios.id = empleados.usuario_id WHERE empleados.id <= ? AND empleados.habilitado <= ?; ";
    
    
        try {
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, habilitado);
            
         
            ResultSet rs=pst.executeQuery();
            
            if(rs.next()){
            Empleados emp=new Empleados();
            Usuarios user=new Usuarios();
            
            emp.setId(rs.getInt("id"));
            emp.setRol(rs.getString("rol"));
            emp.setNombre(rs.getString("nombre"));
            emp.setCedula(rs.getString("cedula"));
            user.setUsuario(rs.getString("usuario"));
            
            emp.setUsuarioId(user);
            
            Listar.add(emp);
            
            }
            pst.close();
            con.close();
            db.cierraConexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    return Listar;
    }
    
    
    
}
