package Vista;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author AD
 */
public class Ejer12_Escribirdatosprimitivos {

    public static void main(String[] args) {

        try ( FileOutputStream ficherosalida = new FileOutputStream("./src/datos/fichorigen.dat");  
                var dataOS = new DataOutputStream(ficherosalida);) {
            
            String nombres[] = {"Ana", "Luis Miguel", "Alicia", "Pedro", "Manuel", "Andres",
                "Julio", "Antonio", "Maria Jesus"};
            int edades[] = {20, 22, 14, 15, 13, 16, 21, 20, 17};

            for (int i = 0; i < edades.length; i++) {
                dataOS.writeUTF(nombres[i]);
                dataOS.writeInt(edades[i]);
            }

        } catch (Exception e) {
        } finally {

        }
    }
}
