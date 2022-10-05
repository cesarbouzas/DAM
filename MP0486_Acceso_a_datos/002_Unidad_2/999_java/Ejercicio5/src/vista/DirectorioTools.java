
package vista;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author cesar
 */
public class DirectorioTools {

    public static File makeDirectory(String r, File f) {
       
        if (f.exists() && f.isDirectory()) {
             File dir = new File(f.getPath()+r);
            if (f.isDirectory()) {
                if (dir.mkdir()) {
                    System.out.println("Directorio creado: "+showCanonicalPath(dir));
                    return dir;
                } else if (dir.exists()) {
                    System.err.println("Directorio ya existe: "+showCanonicalPath(dir));
                    return dir;
                }
            } else {
                System.err.println("Error con la ruta insertada");
            }
        } else {
            System.err.println("La ruta base no existe o no es un directorio :"+showCanonicalPath(f));
        }
        return null;

    
    }
    public static File makeFile(String r, File f){
    if (f.exists() && f.isDirectory()) {
             File dir = new File(f.getPath()+r);
                 try {
                     if (dir.createNewFile()) {
                         System.out.println("Fichero creado: "+showCanonicalPath(dir));
                         return dir;
                     } else if (dir.exists()) {
                         System.err.println("Fichero ya existe: "+showCanonicalPath(dir));
                         return dir;
                     }} catch (IOException ex) {
                     System.out.println("Error de Entrada salida : "+showCanonicalPath(dir));
                 }
            } else {
                System.err.println("Error con la ruta insertada : "+showCanonicalPath(f));
            }
        return null;
    }

    public static String showCanonicalPath(File f){
        try {
           return f.getCanonicalPath();
                    } catch (IOException e) {
            System.out.println("Error de formato de directorio");
            
        }
        return null;
    }
    
}
