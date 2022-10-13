//ENUNCIADO 16_17: Leer/escribir RAF
//Escribe un programa que permita crear un fichero de acceso aleatorio, un random access file,
//denominado ficheroRAF.dat
//Los datos que va a guardar tendrá este formato:
//numeroempleado entero + apellido (10 caracteres)+ numerodedepartamento entero + salario double
//Teniendo en cuenta que los enteros son 4 bytes, los caracteres el doble de bytes de lo que ocupan y
//los doubles 4 bytes. Tenemos que el registro ocupa 4+20+4+8=36 bytes.
//Para evitar la petición de datos por teclado, los datos los inicializarás en la aplicación.
//A continuación crearás un programa que permita leer los datos del fichero creado. Puedes verificar
//que puedes leer un registro cualquiera, por eso es de acceso aleatorio, desplazándote con el seek
//directamente al registro mediante la fórmula (numeroderegistroabuscar-1)*tamañoderegistro.

package valores;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList();
        employees.add(new Employee("bouzas", 1, 2325.60));
        employees.add(new Employee("Gil", 1, 1500.60));
        employees.add(new Employee("Nunez", 3, 1325.60));
        
        
        
        
       
    }
    
    public void RandomFile(File dir, String nombre,List<Employee> e){
        
        try (
                 RandomAccessFile rAF = new RandomAccessFile(new File(dir.getPath() + "/" + nombre), "rw");) {
    
                for (Employee employee : e) {
                 rAF.writeInt(e.);
                    
                }

                }catch(IOException e){
            System.out.println("Error de entrada/Salida");
        }finally{}
            }

    
}

}
