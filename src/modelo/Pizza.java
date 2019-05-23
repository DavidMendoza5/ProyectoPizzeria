
package modelo;

/**
 *
 * @author David
 */
public class Pizza {
    private int idPizza;
    private String nombrePizza;
    private double precioPizza;
    private String tamaño;
    
    //Constructor
    public Pizza(int idPizza, String nombrePizza, String tamaño, double precioPizza) {
        this.idPizza = idPizza;
        this.nombrePizza = nombrePizza;
        this.precioPizza = precioPizza;
        this.tamaño = tamaño;
    }
    
    
    //Métodos set
    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    public void setNombrePizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
    }

    public void setPrecioPizza(double precioPizza) {
        this.precioPizza = precioPizza;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
    //Métodos set
    public int getIdPizza() {
        return idPizza;
    }

    public String getNombrePizza() {
        return nombrePizza;
    }

    public double getPrecioPizza() {
        return precioPizza;
    }

    public String getTamaño() {
        return tamaño;
    }
    
    
    
    @Override
    public String toString() {
        return idPizza + "," + nombrePizza + "," + precioPizza + "," + tamaño;
    }
    
    
    
    
    

    
 
}
