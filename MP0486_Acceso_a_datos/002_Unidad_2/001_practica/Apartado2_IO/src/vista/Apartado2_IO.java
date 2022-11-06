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



/**
 *
 * @author cesar
 */
public class Apartado2_IO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int op=0;      
   File f=new File("src/datos/empleados.dat"); 
   createFile(f);
   ArrayList<Employee> employees=createListEmployee();
   try{
   writeFileEmployee(f, employees);
   }catch(FileNotFoundException e){
       System.out.println("Error de Fichero");
   }
   op=showMenu();
   switch (op){
       case 1:
       {
           try {
               readFileEmployee(f);
           } catch (IOException ex) {
               System.out.println("Fin de Fcihero");
           }
       }
           break;

       case 2:
           System.out.println("Código de emplado ?");
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
           System.out.println("Fin del programa");
           break;
           
   
   }
        

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
      System.out.println("2.-Visualizar un emplado.(Buscarlo por su código");
      System.out.println("3.-Salir");
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
              System.out.println(e+" almacenado en fichero");
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
          if(i==cod){
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
  
  }

      
      
    
   
    
    
    
    
    

