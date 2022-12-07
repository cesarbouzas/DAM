/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import modelo.Departamento;

/**
 *
 * @author Usuario
 */
public class GestionDepartamento {
    
    public static void cargarCombo(JComboBox<Departamento> cmbDepartamento){
        Departamento d;
        try{
            String consulta="Select * from departamentos";
            Statement sentencia=Pool.getCurrentConexion().createStatement();
            ResultSet rs=sentencia.executeQuery(consulta);
            cmbDepartamento.addItem(null);
            while(rs.next()){
                d=new Departamento(rs.getInt(1),rs.getString(2),rs.getString(3));
                cmbDepartamento.addItem(d);
            }
            sentencia.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error de concexion base de Datos");
        }finally{
            
        }

   }
    public static void listarEmpladosyCuenta(Departamento d, JTextArea txtArea,JLabel nEmpleados){
    String consulta,consultaCuantos;
    txtArea.setText("");
    consulta="Select * from empleados e inner join departamentos d on e.dept_no=d.dept_no where d.dept_no="+d.getNum();
    consultaCuantos="Select count(*) from empleados where dept_no="+d.getNum();
    ResultSet rs;
    try(Statement sentencia=Pool.getCurrentConexion().createStatement();){
        rs=sentencia.executeQuery(consulta);
        while(rs.next()){
        txtArea.append(rs.getString(1)+"---"+rs.getString("apellido")+"\n");
        }
        rs=sentencia.executeQuery(consultaCuantos);
        if(rs.next()){
        nEmpleados.setText(rs.getInt(1)+"");
        }
        rs.close();
    }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error de consulta SQL");
    }
 }
    
    
    
    
}
