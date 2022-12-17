
package vista;

import java.io.File;
import java.io.FilenameFilter;


public class Ejercicio_4 {
    

public static void main(String[] args){
    Filtro filtro=new Filtro();
    File dir=new File("src/datos/");
    File[] archivos=dir.listFiles(filtro);
    for(File a :archivos){
        System.out.println(a.getName());
    }
    
}   

}

class Filtro implements FilenameFilter{

    
        @Override
        public boolean accept(File dir, String name) {
            name=name.toUpperCase();
            return name.startsWith("E");
}
    }

