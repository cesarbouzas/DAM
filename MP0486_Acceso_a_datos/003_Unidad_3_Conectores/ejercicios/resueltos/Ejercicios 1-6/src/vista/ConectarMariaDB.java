package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConectarMariaDB {

    public static void main(String[] args) {

        try {
            Class.forName(("org.mariadb.jdbc.Driver"));
            try (Connection conexion = DriverManager.getConnection("jdbc:mariadb://192.168.56.101:3306/ejemplo", "root", "root"); 
                Statement sentencia = conexion.createStatement()) {
                
                String consulta = "select * from empleados";
                try (ResultSet resul = sentencia.executeQuery(consulta)) {
                    while (resul.next()) {
                        System.out.println(resul.getInt(1) + " " + resul.getString(2) + "----" + resul.getString("oficio"));
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
        }
    }
}
