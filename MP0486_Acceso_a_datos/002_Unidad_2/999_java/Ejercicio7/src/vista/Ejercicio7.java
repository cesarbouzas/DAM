package vista;

import java.io.File;
import java.io.IOException;


public class Ejercicio7 {

    /**
     * Haz una modificación del programa anterior para que busque solo aquellos que cumplen una
condición. Por ejemplo los que finalicen con la extensión “.java”.
     */
    public static void main(String[] args) {
        File f=new File ("./src/Deporte");
        System.out.println(((f.mkdir())?"Directorio creado":"Directorio no creado"));
        File txt1=new File(f.getPath()+"/archivo1.txt");
        File txt2=new File(f.getPath()+"/archivo2.txt");
        File j1=new File(f.getPath()+"/java2.java");
        File doc1=new File(f.getPath()+"/cesar.doc");
        try{
        System.out.println(((txt1.createNewFile())?"Archivo creado":"Archivo no creado"));
        System.out.println(((txt2.createNewFile())?"Archivo creado":"Archivo no creado"));
        System.out.println(((j1.createNewFile())?"Archivo creado":"Archivo no creado"));
        System.out.println(((doc1.createNewFile())?"Archivo creado":"Archivo no creado"));
        }catch(IOException e){
            System.out.println("Error de creaccion de archivos");
        }
        System.out.println("Contenido de el directroio");
        FiltroTermina filtro=new FiltroTermina(".java");
        File[] archivos=f.listFiles(filtro);
        for (File archivo : archivos) {
            System.out.println(archivo.getName()+"--------------"+archivo.length()+" bytes");
            
        }
   }

}
    

