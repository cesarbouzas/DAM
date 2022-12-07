/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
public class Ejercicio1_Conexion_BD_MariaDB {

    public static void main(String[] args) {
        
      
        
        
    try{
           //Cargar el driver de Maria db
       Class.forName(("org.mariadb.jdbc.Driver"));
       try(Connection conection=DriverManager.getConnection("jdbc:mariadb://192.168.169.231:3307/ejemplo","root","root"); 
            Statement sentence=conection.createStatement()){
    
        String consulta="SELECT * FROM empleados order by oficio";
        try( ResultSet result=sentence.executeQuery(consulta)){
            while(result.next()){
                System.out.println(result.getInt(1)+" "+result.getString(2)+"---"+result.getString("oficio")+"---"+result.getBigDecimal("salario"));
            }
        }catch(SQLException e){
            System.out.println("Error de consulta");
        }
    }catch(SQLException e2){
           System.out.println("Error de conexion");
    }
    
    
    }catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null,"Error en la conexion de la base de datos");
    }
    
    
    }
   
}

