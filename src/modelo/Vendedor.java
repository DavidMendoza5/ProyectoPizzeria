
package modelo;

/**
 *
 * @author vicenteyah
 */
public class Vendedor extends Usuario implements PorPagar{
    private double ventasBrutas;
    private double sueldo;
    private Horario horario;
    
    
    //Constructor

    public Vendedor(String nombre, String apellidoPat, String apellidoMat, 
            int idUsuario, String tipo, String nombreUsuario, String contraseña
            , double ventasBrutas, double sueldo, Horario horario)
    {
        super(idUsuario, nombre, apellidoPat, apellidoMat, tipo, nombreUsuario, contraseña);
        this.ventasBrutas = ventasBrutas;
        this.sueldo = sueldo;
        this.horario = horario;
    }

    
    //Metodos get
    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Horario getHorario() {
        return horario;
    }
    
    
    
    //Metodos set
    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    
    
    
    @Override
    public double obtenerMontoPago() {
        return getVentasBrutas() + getSueldo();
    }
    
    
    
    @Override
    public String toString() {
        return "Vendedor{" + "ventasBrutas=" + ventasBrutas + ", sueldo=" + sueldo + ", horario=" + horario + '}';
    }

    
    
}
