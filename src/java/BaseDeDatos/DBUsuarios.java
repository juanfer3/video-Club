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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class DBUsuarios {

    public boolean RegistroUser(String usuario, String contrasena) {
        ConectarDB db = new ConectarDB();
        Connection con = db.conectar();
        int r = 0;
        String habilitado = "si";
        String sql;
        sql = "INSERT INTO usuarios(usuario,contrasena,habilitado) VALUES(?,?,?);";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            pst.setString(3, habilitado);
            r = pst.executeUpdate();

            if (r != 0) {

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
    
    public int SearchIdUser(String usuario, String contrasena) {
        Usuarios user=new Usuarios();
        ConectarDB db = new ConectarDB();
        Connection con = db.conectar();
        int r = 0;
        String habilitado = "si";
        String sql;
        sql = "SELECT * FROM usuarios WHERE usuario='"+usuario+"' AND contrasena='"+contrasena+"';";

        try {
            Statement st = con.createStatement();
           
           
            
            ResultSet rs= st.executeQuery(sql);

            if (rs.next()) {
                
                user.setId(rs.getInt(1));
                

            }
           user.getId();
            st.close();
                con.close();
                db.cierraConexion();
                
        } catch (SQLException ex) {
            Logger.getLogger(DBEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user.getId();
    }
    
    
}
