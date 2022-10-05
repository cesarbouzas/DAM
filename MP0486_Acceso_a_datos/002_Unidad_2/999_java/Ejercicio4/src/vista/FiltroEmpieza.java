
package vista;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author cesar
 */
public class FiltroEmpieza implements FilenameFilter{
    
    String letra;
    
    FiltroEmpieza(String s){
        this.letra=s.trim();   
    }

    @Override
    public boolean accept(File dir,String name) {
    
    if(dir.exists()&&!name.isEmpty()&&!name.isBlank()){
        return name.trim().toLowerCase().startsWith(this.letra);
    }else{
           System.out.println("El directorio no existe o filtro no válido");
         return false;  
        }
    }
    
}
