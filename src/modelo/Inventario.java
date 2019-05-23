/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author AngelCan
 */
public class Inventario implements PorPagar{
    
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precioCompra;
    
    
    //Constructor
    public Inventario(int idProducto, String nombre, int cantidad, double precioCompra)
    {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
    }
    
    //Métodos set
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    
    //Métodos get

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }
    
    
    
    
    //Precio total a Pagar a los Proveedores de un tipo de Producto 
    @Override
    public double obtenerMontoPago() {
       return getCantidad() * getPrecioCompra(); 
    }
    
    
    
    
    
    @Override
    public String toString() {
        return "Inventario{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioCompra=" + precioCompra + '}';
    }
    
    
}
