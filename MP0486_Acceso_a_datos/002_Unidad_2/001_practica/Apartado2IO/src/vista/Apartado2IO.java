/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Apartado2IO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1=new Empleado("Cesar", "Ernesto che gue", 1890.01, 10.01);
        Empleado e2=new Empleado("Manuel", "Avd das Mariña", 2589.98, 23.01);
        Empleado e3=new Empleado("Mateo", "Simon bolivar", 1800, 15.05);
        Empleado e4=new Empleado("Natividad", "Casa ramon", 9999.99, 99.99);
        Empleado e5=new Empleado("Raquel", "Holanda", 3890.01, 30.01);  
        ArrayList<Empleado> empleados=new ArrayList();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);
        
        
        
        
        
        
        
        
        try {
            File f=new File("src/datos/empleados.dat");
            RandomAccessFile rAf=new RandomAccessFile(f,"wr");  
            
            if(!f.getParentFile().exists()){            
                f.mkdir();
            }else{
               rAf.writeInt(0);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Apartado2IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
