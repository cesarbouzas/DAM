/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Semaforo semaforo=new Semaforo();
      
      for(int i=0;i<5;i++){
          (new HiloLector("HiloLector"+i,semaforo)).start();
          
      }
      for(int i=0;i<3;i++){
          (new HiloEscritor("HiloEscritor"+i,semaforo)).start();
      }
      
    }
    
}
