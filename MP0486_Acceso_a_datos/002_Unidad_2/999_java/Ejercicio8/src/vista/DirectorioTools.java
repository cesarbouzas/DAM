
package vista;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author cesar
 */
public class DirectorioTools {

    public static File makeDirectory(String r, File f) {
       
        if (f.exists() && f.isDirectory()) {
             File dir = new File(f.getPath()+r);
            if (f.isDirectory()) {
                if (dir.mkdir()) {
                    System.out.println("Directorio creado: "+showCanonicalPath(dir));
                    return dir;
                } else if (dir.exists()) {
                    System.err.println("Directorio ya existe: "+showCanonicalPath(dir));
                    return dir;
                }
            } else {
                System.err.println("Error con la ruta insertada");
            }
        } else {
            System.err.println("La ruta base no existe o no es un directorio :"+showCanonicalPath(f));
        }
        return null;

    
    }
    public static File makeFile(String r, File f){
    if (f.exists() && f.isDirectory()) {
             File dir = new File(f.getPath()+r);
                 try {
                     if (dir.createNewFile()) {
                         System.out.println("Fichero creado: "+showCanonicalPath(dir));
                         return dir;
                     } else if (dir.exists()) {
                         System.err.println("Fichero ya existe: "+showCanonicalPath(dir));
                         return dir;
                     }} catch (IOException ex) {
                     System.out.println("Error de Entrada salida : "+showCanonicalPath(dir));
                 }
            } else {
                System.err.println("Error con la ruta insertada : "+showCanonicalPath(f));
            }
        return null;
    }
    
    
    
    
    
    public static void moveFile(String r,File or,File dest){
        if (or.isDirectory()&&dest.isDirectory()) {
             File filOr = new File(or.getPath()+r);
             File filDest=new File(dest.getPath()+r);   
             if(filOr.exists()){ 
                if (!filDest.exists()&& filOr.renameTo(filDest)) {
                         System.out.println("Fichero movido: "+showCanonicalPath(filDest));    
                } else if (filDest.exists()) {
                         System.err.println("Fichero no movido ya existe en destino: "+showCanonicalPath(filDest));
                         
                     }
            } else {
                System.err.println("Error con la ruta insertada : "+showCanonicalPath(or));
            }
       
    }
    }
    
    public static void deleteDirectory(File dir){
    
    File[] list=dir.listFiles();
    while(list.length!=0){
        for (File file : list) {
            if(file.isDirectory()){
                if(file.delete()){
                    System.out.println("Directorio "+file.getPath() +" borrado");
                }else{
                    DirectorioTools.deleteDirectory(file);
                }
            }else{
                System.out.println((file.delete()?"fichero borrado->"+file.getPath():"fichero no borrado->"+file.getPath()));
            }
        }
        list=dir.listFiles();
    }
        System.out.println((dir.delete())?"Directorio borrado->"+dir.getPath():"Directorio no borrado->"+dir.getPath());
      
        
        
    }

    
    

    public static String showCanonicalPath(File f){
        try {
           return f.getCanonicalPath();
                    } catch (IOException e) {
            System.out.println("Error de formato de directorio");
            
        }
        return null;
    }
    
}
