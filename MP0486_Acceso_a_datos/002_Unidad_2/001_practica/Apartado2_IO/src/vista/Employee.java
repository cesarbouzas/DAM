/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author cesar
 */
public class Employee {

    private static int cont = 0;

    private int cod;
    private String name;
    private String direction;
    private float salary;
    private float comision;

    public Employee(String name, String direction, float salary, float comision) {
        this.cod = ++cont;
        this.name = name;
        this.direction = direction;
        this.salary = salary;
        this.comision = comision;
    }

    @Override
    public String toString() {
        return " Empleado nº :" + this.cod + "--->" + this.name + " , " + this.direction + " [" + this.salary + "€," + this.comision + "%].";
    }

    public static int getCont() {
        return cont;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public float getComision() {
        return comision;
    }

}
