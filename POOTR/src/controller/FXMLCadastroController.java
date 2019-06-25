package controller;

import dao.PetDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import modell.Pet;
import view.palco;

public class FXMLCadastroController implements Initializable {

    @FXML
    private RadioButton rbF;

    @FXML
    private Button btSalvar;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtRaca;

    @FXML
    private RadioButton rbM;

    @FXML
    void salvar(ActionEvent event) {
        PetDAO dao = new PetDAO();
        Pet pet = new Pet();
        pet.setRaca(89);
        pet.setNome("UIADIOAD");
        pet.setSexo("M");
        
         Alert alert = new Alert(Alert.AlertType);
         alert.setHeaderText("Esse é o cabeçalho...");
         alert.setContentText(dao.salvar(pet));
         alert.showAndWait();
         palco.telaPrincipal();

    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
    
}