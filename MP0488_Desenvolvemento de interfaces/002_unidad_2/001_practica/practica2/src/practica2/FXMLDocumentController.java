/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 *
 * @author Usuario
 */
public class FXMLDocumentController implements Initializable {
    

    
     @FXML private ComboBox comboBox;
  


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        comboBox.getItems().addAll("Banquete","Jornada","Congreso");
    }


    
}
