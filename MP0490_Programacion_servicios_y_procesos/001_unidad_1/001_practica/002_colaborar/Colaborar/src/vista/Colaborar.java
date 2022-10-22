
package vista;

import java.io.File;
import java.io.IOException;
public class Colaborar {

    public static void main(String[] args) {
       Process newProcess=null;
       File f=new File("archivo.txt");
         try{
            for (int i = 10; i <=100; i=i+10){
                String comand="java -jar Lenguaje.jar "+i+" "+f.getName();
                newProcess = Runtime.getRuntime().exec(comand);
                System.out.println(comand+" -------->Lanzado");
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



