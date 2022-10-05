
package vista;
import java.io.File;

/**
 *
 * @author cesar
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("./src/datos/");
        if (f.exists()) {
            if (f.isFile()) {
                System.out.println(f.getPath() + "......Nombre" + f.getName() + "........." + f.length() + " bytes");
            } else if (f.isDirectory()) {
                if (f.listFiles() != null) {
                    File[] archivos = f.listFiles();
                    for (int i = 0; i < f.listFiles().length; i++) {
                        System.out.println("Nombre ...." + archivos[i].getName() + "........tamaño........." + archivos[i].length() + " bytes");

                    }
                } else {
                    System.out.println("Carpeta vacia");
                }
            } else {
                System.out.println("Los datos introducidos no son ni archivo ni fichero");
            }
        } else {
            System.out.println("El fichero/archivo no existe");
        }

    }
    
}
