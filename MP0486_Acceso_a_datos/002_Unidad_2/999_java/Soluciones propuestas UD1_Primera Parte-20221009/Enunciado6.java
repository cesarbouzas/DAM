/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.File;

/**
 *
 * AD
 *
 */
public class Enunciado6 {

    public static void main(String[] args) {

        lista (new File("./src/Deporte"));
        
    }
    public static void lista(File directorio) {

        File[] archivos = directorio.listFiles();

        for (File archivo : archivos) {
            if (archivo.exists() && archivo.isFile()) {
                System.out.println(" Nombre" + archivo.getPath() + " Tamaño :" + archivo.length());
            } else if (archivo.exists() && archivo.isDirectory()) {
                lista(archivo);
            }
        }

    }

}
