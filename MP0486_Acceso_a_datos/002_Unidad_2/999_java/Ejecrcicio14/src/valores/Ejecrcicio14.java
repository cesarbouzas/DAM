//Escribe un programa que permita crear un fichero de objetos de la clase persona , solo guardamos
//nombre y edad, denominado fichbinarioorigen.dat. Para evitar la petición de datos por teclado, los
//datos los inicializarás en la aplicación.
//A continuación crearás otro programa que permita leer el fichbinarioorigen.dat y mostrará los datos
//por pantalla. Todos los ficheros estarán en el package “Datos”.
//El proceso de lectura/escritura (I/O) de los ficheros lo harás utilizando las clases FileInputStream,
//FileOutputStream, ObjectOutputStream y ObjectInputStream.

package valores;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Ejecrcicio14 {

 
    public static void main(String[] args) {
      List<Person> persons=new ArrayList();
        persons.add(new Person("César",45));
        persons.add(new Person("Nati",47));
        persons.add(new Person("Manuel",10));
        persons.add(new Person("Mateo",4));
        writeListClassToFile(new File("./src/datos"), "ficherobinariorigen.dat", persons);
        readListClass(new File("./src/datos"), "ficherobinariorigen.dat");
    }

static void writeListClassToFile(File dir , String name,List<Person> p){
    File file=new File(dir.getPath()+ "/"+name);
    System.out.println(file.getPath());
    if(file.exists()){
        file.delete();
        System.out.println("Fichero "+file.getPath()+ " borrado");
    }
    
        try (
                 FileOutputStream fOS = new FileOutputStream(file);
                ObjectOutputStream oOS = new ObjectOutputStream(fOS);) {
            for (Person person : p) {
                oOS.writeObject(person);
                System.out.println(person.getName() + "-->" + person.getAge() + " años.");
            }
        } catch (IOException e) {
            System.err.println("error de fichero");
        } finally {
        }
    }
static void readListClass(File dir, String name){
        File file=new File(dir.getPath()+"/"+name);
        if(file.exists() && file.isFile()){
            try(
                    FileInputStream fIS=new FileInputStream(file);
                    ObjectInputStream oIS=new ObjectInputStream(fIS);
                    ){
                try{
                    System.out.println("***********************LECCTURA DESDE FICHERO***********************************");
                    System.out.println("**********************"+file.getPath()+"***********************");
                    while(true){
                         
                    System.out.println((Person)oIS.readObject());
                    }
                }catch(EOFException e){
                    System.out.println("Final de fichero .... "+file.getPath()+" Leido");   
                }
            }catch(IOException e){
                System.err.println("Error de fichero");
            } catch (ClassNotFoundException ex) {
                System.err.println("Error de clase");
            }finally{}
        }
}

}






class Person implements Serializable{
private String name;
private int age;

    public Person(String nombre, int edad) {
        this.name = nombre;
        this.age = edad;
    }
    public Person(){
    this.name=null;
    }
    
    
public String getName(){
    return name;
}
public int getAge(){
    return age;
}

public String toString(){
    return (this.getName() + "-->" + this.getAge() + " años.");
}




}