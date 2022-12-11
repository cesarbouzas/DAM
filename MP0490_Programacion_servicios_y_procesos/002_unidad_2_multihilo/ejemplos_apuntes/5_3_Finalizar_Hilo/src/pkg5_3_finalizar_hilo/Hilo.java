/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_3_finalizar_hilo;


/**
 *
 * @author Usuariohacemos
 */
public class Hilo extends Thread{

    public Hilo(String name) {
    super(name);
    }
    
    
    
    public void run(){
        for(int i=10;i>=0;i--){
            System.out.println("Desde el "+getName()+" hacemos la cuenta atras :"+i+"/10");
            System.out.println("¿El "+getName()+ " está vivo? "+Thread.currentThread().isAlive());
        }
    
    }
    
}
