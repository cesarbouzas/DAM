/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;




/**
 *
 * @author cesar
 */
public class Apartado2_IO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int op;      
   File f=new File("src/datos/empleados.dat"); 
   createFile(f);
   ArrayList<Employee> employees=createListEmployee();
   try{
   writeFileEmployee(f, employees);
   }catch(FileNotFoundException e){
       System.out.println("Error de Fichero");
   }
   do{
    op=showMenu();
     switch (op){
       case 1:
       {
           try {
               readFileEmployee(f);
           } catch (IOException ex) {
               System.out.println("Fin de Fichero");
           }
       }
           break;

       case 2:
           System.out.println("Código del empleado ?");
           Scanner sc=new Scanner(System.in);
       {
           int op2=sc.nextInt();
           try {
               readFileEmployeeCod(f,op2);
           } catch (IOException ex) {
               System.out.println("Error de I/O");
           }
       }
           break;
       case 3:
           createXmlEmployees(employees);
           break;
       case 4:
           System.out.println("Fin del programa");
          
            }        
    }while(op!=4);
   }
        

    
    public static ArrayList<Employee> createListEmployee(){
      Employee e1=new Employee("cesar","A coruña",2500.45f,0.20f);
      Employee e2=new Employee("Natividad", "Novoa Santos",1395.56f,0.1f);
      Employee e3=new Employee("Jose Antonio","Feas",1495.48f, 0.23f);
      Employee e4=new Employee("Sopelana", "Santander",2598.45f, 0.25f);
      Employee e5=new Employee("Sandra", "Puerto Exterior", 1100.01f, 0.1f);
      
        ArrayList<Employee> empleados=new ArrayList();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);
    return empleados;
    }
    
    
  public static int  showMenu(){
      int op=0;
      Scanner sc=new Scanner(System.in);
      while(op<1||op>3){
      System.out.println("********************Menu Emplados************************");
      System.out.println("1.-Visualizar todos los empleados");
      System.out.println("2.-Visualizar un emplado.(Buscarlo por su código)");
      System.out.println("3.-Crear fichero XML");
      System.out.println("4.-Salir");
      System.out.print(" Elige una opción ?");
      op=sc.nextInt();
      }
      return op;
  }
  public static void createFile(File f){
   
          if(!f.getParentFile().exists()){
            if(f.getParentFile().mkdir()){
                try {
                    f.createNewFile();
                    System.out.println("Fichero .dat creado...");
                } catch (IOException iOE) {
                    System.err.println("Error de I/O en creacion de fichero "+f.getName());
                }
                }else{
                System.err.println("Error ,directorio no creado");
                }
        }else{
            System.out.println("El directorio "+f.getParentFile()+ " ya existe");
                if(f.exists()){
                    System.out.println(f.getName()+" ya existe");
                }else{
                try {
                    System.out.println(f.createNewFile()?"fichero creado"+f.getName():"fichero no creado"+f.getName());
                } catch (IOException ex) {
                    System.out.println("Error de I/O en creacion de fichero");
                }
                }
        }
  }
  
  public static void writeFileEmployee(File f,ArrayList<Employee> empleados) throws FileNotFoundException{
        RandomAccessFile rAF=new RandomAccessFile(f, "rw");
        for(Employee e:empleados){
          try {
              rAF.writeBytes(e.toString()+"\n");
             
          } catch (IOException ex) {
              System.out.println("Error de escritura en Random Acces File");
          }
        }
  
  }
  public static void readFileEmployee(File f) throws FileNotFoundException, IOException{
      RandomAccessFile rAF=new RandomAccessFile(f,"r");
      
      while(rAF.readBoolean()){
          System.out.println(rAF.readLine());
      
      }
  }
      public static void readFileEmployeeCod(File f,int cod) throws FileNotFoundException, IOException{
      RandomAccessFile rAF=new RandomAccessFile(f,"r");
      String line=null;
      for(int i=0;i<=5;i++){
          line=rAF.readLine();
          if(i==cod-1){
                 System.out.println(line);
          }
      }
      }
      public static int  showMenu2(){
      int op=0;
      Scanner sc=new Scanner(System.in);
      while(op<1||op>5){
   
      System.out.print(" Elige una opción ?");
      op=sc.nextInt();
      }
      return op;
  }
      
      public static void createXmlEmployees( ArrayList<Employee> employees){
        try {
            File f=new File("src/datos/employees.xml");
            createFile(f);
            DocumentBuilderFactory dBFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder db=dBFactory.newDocumentBuilder();
            Document doc=db.newDocument();
            doc.normalize();
            Element root=doc.createElement("empleados");
            doc.appendChild(root);
            for(Employee e:employees){
                createSchema(doc, root, e);
            }
            DOMSource source=new DOMSource(doc);
            StreamResult result =new StreamResult(f);
            TransformerFactory tf=TransformerFactory.newInstance();
            Transformer t=tf.newTransformer();
            t.transform(source, result);
            
            
        } catch (ParserConfigurationException ex) {
            System.out.println("Error de parseador");
        } catch (TransformerConfigurationException ex) {
            System.out.println("Erro de configuracion de Transformer");
        } catch (TransformerException ex) {
            System.out.println("Error genral transformer");
        }
      }
  
      public static Element createElement(Document doc ,Element parent,String name,String text){
      Element e=doc.createElement(name);
      e.setTextContent(text);
      parent.appendChild(e);
      return e;
      }
      public static void createSchema(Document doc,Element root,Employee em){
             Element e=createElement(doc, root, "Empleado",null);
            createElement(doc,e,"Codigo",""+em.getCod());
            createElement(doc, e,"Nombre" , em.getName());
            createElement(doc,e,"Salary",""+em.getSalary());
            createElement(doc,e,"Comison",""+em.getComision());
            
      }
}

  
