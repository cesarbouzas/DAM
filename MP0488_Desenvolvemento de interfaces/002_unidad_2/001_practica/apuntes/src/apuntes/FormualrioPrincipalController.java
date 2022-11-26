
package apuntes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class FormualrioPrincipalController implements Initializable {
    
    
    @FXML private Button botonReservas;
    @FXML private Button botonSalir;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void handlebtnReservas(ActionEvent event) throws IOException{
    Stage stage =(Stage)botonReservas.getScene().getWindow();
    Parent root =FXMLLoader.load(getClass().getResource("FormualrioPrincipal.fxml"));
    if(event.getSource()==botonReservas){
    stage=(Stage)botonReservas.getScene().getWindow();
    root =FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    }
    Scene scene=new Scene(root);
    stage.setScene(scene);
    stage.show();
    }
    public void handlebtnSalir(ActionEvent event){
        Platform.exit();
        System.exit(0);
    }
    
    
    
    
    
    
    
}
