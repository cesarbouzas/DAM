/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;

/**
 *
 * @author Usuario
 */
public class Ejercicio_2 {
    
   
    public static void main(String[] args){
    File f1=new File("src/datos/","fichero1.txt");
    File f2=new File("src/vista/");
       
        obtenerInformacion(f1);
        obtenerInformacion(f2);
    }
    
    public static  void obtenerInformacion(File f){
        if(f.exists() ){
            if(f.isFile()){
                System.out.println(f.getParent()+"\\"+f.getName());
            }else if(f.isDirectory()){
               File[] listado =f.listFiles();
               for(File g:listado){
                   System.out.println(g.getName());
               }
            }
            
        }
    }
}
    

