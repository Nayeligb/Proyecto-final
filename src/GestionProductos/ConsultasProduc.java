
package GestionProductos;

import GestionUsuarios.Conexion;
import GestionUsuarios.SqlConsultas;
import GestionUsuarios.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultasProduc extends Conexion{
    
    public boolean registroproductos(Productos prd) throws SQLException  {
        PreparedStatement prst = null;
        Connection con = getConexion();
        String insert = "INSERT INTO registroproductos(Nombre, Marca ,Categoría ,Precio, Cantidad_Disponible) VALUES(?,?,?,?,?)";

        try {
            prst = con.prepareStatement(insert);
            prst.setString(1, prd.getNombre());
            prst.setString(2, prd.getMarca());
            prst.setString(3, prd.getCategoría());
            prst.setString(4, prd.getPrecio());
            prst.setString(5, prd.getCantidad_Disponible()); 
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

        String sql = "SELECT id, nombreUsuario, contrasena, nombre FROM registros WHERE nombreUsuario = ?";

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
