
package Vista;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *En este ejemplo vamos a escribir objetos de la clase Ejer10_Persona en un fichero Binario
 */
public class Ejercicio14_EscribirficherodeObjetos {
 
    public static void main(String [] args) throws IOException{
        try (FileOutputStream fichsalida= new FileOutputStream(new File ("src/Datos/fichbinarioorigen.dat"));
            ObjectOutputStream dataOS=new ObjectOutputStream(fichsalida);)
        {
        Per persona;

        String nombres[]={"Ana","Luis Miguel","Alicia","Pedro","Manuel","Andres",
                          "Julio", "Antonio","Maria Jesus"};
        int edades[]={20,22,14,15,13,16,21,20,17};
        
        for (int i=0;i<edades.length;i++){
            persona= new Per(nombres[i],edades[i]);
            dataOS.writeObject(persona);
        }       
    }
    
}}
//Recuerda que al escribir objetos en un fichero la clase debe implementar la interfaz
//Serializable.
class Per implements Serializable{
    private String nombre;
    private int edad;
    
    public Per(String nombre, int edad){
         this.nombre=nombre;
         this.edad=edad;
    }
    
    public Per(){
         this.nombre=null;
    }
    
    public void setNombre(String nom) {nombre=nom;}
    public void setEdad (int ed) {edad=ed;}
    
    public String getNombre(){return nombre;}
    public int getEdad() {return edad;}
}