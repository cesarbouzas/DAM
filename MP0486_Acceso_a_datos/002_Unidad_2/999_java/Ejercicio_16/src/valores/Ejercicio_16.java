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
        List<Employee> employees = new ArrayList();
        employees.add(new Employee("bouzas", 1, 2325.60));
        employees.add(new Employee("Gil", 1, 1500.60));
        employees.add(new Employee("Nunez", 3, 1325.60));
        employees.add(new Employee("Manuel",99,90000));
        writeRandomFile(new File("src/datos"), "ficheroRAF.dat", employees);
        readFieldFile(new File("src/datos"),"ficheroRAF.dat",4);
       }
    public static void writeRandomFile(File dir, String nombre, List<Employee> e) {
        File file=new File(dir.getPath()+"/"+nombre);
        StringBuffer apellido=null;
        try (
                RandomAccessFile rAF = new RandomAccessFile(file, "rw");   
                ) 
        {
            for (Employee employee : e) {
                rAF.writeInt(employee.getNumberEmployee());
                System.out.println(employee.getNumberEmployee()+" puntero--->"+rAF.getFilePointer());
                apellido=new StringBuffer(employee.getSurname());
                apellido.setLength(10);
                rAF.writeChars(apellido.toString());
                System.out.println(apellido+" puntero--->"+rAF.getFilePointer());
                rAF.writeInt(employee.getDepartamentNumber());
                System.out.println(employee.getDepartamentNumber()+" puntero--->"+rAF.getFilePointer());
                rAF.writeDouble(employee.getSalary());
                System.out.println(employee.getSalary()+" puntero--->"+rAF.getFilePointer());
            }

        } catch (IOException ex) {
            System.out.println("Error de entrada/Salida");
        } finally {
        }
    }

    public static void readFieldFile(File file, String fileName,int field) {
         File f=new File(file.getAbsolutePath()+"/"+fileName);
         int employeeLength=36;
         int numEmployee;
         char[] auxSurName=new char[10];
         Employee eTemp=new Employee();
         try(
         RandomAccessFile rAF=new RandomAccessFile(f,"r");
             )
         {
             
             rAF.seek((field-1)*employeeLength);
             System.out.println(rAF.getFilePointer());
             numEmployee=rAF.readInt();
             for(int i=0;i<10;i++){
                auxSurName[i]= rAF.readChar();
             }
             eTemp.setSurname(String.valueOf(auxSurName));
             eTemp.setDepartamentNumber(rAF.readInt());
             eTemp.setSalary(rAF.readDouble());
             System.out.println("+++++++++++++++Registro "+field+" leido+++++++++++++++++++++");
             System.out.println("El emplado "+numEmployee+"-->"+eTemp.showData());
         }catch(IOException e){
             System.err.println("Error de entrada/salida");
         }
        
    }
}
