
package valores;

import java.io.Serializable;



class Employee implements Serializable {
    private  static int counter ;
    
    private int numberEmployee;
    private String surname ;
    private int departamentNumber;
    private double salary;

    public Employee(){
        
    }
    
    public Employee(String surname,int departamentNumber,double salary){
        this.numberEmployee=Employee.counter+1;
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
    
      public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDepartamentNumber(int departamentNumber) {
        this.departamentNumber = departamentNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public String showData() {
        return "{surname=" + surname + ", departamentNumber=" + departamentNumber + ", salary=" + salary + '}';
    }
 
    
}