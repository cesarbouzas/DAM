/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                    System.out.println("Fichero creado: "+showCanonicalPath(dir));
                    return dir;
                } else if (dir.exists()) {
                    System.err.println("Fichero ya existe: "+showCanonicalPath(dir));
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
    public static String showCanonicalPath(File f){
        try {
           return f.getCanonicalPath();
                    } catch (IOException e) {
            System.out.println("Error de formato de directorio");
            
        }
        return null;
    }
    
}
