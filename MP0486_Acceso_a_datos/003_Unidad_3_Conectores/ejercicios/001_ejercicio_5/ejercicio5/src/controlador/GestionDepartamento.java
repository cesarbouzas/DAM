/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Departamento;


/**
 *
 * @author Usuario
 */
public class GestionDepartamento {
    
    
    
    private static ResultSet descargarTodaTabla(String nameTable){
       
        String consulta = "select * from " + nameTable;
        ResultSet rs=null;
        try ( Statement sentencia = Pool.getCurrentConexion().createStatement();) { 
            rs=sentencia.executeQuery(consulta);
            System.out.println("Descargada toda la tabla :"+nameTable+rs.getString(1));
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al descargar toda la tabla"+nameTable);
        }
        return rs;
    }
    
   
    public static void cargarNDepartamentoCombo(JComboBox<String> jcbNDepartamento){
        String consulta="select * from departamentos ";
        ResultSet rs;
        try(Statement sentencia=Pool.getCurrentConexion().createStatement();)
        {
          rs=sentencia.executeQuery(consulta);
          //rs=descargarTodaTabla("departamentos");¿¿no funciona???
          jcbNDepartamento.removeAllItems();      
          while(rs.next()){
                        jcbNDepartamento.addItem(rs.getInt(1)+"");
                    }
            rs.close();
        }   catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error de consulta de número departamentos a base de datos");
            }
        
    
    }
    public static void cargarDepartamentoCombo(JComboBox<Departamento> jcbDepartamento){
         String consulta="select * from departamentos ";
        ResultSet rs;
        try(Statement sentencia=Pool.getCurrentConexion().createStatement();)
        {
          rs=sentencia.executeQuery(consulta);
          jcbDepartamento.removeAllItems(); 
         while(rs.next()){
             Departamento d=new Departamento();
             d.setnDepartamneto(rs.getInt(1));
             d.setNombre(rs.getString(2));
             d.setLocalizacion(rs.getString(3));
             jcbDepartamento.addItem(d);
         }
     }catch(SQLException ex){
     
     }
        
    
    }
    
}
