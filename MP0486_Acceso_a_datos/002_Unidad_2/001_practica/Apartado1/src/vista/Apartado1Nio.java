//Enunciado.
//Apartado 1) (1 puntos) 
//Realiza un programa que permita guardar en un fichero de texto plano, que denominarás salida.txt 
//y que guardarás en la carpeta datos,
//el nombre (con ruta relativa) y el tamaño de todos los ficheros contenidos en un directorio dado,
//incluyendo los subdirectorios, que cumplan una determinada condición.
package vista;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;


/**
 *
 * @author Cesar bouzas
 */
public class Apartado1Nio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Path.of("src/datos/salida.txt");
        crateFile(path);
        archivosBuscar(Path.of("src/"));


}
   static void crateFile(Path path){
            try {
            Path directory = path.getParent();

            if (!Files.exists(directory)) {
                Files.createDirectory(path.getParent());
                System.out.println("Directorio " + path.getParent().getFileName()+" creado.");
                Files.createFile(path);
                System.out.println("Fichero " + path + " creado.");
            } else {
                System.out.println("El directorio " + path.getParent().getFileName() + " ya existe.");
                if (Files.exists(path)) {
                    System.out.println("El fichero " + path + " ya existe");
                } else {
                    Files.createFile(path);
                    System.out.println("Fichero " + path + " creado.");
                }
            }
        } catch (IOException ex) {
            System.out.println("Error al crear fichero o directorio");
        }
    }
    
  static Path[] archivosBuscar(Path directory){
        try {
         
          Files.list(directory).filter(Files::isRegularFile).forEach(System.out::println);
          
            
            
        } catch (IOException ex) {
            Logger.getLogger(Apartado1Nio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
  }
    
}