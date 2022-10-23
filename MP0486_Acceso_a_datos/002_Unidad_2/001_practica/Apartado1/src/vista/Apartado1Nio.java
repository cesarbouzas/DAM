//Enunciado.
//Apartado 1) (1 puntos) 
//Realiza un programa que permita guardar en un fichero de texto plano, que denominarás salida.txt 
//y que guardarás en la carpeta datos,
//el nombre (con ruta relativa) y el tamaño de todos los ficheros contenidos en un directorio dado,
//incluyendo los subdirectorios, que cumplan una determinada condición.
package vista;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
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
        ///Buscamos los archivos que cumplan dos condiciones
        try{
        findFilesStartsWith(Path.of("../"),"s",path);
        findFilesSize(Path.of("../"),0,path);
        }catch(IOException e){
            System.out.println("Error de I/O ");
        }
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

    
  static List<Path> findFilesStartsWith  (Path directory ,String regExp,Path fileWrite) throws IOException{
            Files.writeString(fileWrite,"**********************Ficheros que empiezan por "+ regExp+" ***************************\n");
                  return Files.find(directory,Integer.MAX_VALUE,(path,atr)->atr.isRegularFile()&& path.getFileName().toString().startsWith(regExp))
                  .peek(x->{
                try {
                    Files.writeString(fileWrite,x.toFile().getAbsolutePath()+"\n",StandardOpenOption.APPEND);
                } catch (IOException ex) {
                    System.out.println("Errode escritura");
                }
            })
                  .collect(Collectors.toList());
  }
  static List<Path> findFilesSize (Path directory, int size,Path fileWrite)throws IOException{
      List<Path> result=null;
            Files.writeString(fileWrite,"**********************Ficheros de tamaño superior a "+ size+" ***************************\n",StandardOpenOption.APPEND);
           return Files.find(directory,Integer.MAX_VALUE,(path,attr)->attr.isRegularFile()&&attr.size()>=size)
                .peek(x->{
          try {
              Files.writeString(fileWrite,x.toFile().getAbsolutePath()+"\n",StandardOpenOption.APPEND);
          } catch (IOException ex) {
             System.out.println("Errode escritura");
          }
      })
               .collect(Collectors.toList());
  }
  }