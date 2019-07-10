/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbasico;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;

/**
 * FXML Controller class
 *
 * @author ap420es
 */
public class FXMLCheckBoxController {

    @FXML
    private CheckBox cbJava;

    @FXML
    private CheckBox cbPHP;

    @FXML
    void pegarValores() {
        
        System.out.println(cbJava.selectedProperty().getValue());
        System.out.println(cbPHP.selectedProperty().getValue());
    }
}
