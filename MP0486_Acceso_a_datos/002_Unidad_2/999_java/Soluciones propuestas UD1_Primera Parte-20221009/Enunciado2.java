package Vista;

import java.io.File;

/**
 *
 * AD
 */
public class Enunciado2 {

    public static void main(String[] args) {

        //Comenta o descomenta según quieras comprobar la información de un fichero o de un directorio.
      //  File f = new File ("./src/Datos/fichero.txt");
        File f= new File ("./src/Vista");
        
        if ((f.exists() && f.isFile())) {
            System.out.println("Es un fichero");
            System.out.println("Nombre :"+f.getPath());
            System.out.println("Tamaño :"+f.length());
        }
        if ((f.exists() && f.isDirectory())) {
            String[] archivos = f.list();
            //Si en vez de f.list utilizaramos f.listfiles() y lo metiaramos en files[] al crearlo
            // en vez de  File f2= new File (f.getPath()+"\\"+archivos[i]); usariamos new file(archivo[i])
            System.out.println("Es un directorio");
            System.out.println("Lista de Ficheros en el directorio -->"+f.getName());
            for (int i = 0; i < archivos.length; i++) {
                File f2 = new File(f.getPath() + "\\" + archivos[i]);
                if (f2.exists()) {
                    System.out.println(" Nombre"+f2.getPath()+"Tamaño :" + f2.length());
                }

            }
        }
    }
}
