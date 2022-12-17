/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;


public class Ejercicio_5 {

    
    
public static void main(String[] args){    
File dirDeporte=new File("src/Deporte");
File dirIndiviadual=new File("src/Deporte/Individual");        
File dirColectivo=new File("src/Deporte/Colectivo");
File dirTenis=new File("src/Deporte/Individual/tenis");
File dirFutbol=new File("src/Deporte/Colectivo/futbol");
File dirBaloncesto=new File("src/Deporte/Colectivo/baloncesto");

try{
    if(dirDeporte.exists()){
        System.out.println("Fichero "+dirDeporte.getName()+" existe");
        if(dirDeporte.delete()){
        System.out.println("Fichero borrado "+dirDeporte.getName());
        }
    }
    
    if(dirDeporte.mkdir()&&dirColectivo.mkdir()&&dirIndiviadual.mkdir()&&dirTenis.mkdir()&&dirFutbol.mkdir()&&dirBaloncesto.mkdir()){
        System.out.println("Ficheros creados correctamente");
        }
    }catch(Exception e){
        System.err.println("Error de creaccionde fichero");       
    }
}
            

    
}
