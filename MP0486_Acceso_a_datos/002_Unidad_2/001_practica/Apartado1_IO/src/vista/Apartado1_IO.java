package vista;

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;

// Realiza un programa que permita guardar en un fichero de texto plano, que denominarás salida.txt y que guardarás en la carpeta datos,
//el nombre (con ruta relativa) y el tamaño de todos los ficheros contenidos en un directorio dado, incluyendo los subdirectorios, 
//que cumplan una determinada condición.

/**
 *
 * @author cesar
 */
public class Apartado1_IO {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<File> listOfFiles = null;
        File f=new File("src/datos/salida.txt");//Fichero de salida
        File d=new File("src/");//Directorio donde vamos a buscar los archivos
        step1(f);//paso 1 creamos el fichero y hacemos las comprobaciones pertinentes
         listOfFiles=findFileStartWith(d,"s",listOfFiles);
         listOfFiles.forEach(System.out::println);
        
    }
    
    static boolean createFile(String s) throws IOException{
    File f=new File(s);
    if(!f.exists()){
       if(f.getParentFile().exists()){
           System.out.println("El directorio "+ f.getParent()+" ya existe");
           return f.createNewFile();
       }else{
           if(f.getParentFile().mkdir()){
               System.out.println("Directorio "+f.getParent()+" creado");
               createFile(s);
               return true;
           }else{
               System.out.println("Error al crear el directorio padre");
               
           }
       }   
    }else{
        System.out.println("El fichero ya existe");
    return true;
    }
    return false;
    }
    
    
    static ArrayList<File> findFileStartWith(File d, String s,ArrayList lOF){
        FilterStartsWith filter=new FilterStartsWith(s);
        File[] files= d.listFiles();
        
       for(File f:files){
           if(f.exists()&& f.isFile()){
            lOF.add((File) Arrays.asList(f.listFiles(filter)));
           }else if(f.exists()&&f.isDirectory()){
              findFileStartWith(f,s,lOF);
           }
       }
       return lOF;
    }
    public static void step1(File f){
    try {
            if(createFile(f.getPath())){
                System.out.println("Fichero disponible:"+f.getPath());   
            }else{
                System.out.println("Fichero no creado");
            }
        } catch (IOException ex) {
            System.out.println("Error de E/S");
        }
    }
    
    
    
}
class FilterStartsWith implements FileFilter{
    private String prefix;
    FilterStartsWith(String s){
    this.prefix=s;
    }
    @Override
    public boolean accept(File f) {
        if(f.isFile()){
        return f.getName().startsWith(prefix);
    }
        return false;
    }
    
}
    
    
    
    

