package GestionProductos;

import GestionUsuarios.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CRUDProduc {

    private PreparedStatement ps;
    private Conexion con;

    public CRUDProduc() {
        ps = null;
        con = new Conexion();
    }

    public int Eliminar(String Id) {

        String sql = "DELETE FROM registroproductos  WHERE Id = '" + Id + "'";
        int res = 0;
        try {
             ps = con.getConexion().prepareStatement(sql);
            
            res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
            }

        } catch (Exception e) {
            System.err.println("Error al eliminar" + e.getMessage());
        } 
        return res;
    }

    public int Editar(String id, String nombre, String marca, String categoria, String precio, String cantidad) {

       
        String sql = "UPDATE registroproductos SET Nombre= '" + nombre + "' ,Marca='" + marca + "' ,Categoría='" + categoria + "' ,Precio='" + precio + "' ,Cantidad_Disponible='" + cantidad + "' WHERE Id = '" + id + "'";
        int res = 0;

        try {
             ps = con.getConexion().prepareStatement(sql);
            
            res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Producto actualizado");
            }

        } catch (Exception e) {
            System.err.println("Error al actualizar" + e.getMessage());
        } 
        return 0;
    }
}