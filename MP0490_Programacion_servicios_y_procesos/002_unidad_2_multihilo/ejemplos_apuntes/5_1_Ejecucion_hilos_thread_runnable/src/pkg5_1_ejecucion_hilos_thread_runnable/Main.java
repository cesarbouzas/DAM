/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_1_ejecucion_hilos_thread_runnable;

/**
 *
 * @author Usuario
 */
public class Main {

 
      
 
    public static void main(String[] args) {
        
        ExtendsThread hilo1 = new ExtendsThread("Hilo_1");
        ExtendsThread hilo2 = new ExtendsThread();
        ImplementsRunnable runable = new ImplementsRunnable();
        Thread hilo3 = new Thread(runable);
        hilo3.setName("hilo_3");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        System.err.println("Este es el hilo principal o hilo de nombre "+Thread.currentThread().getName());

    }

}
