/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Lenguaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;

        File f = createFile(args[1]);
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            s = createWord();
            writeFile(f, s);
            System.out.println(s);
        }
    }
    public static File createFile(String r){
        File f = new File(r);
        String sOname = System.getProperty("os.name").toLowerCase();
        if (sOname.contains("win")) {
            if (!r.isEmpty()) {
                f = new File(r.toLowerCase().replace("//", "\\"));
            } else {
                f = new File("c:\\FicheroDeLenguaje.txt");
            }
        }
    return f;
    }
    public static String createWord(){
        int n=1+(int)(Math.random()*8);
        String word="";
       for(int i=0 ;i<n;i++ ){
        word+=(ramdomChar());        
        }
        
       return word;
    }
    public static void writeFile(File f,String s){
        try 
        (
          FileWriter fW=new FileWriter(f, true);
          BufferedWriter bW=new BufferedWriter(fW);
         )
       
        {
                bW.write(s+"\n");
        } catch (FileNotFoundException eFNFE ) {
            System.err.println("Fichero no encontrado");
            eFNFE.printStackTrace();
        }catch(IOException eIOE){
             System.err.println("Eror de entrada/salida");
                eIOE.printStackTrace();
                              
        }finally{}

    }
    public static char ramdomChar(){
        int ramdomInt=(int)(97+Math.random()*(122-97));
        System.out.println(ramdomInt+" ----> "+(char)(ramdomInt));
        return (char)ramdomInt;
    }
    
    
    
    
    
    
}
