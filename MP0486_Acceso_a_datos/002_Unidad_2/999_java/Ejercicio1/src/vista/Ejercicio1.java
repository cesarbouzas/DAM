
package vista;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author cesar
 */
public class Ejercicio1 {

    
     
    public static void main(String[] args) {
    
        DateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy hh:mm a");
        File f1=new File("./src/datos/fichero.txt");
        if(f1.exists()){
            try {
                System.out.println("************Propiedades del "+f1.getName()+"************\n");
                System.out.println("El archivo "+f1.getPath()+" tiene una longitud de :"+f1.length()+" bytes\n");
                System.out.println("La ultima modificacion fue "+sdf.format(f1.lastModified()));
                System.out.println("Ruta absoluta :"+f1.getAbsolutePath()+"\n");
                try {
                    System.out.println("Ruta canonica :"+f1.getCanonicalPath()+"\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Archivo padre :"+f1.getParent()+"\n");
                File dirPadre=f1.getParentFile();
                System.out.println("Listado archivos "+f1.getCanonicalPath());
                List.of(dirPadre.listFiles()).stream().forEach(x->System.out.println(x.getName()+"......."+sdf.format(x.lastModified())+"....."+x.length()+" bytes"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else{
            System.out.println("El fichero no existe");
        }
    }
    
}
