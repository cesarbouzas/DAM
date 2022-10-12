
package valores;

import java.io.File;
import java.io.FilenameFilter;


/**
 *
 * @author cesar
 */
public class  Filtro implements FilenameFilter {
    private String name;
    public Filtro(String name) {
    this.name=name;
    }
    
    @Override
    public boolean accept(File dir, String name) {
        return dir.getName().equalsIgnoreCase(this.name);
        }
    }

 
