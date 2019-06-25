package controller;

import dao.PetDAO;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modell.Pet;
public class FXMLController implements Initializable {
    
    @FXML private TableView<Pet> tabela;
    @FXML private TableColumn<Pet, String> cNome;
    @FXML private TableColumn<Pet, String> cSexo;
    @FXML private TableColumn<Pet, String> cRaca;
    PetDAO DAO = new PetDAO();
   

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializeTable();
    }    

    private void inicializeTable() {
      cRaca.setCellValueFactory(new PropertyValueFactory<>("raca"));
       cNome.setCellValueFactory(  new PropertyValueFactory<>("nome"));
       cSexo.setCellValueFactory(  new PropertyValueFactory<>("sexo"));       
       tabela.setItems(listarPet());
    }

    private ObservableList<Pet> listarPet() {
        List<Pet> lista =  DAO.pesquisarAll();
        return FXCollections.observableArrayList(lista);
        
    }
    
}