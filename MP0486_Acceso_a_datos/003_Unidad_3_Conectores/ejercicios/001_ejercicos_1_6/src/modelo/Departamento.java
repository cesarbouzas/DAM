/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Departamento {
    
    private int num;
    private String nombreDep;
    private String loc;
    
    
    public Departamento(int num,String nombreDep,String loc){
        this.num=num;
        this.nombreDep=nombreDep;
        this.loc=loc;
    }
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return this.nombreDep+"----"+this.loc;//Enucniado 4
        //return this.num+""; //Le añadimos +"" para convertirlo en  string Enunciado 5
    }
    

    
    
}
