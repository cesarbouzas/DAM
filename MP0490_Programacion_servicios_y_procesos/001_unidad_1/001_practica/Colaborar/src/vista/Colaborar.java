
package vista;

import java.io.File;

/**
 *
 * @author cesar bouzas
 */
public class Colaborar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Process newProcess;
       File f=new File("./src/vista/Lenguaje.txt");
         try{
            for (int i = 1; i <=10; i++){
                
                newProcess = Runtime.getRuntime().exec("java -jar "
                        +"Lenguaje.jar " 
                        + (i*10)
                        + f.getPath());
                
                System.out.println("Creado el proceso " + i +"en archivo "+f.getAbsolutePath());
                
                //Mostramos en consola que hemos creado otro proceso               
            }
            
        }catch (SecurityException ex){
            System.err.println("Ha ocurrido un error de Seguridad."+
                    "No se ha podido crear el proceso por falta de permisos.");
        }catch (Exception ex){
            System.err.println("Ha ocurrido un error, descripción: "+
                    ex.toString());
        }
    }
    }
    

