/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.SpringLayout;
import modelo.Coste;

/**
 *
 * @author Usuario
 */
public class ControladorCoste {
    private static Scanner sc=new Scanner(System.in);
    
    public static int mostarMenu(){
        
        System.out.println("*****************************************");
        System.out.println("1)(C)Crea nuevo Coste.");
        System.out.println("2)(R)Consulta un Coste");
        System.out.println("3)(U)Modifica un Coste");
        System.out.println("4)(D)Borra un Coste");
        System.out.println("Opcion ?");
        return sc.nextInt();
                
                
    
    
    }
    
    
    
    
    public static Coste leerCoste(){
        boolean lectura=false;
        //formato de fecha
        SimpleDateFormat sDF=new SimpleDateFormat("dd/MM/yy");
        //nuevo costes
        Coste c=new Coste();
        //Lectura por teclado
        while(!lectura){
        System.out.println("Fecha de Cierre(dd/mm/aa): ");
        try {
            c.setAccountingDate(sDF.parse(sc.nextLine()));
            lectura=true;
        } catch (ParseException ex) {
            System.err.println("Error de formato Fecha");;
        }
        }
        //Leemos la fecha de operacion
        lectura=false;
        while(!lectura){
        System.out.println("Fecha de opreación(dd/mm/aa): ");       
        try {
            c.setDate(sDF.parse(sc.nextLine()));
            lectura=true;
        } catch (ParseException ex) {
            System.err.println("Error de formato Fecha");
        }
        }
        //Leemos proveedor
        System.out.println("Proveedor :");
        c.setSupplier(sc.nextLine());
        //Leemos albaran
        System.out.println("Albaran :");
        c.setnDeliveryNote(sc.nextLine());
        //Leemos matricula
        System.out.println("Matricula :");
        c.setCarRegistration(sc.nextLine());
        //Leemos concepto
        System.out.println("Concepto :");
        c.setConcepto(sc.nextLine());
        //Leemos cantidad
        System.out.println("cantidad :");
        c.setAmount(sc.nextDouble());
        //Leemos precio
        System.out.println("Precio :");
        c.setPrice(sc.nextDouble());
        //Calculamos y alamcenamos total
        c.setTotal(c.getAmount()*c.getPrice());
        System.out.println("El total es :"+c.getTotal());
        //Leemos codigo de imputacion
        System.out.println("Cod imputacion");
        c.setImputacionCode(sc.nextLine());  
        return c;
    }
}

    

