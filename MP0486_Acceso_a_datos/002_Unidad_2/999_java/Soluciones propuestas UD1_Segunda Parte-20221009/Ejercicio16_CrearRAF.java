/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesUD1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *                                            4       10          4           8      =4+20+4+8=36
 * Vamos a introducir datos de un empleado: numemp+apellidos+departamento+salario en fichero RAF
 */
public class Ejercicio16_CrearRAF {
    
    public static void main (String[] args ) {
      
        try {
            crearFicheroRaf(new File("src/Datos/ficheroRAF.dat"));
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio16_CrearRAF.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
 
    public static void crearFicheroRaf(File fichero) throws IOException{

    //Arrays de datos que vamos a utilizar para utilizar los datos.
    String [] apellido = {"Fernandez","Gil", "Lopez","Ramos","Sevilla","Casilla","Rey"};
    int [] dep ={10,20,10,10,30,30,20};
    Double[] salario ={1000.45,2400.60,3000.0,1500.56,2200.0,1435.87,2000.0};        
    
    
    StringBuffer buffer= null; //variable para almacenar el apellido
    
    try (RandomAccessFile raf = new RandomAccessFile(fichero, "rw")) {

          for (int i=0;i<apellido.length;i++){
            raf.writeInt(i+1); // numemp
            
            buffer= new StringBuffer(apellido[i]);
            buffer.setLength(10);
            raf.writeChars(buffer.toString());
            raf.writeInt(dep[i]);
            raf.writeDouble(salario[i]);
            }
     }   
  }
}
    
 