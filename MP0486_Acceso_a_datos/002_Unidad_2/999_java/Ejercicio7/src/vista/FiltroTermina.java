/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Usuario
 */
public class FiltroTermina implements FilenameFilter {

    String filtro;
    public FiltroTermina(String s) {
       filtro= s.trim();
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(filtro);
        
    }
}
    

