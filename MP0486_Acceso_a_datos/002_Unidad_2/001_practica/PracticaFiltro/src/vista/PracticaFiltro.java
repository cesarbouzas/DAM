/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author Usuario
 */
public class PracticaFiltro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        File f=new File("/..");
        System.out.println(f.getAbsolutePath());
        Filter filtro=new Filter("b");
        File[] ficheros=f.listFiles(filtro);
        for(File ff:ficheros){
            System.out.println(ff.getName());
        }
      
    }
    
}
class Filter implements FileFilter{

    private String expresion;
    public Filter(String s) {
    this.expresion=s.trim();
    }

    
    
    @Override
    public boolean accept(File f) {
        return f.getName().startsWith(expresion);
    }


}
