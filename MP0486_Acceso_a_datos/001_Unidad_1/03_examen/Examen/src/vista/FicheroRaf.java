/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import controlador.ControladorCoste;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Coste;

/**
 *
 * @author Usuario
 */
public class FicheroRaf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int op=0;
        ArrayList<Coste> costes=new ArrayList<>();
        
        while(op!=9){
            op=ControladorCoste.mostarMenu();
            switch (op) {
                case 1:
                    costes.add(ControladorCoste.leerCoste());
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        
        
        
        
        
        
        
        
        
        File f=new File("src/datos/costes.dat");
        if(!f.exists()){
            try {
                if(f.createNewFile()){
                    System.out.println("Fichero :"+f.getName() +" creado correctamente.");
                }
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Error de entrada Salida");
            }
        }else{
                System.out.println("Fichero : "+ f.getName()+ "ya existe");
              }
        
        try {
            RandomAccessFile rAF=new RandomAccessFile(f, "rw"); 
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Fichero no encontrado");
        }
  
    }
}
    
