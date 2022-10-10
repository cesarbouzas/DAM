/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * AD
 *
 */
public class Enunciado7 {

    public static void main(String[] args) {

        lista (new File("./src/Deporte"));
        
    }
    public static void lista(File directorio) {

          //En este caso el filtro tiene 2 condiciones. Que finalice con .java
          // y que acepte que lo que le llega es un directorio.
          // Sin esta última condición no recorre la estructura, ya que cuando encuentra
          //un directorio no sigue buscando.
          FilenameFilter filtro = new FilenameFilter() {
               // Ahora tenemos que sobreescribir esta metodo 
               
                @Override
                public boolean accept(File dir, String name) {                   
                    File ff= new File (dir, name);
                    return name.endsWith(".java") || ff.isDirectory();
                }
            };
        File[] archivos = directorio.listFiles(filtro);

        for (File archivo : archivos) {
            if (archivo.exists() && archivo.isFile()) {
                System.out.println(" Nombre" + archivo.getPath() + " Tamaño :" + archivo.length());
            } else if (archivo.exists() && archivo.isDirectory()) {
                lista(archivo);
            }
        }

    }

}
