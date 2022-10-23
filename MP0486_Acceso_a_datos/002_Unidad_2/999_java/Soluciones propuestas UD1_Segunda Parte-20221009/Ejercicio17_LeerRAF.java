/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesUD1;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * Lee un fichero no secuencial binario y muestra los datos.
 */
public class Ejercicio17_LeerRAF {
 
  public static void main (String [] args ) {
         try{  
            
           leerFicheroRaf(new File("src/Datos/ficheroRAF.dat"));      
           /*************** AHORA LEEMOS SOLO UNO***************/
           System.out.println("Mostramos el registro 3");
           leerunregistroRaf(3);
     }   catch (Exception ex) {
         ex.printStackTrace();
         Logger.getLogger(Ejercicio17_LeerRAF.class.getName()).log(Level.SEVERE, "Error Fatal", "");
      }
  }           
  public static void leerFicheroRaf(File nombre) throws IOException{
      
      int numemp,dep, posicion;
      Double salario;
      char apellido[] = new char[10], aux;
      
      try (RandomAccessFile raf = new RandomAccessFile(nombre, "r")) {
            
            raf.seek(0);//Principio del fichero
            while(raf.getFilePointer()!=raf.length()){
           
            numemp=raf.readInt(); //leer numemp
            
            for(int i=0;i<apellido.length;i++){
              aux=raf.readChar();
              apellido[i]=aux;
            }
          
          //convertimos a string el array de caracteres;
            String apel=new String (apellido);
            
            dep=raf.readInt();
            salario=raf.readDouble();
            
            System.out.println("NumEmp:"+numemp+", Apellido:"+apel+", "
                    + "departamento:"+dep+", salario:"+salario);
                       
           }
      }
      
  }
  public static void leerunregistroRaf(int numeroregistro) throws IOException{
      
      int numemp,dep;
      Double salario;
      char apellido[] = new char[10], aux;
      
      try (RandomAccessFile raf = new RandomAccessFile(new File("src/Datos/FicheroRAF.dat"), "r")) {
            
            raf.seek((numeroregistro-1)*36); // (Numeroderegitro-1)*tamañoregistro
                                             //Mediante este método nos posicionamos en el registro  a leer
                                             //En el ejemplo leemos a Lopez, podría cambiar
            numemp=raf.readInt(); //leer numemp
            
            for(int i=0;i<apellido.length;i++){
              aux=raf.readChar();
              apellido[i]=aux;
            }
       
            String apel=new String (apellido);
            
            dep=raf.readInt();
            salario=raf.readDouble();
            
            System.out.println("NumEmp:"+numemp+", Apellido:"+apel+", "
                    + "departamento:"+dep+", salario:"+salario);
                       
           }
      }
  
}