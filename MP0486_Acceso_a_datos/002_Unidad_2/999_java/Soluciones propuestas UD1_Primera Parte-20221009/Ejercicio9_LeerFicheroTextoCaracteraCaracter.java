/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9_LeerFicheroTextoCaracteraCaracter {

    public static void main(String[] args) {

        FileReader fichorigen = null;
        FileWriter fichdestino = null;
        int i;
        try {

            fichorigen = new FileReader("./src/Datos/Origen.txt");
            fichdestino = new FileWriter("./src/Datos/Destino9.txt");
            
            //Si le indicas como parámetro la opción true.No sobreescribe el fichero. Añade.
            //fichdestino = new FileWriter("./src/Datos/Destino.txt",true);

            fichdestino.write("FICHERO COPIADO\n"); //Opcionalmente si se quiere le añadimos al principio texto
                                                    //para diferenciarlo
            while ((i = fichorigen.read()) != -1) {
                fichdestino.write(i);            
            }

        } catch (IOException e) {
        } finally {
            try {
                //Es importante que observes que los ficheros hay que cerrarlos.
                
                if (fichorigen != null && fichdestino != null) {
                    fichorigen.close();
                    fichdestino.close();
                }
            } catch (Exception e2) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }

}
