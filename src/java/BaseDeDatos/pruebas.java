/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

/**
 *
 * @author ALEJANDRA MOLINA
 */
public class pruebas {

    public static void main(String[] args) {
            
//        ConectarDB con = new ConectarDB();
        ControlBD control= new ControlBD();
//        if (con == null) {
//
//            System.out.println("Hay problemas en la conexion");
//
//        }else{
//        

        DBUsuarios user= new DBUsuarios();
            String usuario;
            String contrasena;
            String rol; 
            String nombre; 
            String habilitado;
            int cedula;
            int r=0;
            usuario="camila";
            contrasena="123";
           
          
            r=user.SearchIdUser(usuario, contrasena);
            System.out.println(user.SearchIdUser(usuario, contrasena));
            System.out.println(user.SearchIdUser(usuario, contrasena));
            System.out.println(user.SearchIdUser(usuario, contrasena));
            if(r==0){
            
                System.out.println("no se inserto ");
            
            
            }else{
            
            
                System.out.println("Bienvenido Señor Villadiego "+ r);
                
                
            }
//            else{
//            
//                System.out.println("usuario o contraseña invalida");
//            
//            }
//            
//            }
//        
//        
//        }

// eliminar empleado
//    String nombre="ju";
//    control.EliminarEmpleado(nombre);


//int id=4;
//control.EditarUsuario(id, usuario, contrasena, rol, nombre, cedula);
            }
    }

