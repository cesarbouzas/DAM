
package vista;

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
         try{
            for (int i = 1; i <=11; i++){
                newProcess = Runtime.getRuntime().exec("java -jar "
                        +"lenguaje.jar " 
                        + (i*10)
                        + " C:/Users/Usuario/Desktop/html_public/DAM/MP0490_Programacion_servicios_y_procesos/001_unidad_1/001_practica/Lenguaje/Lenguaje.txt");
                
                System.out.println("Creado el proceso " + i);
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
    

