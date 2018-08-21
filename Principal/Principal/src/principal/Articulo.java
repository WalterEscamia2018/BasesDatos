
package principal;


public class Articulo {
    
    private String nombreArticulo;
    private double precio;
    private String codigo;
   

    public Articulo(String nombreArticulo, double  precio, String codigo ) {
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.codigo = codigo;      
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public void setPrecio(double  precio) {
        this.precio = precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public double  getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }
    
}
