/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_1_prioridad_hilos;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo[] hilosMinPriority=new Hilo[5];
        Hilo[] hilosMediumPriority=new Hilo[5];
        Hilo[] hilosMaxPriority=new Hilo[5];
        
        for(int i=0;i<5;i++){
                hilosMinPriority[i]=new Hilo(Thread.MIN_PRIORITY);
                hilosMediumPriority[i]=new Hilo(Thread.NORM_PRIORITY);
                hilosMaxPriority[i]=new Hilo(Thread.MAX_PRIORITY);
        }
        // arrancamos todos los hilos de menor prioridad
        for(Hilo h:hilosMinPriority){
            System.out.println("Arracamos hilo con prioridad "+h.getPriority());
            h.start();
        }
         for(Hilo h:hilosMediumPriority){
             System.out.println("Arracamos hilo con prioridad "+h.getPriority());
            h.start();
        }
          for(Hilo h:hilosMaxPriority){
           System.out.println("Arracamos hilo con prioridad "+h.getPriority());
              h.start();
        }
        
        
        
    }
    
}
