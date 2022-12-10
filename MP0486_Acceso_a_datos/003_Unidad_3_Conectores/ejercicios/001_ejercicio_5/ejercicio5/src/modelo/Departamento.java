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
    private int nDepartamneto;
    private String Nombre;
    private String localizacion;

    public int getnDepartamneto() {
        return nDepartamneto;
    }

    public void setnDepartamneto(int nDepartamneto) {
        this.nDepartamneto = nDepartamneto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return  nDepartamneto+"" ;
    }
  
    
}
