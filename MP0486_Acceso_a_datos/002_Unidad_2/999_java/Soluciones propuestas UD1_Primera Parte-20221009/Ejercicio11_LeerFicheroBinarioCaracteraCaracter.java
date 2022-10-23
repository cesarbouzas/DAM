/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio11_LeerFicheroBinarioCaracteraCaracter {

    public static void main(String[] args) {

      
        int i;
        try (FileInputStream fichorigen = new FileInputStream("./src/datos/ofelia.jpg");
             FileOutputStream fichdestino = new FileOutputStream("./src/datos/copiaofelia.jpg"); )
           {
            while ((i = fichorigen.read()) != -1) {
                fichdestino.write(i);            
            }

        } catch (IOException e) {
        } finally {
            }
        }
}