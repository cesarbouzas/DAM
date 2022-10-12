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
        String extension;
        File raiz = new File("./src/datos");
        File[] ficheros;

        Filtro filtroNombre = new Filtro("copia");

        ficheros = raiz.listFiles(filtroNombre);
        if (ficheros.length == 1 && ficheros[0].isFile()) {
            ficheros[0].delete();
        }
        ficheros = raiz.listFiles();
        extension = ficheros[0].getPath().split("[.]")[0];
        System.out.println("0-->" + extension);
        extension = ficheros[0].getPath().split("[.]")[1];
        System.out.println("1-->" + extension);
        extension = ficheros[0].getPath().split("[.]")[2];
        System.out.println("2-->" + extension);
        File origen = ficheros[0];

        try (
                 FileInputStream fIS = new FileInputStream(origen);  
                FileOutputStream fOS = new FileOutputStream(new File("./src/datos/copia." + extension));) 
        {

            b = fIS.read();
            while (b != -1) {
                fOS.write(b);
                b = fIS.read();
            }
        } catch (IOException e) {
            System.err.println("Error de Ficheros");
        } finally {
        }
    }
}
