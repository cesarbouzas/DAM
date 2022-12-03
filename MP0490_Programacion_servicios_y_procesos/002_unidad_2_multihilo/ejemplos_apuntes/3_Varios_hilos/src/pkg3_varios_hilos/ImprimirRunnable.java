/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_varios_hilos;

public class ImprimirRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10; i++){
            System.out.println("Saludos desdel el hilo runable");
        }
    }    
}
