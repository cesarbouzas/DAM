package Vista;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author AD
 */
public class Ejercicio15_LeerFicherodeObjetos {

    public static void main(String[] args) {

        try ( FileInputStream fichsalida = new FileInputStream(new File("src/Datos/fichbinarioorigen.dat"));  ObjectInputStream dataIS = new ObjectInputStream(fichsalida);) {
            ArrayList<Per> personas = new ArrayList<Per>();

            try {
                while (true) {
                    Per persona = (Per) dataIS.readObject();
                    System.out.println("Nombre :" + persona.getNombre() + " , edad :" + persona.getEdad());
                    //tb podriamos meterlo en una lista   
                    // personas.add(persona);       
                }
            } catch (EOFException ex) {
                System.out.println("Final de Fichero");
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio15_LeerFicherodeObjetos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio15_LeerFicherodeObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
