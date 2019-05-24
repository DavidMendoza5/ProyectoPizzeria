/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author angel
 */
public class LoadCom extends Thread {

 
    @Override
    public void run() {
        FrmVentas fr = new FrmVentas();
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        try {
            this.sleep(1000);
        } catch (InterruptedException er) {
            er.printStackTrace();
        }
    }
}
