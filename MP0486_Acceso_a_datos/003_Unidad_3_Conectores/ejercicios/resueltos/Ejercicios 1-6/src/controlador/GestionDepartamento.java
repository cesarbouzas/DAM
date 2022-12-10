/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import modelo.Departamento;

/**
 *
 * @author AD
 */
public class GestionDepartamento {

  
    public static void cargarCombo(JComboBox<Departamento> cmbDepartamento) {
        Departamento d;
        try {
            cmbDepartamento.removeAllItems();
            String consulta = "Select * from departamentos";
            ResultSet rs;
            try (Statement sentencia = Pool.getCurrentConexion().createStatement()) {
                rs = sentencia.executeQuery(consulta);
                cmbDepartamento.addItem(null);
                while (rs.next()) {
                    d = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
                    cmbDepartamento.addItem(d);
                }   //Si quisieramos quitarle el nulo inicial del combo 
                //indicamos . Comenta o descomenta esta linea para probar con nulo o no nulo en el combo
                cmbDepartamento.removeItemAt(0);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el combo", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {

        }
    }
    public static void listarEmpleadosycuenta(Departamento d, JTextArea txtArea, JLabel lblnumero) throws SQLException {
        String consulta, consultacuantos;
        txtArea.setText("");

        consulta="Select * from empleados e inner join departamentos d on e.dept_no=d.dept_no where d.dept_no="+d.getNum();
        
        consultacuantos = "select count(*) from empleados e where e.dept_no=" + d.getNum();

        ResultSet rs;
        try ( Statement sentencia = Pool.getCurrentConexion().createStatement()) {
            rs = sentencia.executeQuery(consulta);
            while (rs.next()) {
                txtArea.append(rs.getString(1) + "\t" + rs.getString("apellido") + "\n");
            }
            /*Si bien es cierto que el número de empleados lo sabemos ya con un contador en el bucle previo
            lo vamos a recoger con otra consulta count.*/
            rs = sentencia.executeQuery(consultacuantos);
            if (rs.next()) {
                lblnumero.setText(rs.getInt(1) + "");
            }
        }
        rs.close();
    }
    public static Departamento buscaDepartamento(int numdep) throws SQLException {
        Departamento d = null;

        String consulta = "select * from departamentos d where d.dept_no=" + numdep;
        Statement sentencia = Pool.getCurrentConexion().createStatement();

        ResultSet rs = sentencia.executeQuery(consulta);

        if (rs.next()) {
            return new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
        }

        return d;
    }
    
    
}
