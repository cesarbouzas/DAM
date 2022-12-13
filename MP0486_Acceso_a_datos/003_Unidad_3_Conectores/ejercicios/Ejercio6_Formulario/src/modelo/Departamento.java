
package modelo;

/**
 *
 * @author Usuario
 */
public class Departamento {


private int nDepartamento;
private String nombreDepartamento;
private String localizacionDepargamento;


public Departamento(){

}
public Departamento(int n,String nombre,String localizacion){
this.nDepartamento=n;
this.nombreDepartamento=nombre;
this.localizacionDepargamento=localizacion;
}

    
    public int getnDepartamento() {
        return nDepartamento;
    }

    public void setnDepartamento(int nDepartamento) {
        this.nDepartamento = nDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getLocalizacionDepargamento() {
        return localizacionDepargamento;
    }

    public void setLocalizacionDepargamento(String localizacionDepargamento) {
        this.localizacionDepargamento = localizacionDepargamento;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nDepartamento=" + nDepartamento + ", nombreDepartamento=" + nombreDepartamento + ", localizacionDepargamento=" + localizacionDepargamento + '}';
    }






}
