/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class HiloEscritor extends Thread {
    private String name;
    private Semaforo s;
    
    
    public HiloEscritor(String nombre ,Semaforo s){
        this.name=nombre;
        this.s=s;
        
    }
    public void run(){
        System.out.println("El hilo "+name+" intenta escribir");
        s.accesoEscribir();
        try{
                sleep((int) Math.random()*50);
        }catch(InterruptedException e){
            System.out.println("Error al poner hilo a dormir");
        }
        s.escrituraFinalizada();
        
    }
    
}
