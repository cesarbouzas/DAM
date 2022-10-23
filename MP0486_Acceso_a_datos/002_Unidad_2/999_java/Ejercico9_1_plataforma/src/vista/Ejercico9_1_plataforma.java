/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Usuario
 */
public class Ejercico9_1_plataforma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

        int i;
        //Con esta  versión los ficheros se cierran automáticamente.
        try (
                FileReader fichorigen = new FileReader("./src/datos/Origen.txt");
                FileWriter fichdestino = new FileWriter("./src/datos/Destino9_1.txt");
             )
            {
            while ((i = fichorigen.read()) != -1) {
                fichdestino.write(i);            
            }

        } catch (Exception e) {
        } finally {
        
        }
    }

}

    
    

