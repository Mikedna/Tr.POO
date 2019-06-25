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


public class FXMLVisualizarController implements Initializable {
    @FXML private TableColumn<Pet, Integer> colRaca;
    @FXML private TableColumn<Pet, String> colNome;
    @FXML private TableView<Pet> tabela;
    @FXML private TableColumn<Pet, String> colSexo;
    PetDAO dao = new PetDAO();
   

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {  
        
        initTabela();       
    }    

    public void initTabela() {
        
        colRaca.setCellValueFactory(new PropertyValueFactory<>("raca"));
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));         
        tabela.setItems(listaPet());       
    }
    public ObservableList<Pet> listaPet(){
        List<Pet> lista =  dao.pesquisarAll();
        return FXCollections.observableArrayList(lista);        
    }
    
}