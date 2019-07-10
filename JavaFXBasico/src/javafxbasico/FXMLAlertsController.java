/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbasico;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author ap420es
 */
public class FXMLAlertsController implements Initializable {

    @FXML
    private Button btnAbrirAlert;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void abrirAlert(){
        
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Título");
        alert.setHeaderText("cabeçalho");
        alert.setContentText("Conteúdo");
        alert.show();
    }
}
