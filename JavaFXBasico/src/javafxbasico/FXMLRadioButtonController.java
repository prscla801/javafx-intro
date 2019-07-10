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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author ap420es
 */
public class FXMLRadioButtonController implements Initializable {

    @FXML
    private ToggleGroup grupo;

    @FXML
    void pegarSelecionado() {
        
        RadioButton radio = (RadioButton) grupo.getSelectedToggle();
        
        System.out.println(radio.getText());
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
