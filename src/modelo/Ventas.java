/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author David
 */
public class Ventas implements PorPagar{
    private int idVenta;    //folio
    private String fecha;
    private String nomCliente;
    private String dirCliente;
    private double precioVenta;
    private double IVA;
    private String detalles;

    public Ventas(int idVenta, String fecha, String nomCliente, String dirCliente,
            double precioVenta, double IVA, String detalles)
    {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.nomCliente = nomCliente;
        this.dirCliente = dirCliente;
        this.precioVenta = precioVenta;
        setIVA(IVA);
        this.detalles = detalles;
    }
    
    
    //Metodos get
    public int getIdVenta() {
        return idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getIVA() {
        return IVA;
    }

    public String getDetalles() {
        return detalles;
    }
    
    
    
    //Metodos set
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setIVA(double IVA) {    //IVA del 16%
        this.IVA = 0.16;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    
    
    
    
    //Calcula el subtotal de Compra
    public double subtotal(){
        return getPrecioVenta() * getIVA();
    }
    
    
    
    //Precio Total de Venta
    @Override
    public double obtenerMontoPago() {
        return getPrecioVenta() + subtotal();
    }
    

    
    
    
    
    
    

}
