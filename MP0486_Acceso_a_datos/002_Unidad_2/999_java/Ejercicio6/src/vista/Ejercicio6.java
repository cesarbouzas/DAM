
package vista;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f=new File("./Deporte");
        File[] archivos=f.listFiles();
        if(f.exists()&& f.isDirectory()){
            try{
            System.out.println("Contendiod de "+f.getCanonicalPath());
            }catch(IOException e){
                System.out.println("Erro de directorio");
            }
            for (File archivo : archivos) {
            System.out.println(archivo.getPath()+"......."+archivo.length()+" bytes.");
        }
      }
        
    }
    
}
