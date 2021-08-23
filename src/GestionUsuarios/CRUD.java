
package GestionUsuarios;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class CRUD {
    
    public void Eliminar(int Id) {
        
        Conexion conec = new Conexion();
           String sql = "delete from registrousuarios.NombreUsuario where Id = "+Id;

           PreparedStatement prep = null;
          try{
            prep = conec.getConexion().prepareStatement(sql);
             prep.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void Editar(Usuarios usr) {

        Conexion conec = new Conexion();
        String sql = "UPDATE registrousuarios SET NombreUsuario =?, Nombre=? ,Apellido=? ,Correo=?, Telefono=?, Contraseña=? WHERE Id=?;";
        PreparedStatement prep = null;
        try {
            prep = conec.getConexion().prepareStatement(sql);
            prep.setString(1, usr.getNombreUsuario());
            prep.setString(2, usr.getPassword());
            prep.setString(3, usr.getNombre());
            prep.setString(4, usr.getApellido());
            prep.setString(5, usr.getTelefono());
            prep.setString(6, usr.getCorreo());
            prep.setInt(7, usr.getId());
            prep.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
