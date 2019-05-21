/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gema
 */
public class Cliente extends Persona{
    private int idCliente;
    private String direccion;
    private String telefono;

    
    //Constructor
    public Cliente(int idCliente, String nombre, String apellidopat, 
            String apellidomat, String direccion, String telefono)
    {
        super(nombre, apellidopat, apellidomat);
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    
    //Métodos set
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    //Métodos get
    public int getIdCliente() {
        return idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
}
