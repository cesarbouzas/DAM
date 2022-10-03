
 
package vista;
import java.io.File;
/**
 *
 * @author cesar
 */
import java.util.List;
public class Ejercicio2 {

/*
    Como sabes para instanciar un objeto de clase File este puede ser un fichero o un directorio.Escribe
un programa que obtenga información diferente según trabajemos con un fichero o un directorio.
Si es un fichero obtén su nombre indicando la ruta relativa y tamaño.
Si es un directorio lista los ficheros que contiene
 */   
    
    
    public static void main(String[] args) {
       
        File f1=new File ("./src/datos/hola.txt");
        File f2=new File ("./src/datos/archivo.txt");///no existe
        File d=new File("./src/datos");
        obtenerInformacion(f1);
        obtenerInformacion(d);
         obtenerInformacion(f2);
        
        
        
    }
   
    public static void obtenerInformacion(File f){
    if(f.exists()){
        if(f.isFile()){
            System.out.println("*******Es un archivo :");
            obtenerInfoFile(f);
            System.out.println("-----------------------------------------------");
        }
        if(f.isDirectory()){
            System.out.println("////////Es un directorio :");
            obtenerInfoDir(f);
            System.out.println("-----------------------------------------------");
        }
    }else{
        System.out.println("Los datos introducidos no se corresponden con Directorio/Archivo");
    }
    }
    public static void obtenerInfoFile(File f){
        System.out.println(f.getPath()+"....... Nombre "+f.getName()+"--->"+f.length()+" bytes");
    }
    public static void obtenerInfoDir(File f){
        List.of(f.listFiles()).stream()
                .forEach(x->obtenerInfoFile(x));
        
    }
}
