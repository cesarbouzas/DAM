
package valores;

//ENUNCIADO 10: Leer/escribir ficheros de texto linea a linea.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//Escribe un programa que permita crear un fichero de texto (destino.txt) a partir de un fichero de
//texto (origen.txt). Todos los ficheros estarán en el package “Datos”. El proceso de lectura/escritura
//(I/O) de los ficheros de texto lo harás linea a linea utilizando las clases FileReader y FileWriter, así
//como BufferedReader y BufferedWriter.
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String linea;
    int contador=1;
    File origen =new File ("./src/datos/origen.txt");
    File destino =new File("./src/datos/destino.txt");
    
    if(destino.exists()&& destino.isFile()){
        destino.delete();
        System.out.println("Fichero "+destino.getPath()+" destino borrado :");
    }
        try (
                FileReader fr = new FileReader(origen);  
                FileWriter fw = new FileWriter(destino);
                BufferedReader br = new BufferedReader(fr);
                BufferedWriter bw=new BufferedWriter(fw)
                ) 
        {
         linea=br.readLine();
         while(linea!=null){
             System.out.println(contador+"--->"+linea);
                bw.write(linea+"\n");//Ojo si no colocamos "\n" no tine presente los saltos de linea
                linea=br.readLine();
                contador++;
         }
            
        } catch (IOException ex) {
            System.out.println("Erro de ficheros");
        }
    
    }
    
}
