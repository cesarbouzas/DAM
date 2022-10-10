/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio9_1_LeerFicheroTextoCaracteraCaracter {

    public static void main(String[] args){

        int i;
        //Con esta  versión los ficheros se cierran automáticamente.
        try (FileReader fichorigen = new FileReader("./src/datos/Origen.txt");
             FileWriter fichdestino = new FileWriter("./src/datos/Destino9_1.txt");)
            {
            while ((i = fichorigen.read()) != -1) {
                fichdestino.write(i);            
            }

        } catch (Exception e) {
        } finally {
        
        }
    }

}
