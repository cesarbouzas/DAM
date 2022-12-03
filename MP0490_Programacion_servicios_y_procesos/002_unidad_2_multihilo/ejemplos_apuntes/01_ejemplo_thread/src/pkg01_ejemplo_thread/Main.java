/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_ejemplo_thread;

/**
 *
 * @author Usuario
 */
public class Main extends Thread {

    @Override
    public void run() {
        System.out.println("Saludo desde el hilo extendido");
        System.out.println(Thread.currentThread());
    }
    
    
    
    
    
    
    

    public static void main(String[] args) {
       Thread miHilo= Thread.currentThread();
        System.out.println("Por defecto, el hilo que ejecuta el método main de mi programa se llama "+miHilo.getName());
        Main hilo1=new Main();
        hilo1.start();
        
    }
    
    
}
