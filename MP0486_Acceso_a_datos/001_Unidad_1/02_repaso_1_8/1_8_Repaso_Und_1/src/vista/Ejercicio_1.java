/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.io.File;

/**
 *
 * @author Usuario
 */
public class Ejercicio_1 {

 
    public static void main(String[] args) {
      File f=new File("src/datos/","fichero1.txt");
      if(f.exists()){
          System.out.println("El tamaño de "+f.getName() + " es de "+f.getTotalSpace());
          System.out.println("El fichero "+f.getName() + " ha sido modificado "+ f.lastModified());
          System.out.println("El fichero "+f.getName()+" está en el directorio "+f.getParent());
      }else{
          System.err.println("Error de archivo");
      }
    }
    
}
