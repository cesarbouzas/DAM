
package valores;

import java.io.Serializable;



class Employee implements Serializable {
    private  static int counter ;
    
    private int numberEmployee;
    private String surname ;
    private int departamentNumber;
    private double salary;
    
    public Employee(String surname,int departamentNumber,double salary){
        this.numberEmployee=Employee.counter;
        this.surname=surname;
        this.departamentNumber=departamentNumber;
        this.salary=salary;
        Employee.counter++;
    }

    public int getNumberEmployee() {
        return numberEmployee;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartamentNumber() {
        return departamentNumber;
    }

    public double getSalary() {
        return salary;
    }
    
    
 
    
}