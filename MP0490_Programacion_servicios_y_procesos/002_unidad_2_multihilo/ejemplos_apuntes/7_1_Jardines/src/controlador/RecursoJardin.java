/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class RecursoJardin {
    
    private int cuenta=100;
    
    public RecursoJardin(){
    
    }
    
    public synchronized void  incrementarCuenta (){
        cuenta++;
        System.out.println("El hilo "+Thread.currentThread().getName()+" a incrementado la cuenta en 1 Total : "+cuenta);
    }
    
    public synchronized void decrementarCuenta(){
        if(cuenta>0){
        cuenta--;
        System.out.println("El hilo "+Thread.currentThread().getName()+" a decrementado la cuenta en 1 Total : "+cuenta);
        }else{
        JOptionPane.showMessageDialog(null,"error de contabilidad");
        }
    
}
}
