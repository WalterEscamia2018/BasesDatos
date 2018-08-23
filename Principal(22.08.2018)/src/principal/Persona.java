
package principal;


public class Persona {
    private String nombre;
    private String identidad;
    private String direccion;

    public Persona(String nombre, String identidad, String direccion) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public String getDireccion() {
        return direccion;
    }

    
}
