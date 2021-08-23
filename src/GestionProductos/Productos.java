
package GestionProductos;

public class Productos {
   
    private String id;
    private String nombre;
    private String marca;
    private String categoría;
    private String precio;
    private String Cantidad_Disponible;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad_Disponible() {
        return Cantidad_Disponible;
    }

    public void setCantidad_Disponible(String Cantidad_Disponible) {
        this.Cantidad_Disponible = Cantidad_Disponible;
    }
  
}
