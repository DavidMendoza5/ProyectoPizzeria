package modelo;

/**
 *
 * @author Gema
 */
public class Persona {
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;

    
    //Constructor
    public Persona(String nombre, String apellidoPat, String apellidoMat) {
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
    }

    
    //Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    
    //Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidopat=" + apellidoPat + ", apellidomat=" + apellidoMat + '}';
    }
    
}
