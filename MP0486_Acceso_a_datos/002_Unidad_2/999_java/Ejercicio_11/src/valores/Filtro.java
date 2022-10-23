
package valores;

import java.io.File;
import java.io.FilenameFilter;


/**
 *
 * @author cesar
 */
public class  Filtro implements FilenameFilter {
    private String regExp;
    public Filtro(String regExp) {
    this.regExp=regExp;
    }
    
    @Override
    public boolean accept(File dir, String name) {
        return name.startsWith(this.regExp);
        }
    }

 
