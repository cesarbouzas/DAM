package Vista;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * AD
 */
public class Enunciado4 {

    public static void main(String[] args) {

        //Comenta o descomenta según quieras comprobar la información de un fichero o de un directorio.
        //  File f = new File ("./src/Datos/fichero.txt");
        File f = new File("./src/Vista");

        // Creamos un objeto Filenamefilter que es una clase abstracta
        //que nos proporciona java que unicamente tiene un metodo
        //accept que devuelve true o false si se cumple el filtro indicado
        //este método accept hay que redefinirlo
        FilenameFilter filtro = new FilenameFilter() {
            // Ahora tenemos que sobreescribir esta metodo 
        @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("E") ;
            }
        };

        if ((f.exists() && f.isFile())) {
            System.out.println("Es un fichero");
            System.out.println("Nombre :" + f.getPath());
            System.out.println("Tamaño :" + f.length());
        }
        if ((f.exists() && f.isDirectory())) {
            File[] archivos = f.listFiles(filtro); //Aplicamos el filtro.

            System.out.println("Es un directorio");
            System.out.println("Lista de Ficheros en el directorio -->" + f.getName());
            for (File archivo : archivos) {
                if (archivo.exists()) {
                    System.out.println(" Nombre" + archivo.getPath() + "Tamaño :" + archivo.length());
                }
            }
        }
    }
}
