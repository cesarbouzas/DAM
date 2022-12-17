
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Departamento;

/**
 *
 * @author Usuario
 */
public class GestorDepartamento {
    
    public static Departamento obtenerDepartamento(int numero){
        Departamento d=null;
        String consulta;
        
     consulta ="select from deparatamentos where dept_no="+numero;   
     ResultSet rs;
     try(Statement senetencia =Pool.getCurrentConexion().createStatement();){
     rs=senetencia.executeQuery(consulta);
     d.setNumero(rs.getInt(1));
     d.setNombre(rs.getString(2));
     d.setLocalizacion(rs.getString(3));
     rs.close();
     return d;
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de consulta (100)");
    }
     return d;
}
}
