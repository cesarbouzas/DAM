
package vista;

import java.io.File;
import java.io.IOException;
public class Colaborar {

    public static void main(String[] args) {
       Process newProcess=null;
        
         try{
            for (int i = 10; i <=100; i=i+10){ 
                newProcess = Runtime.getRuntime().exec("java -jar Lenguaje.jar "+i+ " archivo.txt");
            }
        }catch (SecurityException ex){
            System.err.println("Ha ocurrido un error de Seguridad."+
                    "No se ha podido crear el proceso por falta de permisos.");
        }catch (IOException ex){
            System.err.println("Ha ocurrido un error, Entrada/Salida."); 
        }catch(Exception ex){
             System.out.println("Error genérico");
                 
        }finally{
             
         }
    }
    }

    

