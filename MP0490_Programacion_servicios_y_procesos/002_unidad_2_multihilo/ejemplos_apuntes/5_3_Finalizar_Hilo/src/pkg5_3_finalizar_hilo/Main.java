/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_3_finalizar_hilo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Hilo hilo1=new Hilo("Hilo1");
      hilo1.start();
        try {
            hilo1.join();//esperar a que termine el hilo
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null,"error de hilo");
        }
      System.out.println("¿Está el "+hilo1.getName()+" vivo? "+ hilo1.isAlive());
    }
    
}
