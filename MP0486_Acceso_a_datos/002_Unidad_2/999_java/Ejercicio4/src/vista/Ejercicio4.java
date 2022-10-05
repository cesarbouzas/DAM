package vista;

import java.io.File;

/**
 *
 * @author cesar
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //En ocaxiones nos interasa ver la lista que encaja en un determinado criterio
        //La Interface FilenameFilter se puede usar para crear o establecer filtros

        FiltroEmpieza filtro = new FiltroEmpieza(" e ");
        File dir = new File("./src/datos");
        File[] ficheros = dir.listFiles(filtro);
        
        
        if (ficheros.length == 0) {
            System.out.println("Directorio vacio o sin resultados");
        } else {
            System.out.println("Los archivos que empiezan por :"+filtro.letra+" :");
            for (File fichero : ficheros) {
                System.out.println(fichero.getName() + "................................" + fichero.length() + " bytes");
            }
            System.out.println("-------------------------------------------------------------------------");
        }
    }

}



 
