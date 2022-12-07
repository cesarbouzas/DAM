
package vista;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio2_Conexion_BD_MySql {
    
    public static void main(String args[]){
        String url="jdbc:mysql://192.168.6.231:3306/ejemplo";
        String user="root";
        String password="root";
        String sql="select * from empleados order by salario";
        
        try {
            Class.forName(("com.mysql.cj.jdbc.Driver"));
            try (Connection conection =DriverManager.getConnection(url, user, password);
                Statement sentencia=conection.createStatement();){
                      ResultSet resul= sentencia.executeQuery(sql);
                      while(resul.next()){
                          System.out.println( "El emplado nº"+ resul.getInt(1)+
                                  " con puesto "+resul.getString("oficio")+
                                  " tiene un sueldo de "+resul.getBigDecimal("salario"));
                      }
            }
         } catch (ClassNotFoundException |SQLException ex) {
             System.out.println(ex.getMessage());
           JOptionPane.showMessageDialog(null,"Clase Driver no encontrada ");
        
        }
    }
    
    
    
    
    
    
}
