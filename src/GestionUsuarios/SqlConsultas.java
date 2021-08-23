
package GestionUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SqlConsultas extends Conexion{
    
    public boolean registrousuarios(Usuarios usr) throws SQLException  {
        PreparedStatement prst = null;
        Connection con = getConexion();
        String insert = "INSERT INTO registrousuarios(NombreUsuario, Nombre ,Apellido ,Correo, Telefono, Contraseña) VALUES(?,?,?,?,?,?)";

        try {
            prst = con.prepareStatement(insert);
            prst.setString(1, usr.getNombreUsuario());
            prst.setString(2, usr.getNombre());
            prst.setString(3, usr.getApellido());
            prst.setString(4, usr.getCorreo());
            prst.setString(5, usr.getTelefono());
            prst.setString(6, usr.getPassword());
            prst.execute();

            return true;

        } catch (SQLException ex) {

            Logger.getLogger(SqlConsultas.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }
    }

    public boolean Log(Usuarios usr) throws SQLException {
        PreparedStatement prst = null;
        ResultSet res = null;
        Connection con = getConexion();

        String sql = "SELECT id, NombreUsuario, contraseña, nombre FROM registrousuarios WHERE NombreUsuario = ?";

        try {
            prst = con.prepareStatement(sql);
            prst.setString(1, usr.getNombreUsuario());
            res = prst.executeQuery();

            if (res.next()) {

                if (usr.getPassword().equals(res.getString(3))) {
                    usr.setId(res.getInt(1));
                    usr.setNombre(res.getString(4));

                    return true;
                } else {

                    return false;
                }
            }

            return false;

        } catch (SQLException ex) {

            Logger.getLogger(SqlConsultas.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }
    }
    
}
