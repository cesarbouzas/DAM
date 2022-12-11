/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6_1_prioridad_hilos;

/**
 *
 * @author Usuario
 */
public class Hilo extends Thread{

    public Hilo(int priority){
        this.setPriority(priority);
    }
    
    
    public void run(){
        String s="";
        for(int i=0;i<=20000;i++){
            s+="A";
        }
        System.out.println("El hilo con prioridad "+this.getPriority()+"  ha terminado de añadir los "+ s.length() +" caracteres en total "); 
                
    }
    
}
