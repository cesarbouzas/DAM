/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.RecursoJardin;

/**
 *
 * @author Usuario
 */
public class Salida extends Thread{
   
    RecursoJardin j;

    public Salida(String nombre,RecursoJardin j) {
    super(nombre);
    this.j=j;
    }
    
    public void run(){
        
        j.decrementarCuenta();
    }
    
    
}
