package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConectarOracle {

    public static void main(String[] args) {
        Connection conexion = null;
        ResultSet resul=null;
       
        try {
            
           Class.forName("oracle.jdbc.driver.OracleDriver"); 
           conexion=DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.11:1521:xe","SYSTEM","admin");  
            
            Statement sentencia = conexion.createStatement();
            
            String consulta = "select * from departamentos";
            resul = sentencia.executeQuery(consulta);
            
            while (resul.next()) {
                System.out.println(resul.getInt(1) + " " + resul.getString(2) + "----" + resul.getString(3));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
        }finally{
            try {
                resul.close();
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConectarOracle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
