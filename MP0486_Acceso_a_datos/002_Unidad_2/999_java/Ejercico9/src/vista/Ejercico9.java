package vista;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Escribe un programa que permita crear un fichero de texto (destino.txt) a partir de un fichero de
//texto (origen.txt). Todos los ficheros estarán en el package “Datos”. El proceso de lectura/escritura
//(I/O) de los ficheros de texto lo harás carácter a carácter utilizando las clases FileReader y
//FileWriter.
//Debes crear el fichero origen.txt en el paquete datos. O lo crear desde el explorador o podrás ir a
//new File-→Other-→Empty File -→Escribir el nombre del fichero (origen.txt) y escribir a mano su
//contenido. Prueba a crear varias lineas de texto.
//¿Que ocurre si le indicas como segundo parámetro al fichero de destino la opción True?.
//Es importante que observes que todos ficheros deben abrirse y cerrarse. En este ejercicio si
//declaramos las variables en el try ya se cierran sin necesidad de hacerlo en el finally. Fijate en el
//ejercicio9_1xxx.java(En la versión 1 del ejercicio 9).

public class Ejercico9 {


    public static void main(String[] args) {
       
        File origen=new File("./src/Datos/origen.txt");
        File destino=new File("./src/Datos/destino.txt");
        FileReader fr=null;
        FileWriter fw=null;
        int i;
        
        try{
           fr=new FileReader(origen);
           fw =new FileWriter(destino);
           i=fr.read();
           while(i!= -1){
               fw.write(i);
               System.out.print((char)i);
               i=fr.read();
               
           }
        }catch(IOException e){
            System.out.println(MsgErrors.ERRORFICHERO);
        }finally{
           try{
               if(fr!=null && fw!=null){
               fr.close();
               fw.close();
               }
           }catch(IOException e2){
               System.out.println(MsgErrors.ERRORCERRARFICHERO);
           } 
        
        }
        
        }
        
        
    
    }

    
    
    
    
    
    
    
    

