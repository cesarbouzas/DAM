/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;


import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class HiloLector extends Thread {
    
    String name ;
    Semaforo s;
    
    public HiloLector(String nombre,Semaforo s){
       this.name=nombre;
       this.s=s;
    }
    public void run(){
        
            System.out.println(getName()+": Intentando leer");
            s.accesoLeer();
            
        try {
            sleep((int)(Math.random())*50);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null,"Error dormir  hilo "+name);
        }
        s.lecturaFinalizada();
    
    }
    
}
