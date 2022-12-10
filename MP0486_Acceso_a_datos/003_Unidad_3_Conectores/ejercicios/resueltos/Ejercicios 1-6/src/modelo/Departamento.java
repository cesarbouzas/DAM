package modelo;


public class Departamento {

    int num;
    String nombredep;
    String loc;

    public Departamento(int num, String nombredep, String loc) {
        this.num = num;
        this.nombredep = nombredep;
        this.loc = loc;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombredep() {
        return nombredep;
    }

    public void setNombredep(String nombredep) {
        this.nombredep = nombredep;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    
   @Override
    public String toString() {
        return this.getNombredep()+"--"+this.getLoc(); //Enunciado 4
        //return this.getNum()+""; //Le añadimos +"" para que devuelva el string Enunciado 5
    }
}
