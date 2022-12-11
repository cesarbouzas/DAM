/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_4_dormir_hilo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Hilo_Contar extends Thread{
    
    private int numero=0;
    
    public int getNumero(){
    return this.numero;
    }
    
    public void run(){
        
    for(int i=0;i<20;i++){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo_Contar.class.getName()).log(Level.SEVERE, null, ex);
        }
            this.numero=i;
            Hilo_Imprimir imprime=new Hilo_Imprimir(numero+"");
            imprime.start();
    }
    }
    
}
