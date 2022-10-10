
package Vista;

/**
 *
 * Crear 2 directorios y ficheros en ambos. Hacer operaciones de copia y movimiento
 * de los ficheros entre los directorios.
 */

import java.io.*;


public class Enunciado5 {
    public static void creaDirectorios(File directorio) throws IOException{
        if (!directorio.exists())
            directorio.mkdir();
    }
    
    public static void creaFichero(File fichero) throws IOException{
        if (!fichero.exists())
          fichero.createNewFile();   
    }
    public static void main (String[] args) throws IOException{
        String [] carpeta={"Deporte","Individual","Colectivo","Tenis","Futbol","Baloncesto"};
               
        creaDirectorios(new File("./src/"+carpeta[0]));
        creaDirectorios(new File("./src/"+carpeta[0]+"/"+carpeta[1]));
        creaDirectorios(new File("./src/"+carpeta[0]+"/"+carpeta[2]));
        creaDirectorios(new File("./src/"+carpeta[0]+"/"+carpeta[2]));
        creaDirectorios(new File("./src/"+carpeta[0]+"/"+carpeta[1]+"/"+carpeta[3]));
        creaDirectorios(new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[4]));
        creaDirectorios(new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[5]));
           
        //En este caso utilizamos la instanciación del fichero indicando el directorio

        creaFichero(new File ("./src/"+carpeta[0]+"/"+carpeta[1]+"/","Fichindividual1.java"));
        creaFichero(new File ("./src/"+carpeta[0]+"/"+carpeta[1]+"/","Fichindividual2.java"));
        creaFichero(new File ("./src/"+carpeta[0]+"/"+carpeta[2]+"/","FichColectivo1.java"));
        creaFichero(new File (new File("./src/"+carpeta[0]+"/"+carpeta[1]+"/"+carpeta[3]+"/"),"FichTenis.txt"));
        creaFichero(new File (new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[5]+"/"),"FichBaloncesto1.java"));
        creaFichero(new File (new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[5]+"/"),"FichBaloncesto2.txt"));
        creaFichero(new File (new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[5]+"/"),"FichBaloncesto3.txt"));
             
        var origen=new File (new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[5]),"FichBaloncesto2.txt");
        var destino= new File (new File("./src/"+carpeta[0]+"/"+carpeta[1]+"/"+carpeta[3]),"FichBaloncesto2movido.txt");        
        origen.renameTo(destino);
    
    }
}
