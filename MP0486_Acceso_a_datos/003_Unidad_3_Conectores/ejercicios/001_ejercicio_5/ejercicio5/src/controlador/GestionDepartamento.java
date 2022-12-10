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
    
    
    Departamento d;
    /**
     * 
     * @param jcbNDepartamento
     */
    public static void cargarNDepartamentoCombo(JComboBox<String> jcbNDepartamento){
        
        try{
            jcbNDepartamento.removeAllItems();
            String consulta="select * from departamentos";
            ResultSet rs;
            try(Statement sentencia=Pool.getCurrentConexion().createStatement()){
                    rs=sentencia.executeQuery(consulta);
                    jcbNDepartamento.addItem(null);
                    while(rs.next()){
                        jcbNDepartamento.addItem(rs.getInt(1)+"");
                    }
                    jcbNDepartamento.removeItem(0);
            }
            rs.close();
        }   catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error de consulta de número departamentos a base de datos");
            }
        
    
    }
    
}
