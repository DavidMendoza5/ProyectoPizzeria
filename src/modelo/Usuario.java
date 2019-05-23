
package modelo;

/**
 *
 * @author David
 */
public class Usuario extends Persona{
    private int idUsuario;
    private String tipo;
    private String nombreUsuario;
    private String contraseña;
    
    
    //Constructor
    public Usuario(int idUsuario, String nombre, String apellidoPat, 
            String apellidoMat, String tipo, String nombreUsuario, 
            String contraseña){
        super(nombre, apellidoPat, apellidoMat);
        this.idUsuario = idUsuario;
        this.tipo = tipo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    
    
    
    //Métodos get
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
    
    //Metodos set
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
