//boolean mkdir()
//Crea el directorio. Devuelve true si se ha podido crear.
//boolean mkdirs()
//Crea el directorio incluyendo los directorios no existentes especificados en la ruta padre del directorio a crear. Devuelve true si se ha creado el directorio y los directorios no existentes de la ruta padre.
//boolean renameTo(File dest)
//Cambia el nombre del fichero por el indicado en el parámetro dest. Devuelve true si se ha realizado el cambio.
package vista;

import java.io.File;

/**
 *
 * @author cesar
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     File currentDir=new File("");
     File deporte=new File("./Deporte");
     File individual=new File("./Individual");
     File colectivo=new File("./Colectivo");
     
     File tenis=new File("./Tenis");
     File baloncesto=new File("./Baloncesto");
     File futbol=new File("./Futbol");
     
     currentDir=currentDir.getAbsoluteFile();
     System.out.println(currentDir);
     deporte=DirectorioTools.makeDirectory(deporte.getPath(),currentDir );
     individual=DirectorioTools.makeDirectory(individual.getPath(),deporte);
     colectivo=DirectorioTools.makeDirectory(colectivo.getPath(),deporte);
     
     tenis=DirectorioTools.makeDirectory(tenis.getPath(),individual);
     baloncesto=DirectorioTools.makeDirectory(baloncesto.getPath(),colectivo);
     futbol=DirectorioTools.makeDirectory(futbol.getPath(),colectivo);
    }
    
}
