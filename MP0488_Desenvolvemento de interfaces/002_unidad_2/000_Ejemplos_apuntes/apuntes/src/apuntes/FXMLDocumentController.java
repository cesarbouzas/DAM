/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuntes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author Usuario
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    
     @FXML private ComboBox comboBox;
    @FXML private Label labelAviso;
    @FXML private CheckBox check;


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        labelAviso.setVisible(false);
        comboBox.getItems().addAll("Doble de uso individual","Doble","Junior Suite","Suite");
    }

    public void handleCheckbox(){
    if(check.isSelected()){
            labelAviso.setVisible(true);
    }else{
        labelAviso.setVisible(false);
     }
    }
    
}
