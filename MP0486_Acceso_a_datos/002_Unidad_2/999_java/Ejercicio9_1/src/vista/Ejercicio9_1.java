
package vista;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ejercicio9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i;
 
       File origen=new File("./src/datos/origen.txt");
       File destino=new File("./src/datos/destino.txt");
        System.out.println("El fichero origen "+origen.getPath()+" es "+origen.exists());
       
        try (
            FileReader fr = new FileReader(origen);
            FileWriter fw = new FileWriter(destino);
                )
        {    
            i=fr.read();
            while(i!=-1){
                fw.write(i);
                System.out.print((char)i);
                i=fr.read();
            }
        } catch (IOException e) {
            System.out.println("Error de Entrada/salida");
        }finally{
        
        }
    }
    
}
