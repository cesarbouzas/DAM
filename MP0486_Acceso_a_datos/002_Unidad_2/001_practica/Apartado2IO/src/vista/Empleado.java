/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class Empleado {
    static int contador=1;
    private int codigo;
    private String nombre;
    private String direccion;
    private double salario;
    private double comision;

    public Empleado(String name,String direction,double salary,double comision) {
    this.codigo=contador++;
    this.nombre=name;
    this.direccion=direction;
    this.salario=salary;
    this.comision=comision;
    }
    
    @Override
  public String toString(){
      
        return "El empleado nº "+codigo+ "->"+nombre+","+direccion+" sueldo :"+salario+ "euros"+" y comisión de "+comision;
  
  }
    
    
    
    
    
    
}
