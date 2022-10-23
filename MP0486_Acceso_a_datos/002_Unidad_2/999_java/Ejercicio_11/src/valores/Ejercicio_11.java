package valores;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//ENUNCIADO 11: Leer/escribir ficheros binarios
//Escribe un programa que permita crear un fichero a partir de un fichero origen. Elige un fichero
//binario (ejem: una imagen) para realizar la prueba. Todos los ficheros estarán en el package
//“Datos”. El proceso de lectura/escritura (I/O) de los ficheros lo harás utilizando las clases
//FileInputStream y FileOutputStream.
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b;
        String regExp = "c";
        String extension;
        //Creamos el fichero raiz
        File raiz = new File("src/datos");//Sin el punto lo detecta como relativa
        System.out.println(raiz.getPath() + " es un directorio ->" + raiz.isDirectory()+"\n");//comprobamos que es un directorio
        if (raiz.isDirectory()) {
            File[] ficheros;//Creamos un array de ficheros para almacenar el contendio del directorio raiz
            Filtro filtroNombre = new Filtro(regExp);//Creo un filtro con la variable regExp="copia.png"; 
            ficheros = raiz.listFiles(filtroNombre); //aplico el filtro obtengo solo los ficheros que pasen el filtro
            System.out.println("********Ficheros Filtrados nº = " + ficheros.length + "*************:");
            for (File fichero : ficheros) {
                System.out.println(fichero.getPath());
            }//Listamos los ficheros que pasan el filtro
            if (ficheros.length == 1 && ficheros[0].isFile()) {
                System.out.println("\n"+ficheros[0].getPath()+" -->>borrado");
                ficheros[0].delete();
                
            }//si solo encunetra uno lo borra
            ficheros = raiz.listFiles();//guardo ahora todos los ficheros del directorio raiz.
            
            //Pasamos a buscar la extension del fichero que queda en el directorio para eso usamos split
            //extension = ficheros[0].getPath().split("[.]")[0];
            //System.out.println("0-->" + extension);
            extension = ficheros[0].getPath().split("[.]")[1];
            System.out.println("La extension del fichero "+ ficheros[0].getPath()+" a copiar es ." + extension);

            File origen = ficheros[0];
            System.out.println("\n***************Pasamos a copiar el fichero ********************\n");
            try (
                     FileInputStream fIS = new FileInputStream(origen);
                    FileOutputStream fOS = new FileOutputStream(new File("src/datos/copia." + extension));) {
                    b = fIS.read();
                while (b != -1) {
                    fOS.write(b);
                    b = fIS.read();
                }
                if(b==-1){
                    System.out.println("Fichero copiado.Fin del programa");
                }
            } catch (IOException e) {
                System.err.println("Error de Ficheros");
            } finally {
            }
        } else {
            System.out.println("Directorio no encontrado");
        }

    }
}
