/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_1_ejecucion_hilos_thread_runnable;

/**
 *
 * @author Usuario
 */
public class ImplementsRunnable implements Runnable{

    public ImplementsRunnable() {
    }

   
    @Override
    public void run() {
        for(int i=0;i<10;i++){
        System.out.println("Este hilo es de tipo clase implemnts runnable "+Thread.currentThread().getName());
    }
    }    
    
    
    
    

}
