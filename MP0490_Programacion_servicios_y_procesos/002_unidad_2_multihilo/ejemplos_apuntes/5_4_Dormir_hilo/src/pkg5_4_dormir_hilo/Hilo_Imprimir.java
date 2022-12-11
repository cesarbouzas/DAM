/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_4_dormir_hilo;

/**
 *
 * @author Usuario
 */
public class Hilo_Imprimir extends Thread{
    String s;
    
    public Hilo_Imprimir(String s) {
    this.s=s;
    }
    
    
    public void run(){
        System.out.println(s);
    }
}
