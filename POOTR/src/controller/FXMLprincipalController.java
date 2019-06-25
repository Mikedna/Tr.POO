package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import view.palco;

public class FXMLprincipalController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
    
    
      @FXML
    void cadatrar(ActionEvent event)  {
          palco.cadastroPet();
    }
    
     @FXML
    void pesquisar(ActionEvent event) {
        palco.mostrarPet();

    }

}