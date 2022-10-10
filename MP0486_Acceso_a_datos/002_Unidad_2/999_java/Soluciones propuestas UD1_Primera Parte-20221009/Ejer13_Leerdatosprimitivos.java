
package Vista;

import java.io.DataInputStream;
import java.io.FileInputStream;


/**
 *
 * @author AD
 */
public class Ejer13_Leerdatosprimitivos {

    public static void main(String[] args) {
        
        try ( FileInputStream ficheroentrada = new FileInputStream("./src/datos/fichorigen.dat");  
                var dataIS = new DataInputStream(ficheroentrada);) {    
                     
            while (dataIS.available()!=0){
                
                System.out.println("Nombre: "+dataIS.readUTF()+ "  Edad:"+dataIS.readInt());
            }
            

        } catch (Exception e) {
        } finally {

        }
    }
}
