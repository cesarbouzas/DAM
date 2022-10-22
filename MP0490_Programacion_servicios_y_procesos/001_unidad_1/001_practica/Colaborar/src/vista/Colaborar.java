
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
       File f=new File("archivo.txt");
        System.out.println(f.getAbsolutePath());
         try{
            for (int i = 10; i <=100; i=i+10){ 
                newProcess = Runtime.getRuntime().exec("java -jar Lenguaje.jar "
                        + i
                        + f.getPath());
                System.out.println(newProcess.info());
                System.out.println(newProcess.exitValue());         
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
    

