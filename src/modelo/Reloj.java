package modelo;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Reloj extends Thread{
    private JLabel lbReloj;

    
    //constructor
    public Reloj(JLabel lbReloj) {
        this.lbReloj = lbReloj;
    }
    
    
    //metodo concreto
    public void run()
    {
        while(true)
        {
            Date horaActual = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss");
            lbReloj.setText(formato.format(horaActual));
        
        
            try 
            {
                sleep(1000);    //para que al mostrarlo se vea como pasa segundo a segundo... 1000 milisegundos
            } catch (Exception ex) {
            
            }
        
        }
    }
    
}
