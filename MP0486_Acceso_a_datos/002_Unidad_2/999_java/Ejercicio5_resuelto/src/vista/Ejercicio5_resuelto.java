package vista;

import java.io.*;


public class Ejercicio5_resuelto {

    public static void main (String[] args) throws IOException{
        String [] carpeta={"Deporte","Individual","Colectivo","Tenis","Futbol","Baloncesto"};
               
        System.out.println((new File("./src/"+carpeta[0]).mkdir())? "directorio creado":"directorio no creado");
        System.out.println((new File("./src/"+carpeta[0]+"/"+carpeta[1]).mkdir())?"directorio creado":"directorio no creado");
        System.out.println((new File("./src/"+carpeta[0]+"/"+carpeta[2]).mkdir())?"directorio creado":"directorio no creado");
        System.out.println((new File("./src/"+carpeta[0]+"/"+carpeta[2]).mkdir())? "directorio creado":"directorio no creado");
        System.out.println((new File("./src/"+carpeta[0]+"/"+carpeta[1]+"/"+carpeta[3]).mkdir())? "directorio creado":"directorio no creado");
        System.out.println((new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[4]).mkdir())? "directorio creado":"directorio no creado");
        System.out.println((new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[5]).mkdir())? "directorio creado":"directorio no creado");
           
        //En este caso utilizamos la instanciación del fichero indicando el directorio

        System.out.println((new File ("./src/"+carpeta[0]+"/"+carpeta[1]+"/","Fichindividual1.java").createNewFile())?"fihero creado":"fichero no creado");
         System.out.println((new File ("./src/"+carpeta[0]+"/"+carpeta[1]+"/","Fichindividual2.java").createNewFile())?"fihero creado":"fichero no creado");
         System.out.println((new File ("./src/"+carpeta[0]+"/"+carpeta[2]+"/","FichColectivo1.java").createNewFile())?"fihero creado":"fichero no creado");
         System.out.println((new File (new File("./src/"+carpeta[0]+"/"+carpeta[1]+"/"+carpeta[3]+"/"),"FichTenis.txt").createNewFile())?"fihero creado":"fichero no creado");
         System.out.println((new File (new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[5]+"/"),"FichBaloncesto1.java").createNewFile())?"fihero creado":"fichero no creado");
         System.out.println((new File (new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[5]+"/"),"FichBaloncesto2.txt").createNewFile())?"fihero creado":"fichero no creado");
         System.out.println((new File (new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[5]+"/"),"FichBaloncesto3.txt").createNewFile())?"fihero creado":"fichero no creado");
             
        var origen=new File (new File("./src/"+carpeta[0]+"/"+carpeta[2]+"/"+carpeta[5]),"FichBaloncesto2.txt");
        var destino= new File (new File("./src/"+carpeta[0]+"/"+carpeta[1]+"/"+carpeta[3]),"FichBaloncesto2movido.txt");        
        origen.renameTo(destino);
    
    }
}