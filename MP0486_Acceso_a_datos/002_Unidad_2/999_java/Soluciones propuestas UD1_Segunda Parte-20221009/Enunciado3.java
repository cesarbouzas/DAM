package Vista;

import java.io.File;

/**
 *
 * AD
 */
public class Enunciado3 {

    public static void main(String[] args) {

        //Comenta o descomenta según quieras comprobar la información de un fichero o de un directorio.
      //  File f = new File ("./src/Datos/fichero.txt");
        File f= new File ("./src/Vista");
        
        if ((f.exists() && f.isFile())) {
            System.out.println("Es un fichero");
            System.out.println("Nombre :"+f.getPath());
            System.out.println("Tamaño :"+f.length());
        }
        if ((f.exists() && f.isDirectory())) {
            File[] archivos = f.listFiles();
            
            System.out.println("Es un directorio");
            System.out.println("Lista de Ficheros en el directorio -->"+f.getName());
            for (File archivo : archivos) {
                if (archivo.exists())
                    System.out.println(" Nombre"+archivo.getPath()+"Tamaño :" + archivo.length());
            }
        }
    }
}
