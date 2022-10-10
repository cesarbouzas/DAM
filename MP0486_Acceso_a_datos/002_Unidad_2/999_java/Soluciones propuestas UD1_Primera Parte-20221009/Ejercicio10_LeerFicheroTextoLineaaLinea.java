/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio10_LeerFicheroTextoLineaaLinea {

    public static void main(String[] args){

        //Para leer linea a linea utilizaremos el buffer
        String linea;
        try (FileReader fichorigen = new FileReader("./src/datos/Origen.txt");
             FileWriter fichdestino = new FileWriter("./src/datos/Destino10.txt");
             BufferedReader br =new BufferedReader(fichorigen);
             BufferedWriter bw= new BufferedWriter(fichdestino);)
            
            {
             while ((linea = br.readLine()) != null) {
                //Opcionalmente podríamos procesar la linea para operar con ella algo
                // Ejem:Cuantas vocales por linea hay
                bw.write(linea+"\n");            
            }
                    
        } catch (Exception e) {
        } finally {
        
        }
    }

}
