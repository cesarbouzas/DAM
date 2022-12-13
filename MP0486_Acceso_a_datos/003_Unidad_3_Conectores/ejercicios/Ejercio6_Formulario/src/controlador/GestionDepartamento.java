
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
public class GestionDepartamento {
    Departamento d=null;
    
public static boolean isDepartament(int n){
    boolean i=false;
    String consulta="Select * from departamentos d where d.dept_no="+n;
    System.out.println(consulta);
    ResultSet rs;
    try(Statement sentencia=Pool.getCurrentConexion().createStatement();){
        rs=sentencia.executeQuery(consulta);
        i=rs.last();
        rs.close();
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error de comprobacion número departamento");
    }
    return i;
}

public static Departamento obtenerDepartamentoPorID(int n){
    Departamento d=null;
    String consulta="select * from departamentos where dept_no="+n;
    ResultSet rs;
    try(Statement sentencia=Pool.getCurrentConexion().createStatement();){
        rs=sentencia.executeQuery(consulta);
        d=new Departamento(rs.getInt(1),rs.getString(2),rs.getString(3));
        rs.close();
        return d;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error de obtencion de Depepartamnto por número");
    }
    return d;
} 






    
}
