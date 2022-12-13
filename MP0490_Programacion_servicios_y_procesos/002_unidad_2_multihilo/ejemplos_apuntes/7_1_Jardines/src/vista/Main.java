/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import controlador.RecursoJardin;

/**
 *
 * @author Usuario
 */
public class Main {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RecursoJardin j=new RecursoJardin();
      
        for(int i=1;i<=10;i++){
            (new Entrada("Entrada nº"+i,j)).start();
        }
        for(int i=1;i<=15;i++){
            (new Salida("Salida nº "+i,j)).start();
        }
    }
    
}
