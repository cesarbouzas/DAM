/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valores;

//ENUNCIADO 12_13: Leer/escribir ficheros de datos.
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//Escribe un programa que permita crear un fichero de datos (nombre y edad de personas)
//denominado fichorigen.dat. Para evitar la petición de datos por teclado, los datos los inicializarás en
//la aplicación.
//A continuación crearás otro programa que permita leer el fichorigen.dat y mostrará los datos por
//pantalla. Todos los ficheros estarán en el package “Datos”.
//El proceso de lectura/escritura (I/O) de los ficheros lo harás utilizando las clases FileInputStream,
//FileOutputStream, DataOutputStream y DataInputStream.
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> personas = new ArrayList();
        personas.add(new Person("Cesar", 45));
        personas.add(new Person("Pedro", 47));
        personas.add(new Person("Felix", 44));
        personas.add(new Person("Azahara", 42));
        personas.add(new Person("Daniel", 49));
        personas.add(new Person("Mateo", 4));
        personas.add(new Person("Manuel", 10));
        writePersonOnFile(new File("./src/datos/"), "fichorigen.dat", personas);
        readPersonOnFile(new File("./src/datos/"), "fichorigen.dat");
    }

    static void writePersonOnFile(File dir, String nombre, List<Person> persons) {
        File archivo = new File(dir.getPath()+"/"+nombre);
        if (archivo.isFile()) {
            dir.delete();
            System.out.println("Fichero " + archivo.getName() + " borrado!!");
        }
        try (
                 FileOutputStream fOS = new FileOutputStream(archivo);  
                   var dOS = new DataOutputStream(fOS);) {
            for (Person person : persons) {

                dOS.writeUTF(person.getName());
                dOS.writeInt(person.getAge());
            }
        } catch (IOException e) {
            System.err.println("Error de archivo de salida");
        } finally {
        }

    }
    static void readPersonOnFile(File dir, String nombre){
        File archivo = new File(dir.getPath()+"/"+nombre);
    if (archivo.isFile()==false) {
            
            System.err.println("Fichero " + archivo.getName() + " error!!");
    }else{
        try(
        FileInputStream fIS=new FileInputStream(archivo);
        var dIS=new DataInputStream(fIS);
        ){
            while(dIS.available()!=0){
                System.out.println("Nombre "+dIS.readUTF() +" Edad :"+dIS.readInt());
            }
        }catch(IOException e){
            System.err.println("Error de archivo de lecturas");
        }finally{}
    }
    
    }
    

}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
