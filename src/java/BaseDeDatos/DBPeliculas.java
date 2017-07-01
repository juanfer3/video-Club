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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class DBPeliculas {

    public boolean InsertarPelicula(
            String nombre,
            String genero, String duracion, String calificacion,
            String estado, int ejemplares, String img) {

        ConectarDB db = new ConectarDB();
        Connection con = db.conectar();
        int r = 0;
        String habilitado = "si";
        String sql = "INSERT INTO peliculas(nombre,genero,duracion,calificacion,estado,ejemplares,img,habilitado)VALUES(?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, nombre);
            pst.setString(2, genero);
            pst.setString(3, duracion);
            pst.setString(4, calificacion);
            pst.setString(5, estado);
            pst.setInt(6, ejemplares);
            pst.setString(7, img);
            pst.setString(8, habilitado);
            r = pst.executeUpdate();

            if (r != 0) {
                pst.close();
                con.close();
                db.cierraConexion();
                return true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public ArrayList ListarPeliculas() {

        ConectarDB db = new ConectarDB();
        Connection con = db.conectar();
        ArrayList<Peliculas> Listar = new ArrayList();
        Listar.clear();
        int r = 0;
        String habilitado = "si";
        String sql = "Select * from peliculas;";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                
                Peliculas mypeli = new Peliculas();
                mypeli.getId();
                mypeli.getCalificacion();
                mypeli.getDuracion();
                mypeli.getEjemplares();
                mypeli.getEstado();
                mypeli.getGenero();
                mypeli.getHabilitado();
                mypeli.getImg();
                mypeli.getNombre();
                
                Listar.add(mypeli);

            }
            pst.close();
            con.close();
            db.cierraConexion();

        } catch (SQLException ex) {
            Logger.getLogger(DBPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Listar;
    }

}
