
package Vista;

import java.io.File;

/**
 *
 * @author AD
 */

public class Enunciado1 {
    public static void main (String[] args){
         System.out.println("INFORMACION SOBRE EL FICHERO");
         File f = new File ("./src/Datos/fichero.txt");
         if (f.exists() && f.isFile()) {
            System.out.println("Nombre del fichero :"+f.getName());
            System.out.println("Ruta :"+f.getPath());
            System.out.println("Ruta Absoluta :"+f.getAbsolutePath());
            System.out.println("Se puede escribir :"+f.canWrite());
            System.out.println("Se puede leer :"+f.canRead());
            System.out.println("Tamaño :"+f.length());
            System.out.println("Es un directorio :"+f.isDirectory());
            System.out.println("Es un fichero :"+f.isFile());
        } else System.out.println("Fichero no encontrado");        
    }

}
