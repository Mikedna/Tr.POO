package view;

import java.io.IOException;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;


public class palco extends Application {
   static Stage palco;
   
 
   public static Scene sceneCadPet;
   public static Scene sceneVisualizarPet ;
   public static Scene scener;
    
    @Override
    public void start(Stage stage) throws IOException{
        palco = stage;
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLPrincipal.fxml"));
        Parent cadAluno =        FXMLLoader.load(getClass().getResource("FXMLCadastroAluno.fxml"));
        Parent visualizarAluno = FXMLLoader.load(getClass().getResource("FXMLVisualizar.fxml"));
       
         scener = new Scene(root, 600, 600);
       Parent cadPet = null;
         sceneCadPet = new Scene(cadPet, 600, 600);
       Parent visualizarPet = null;
       Scene sceneVisualizarPet = new Scene(visualizarPet, 600, 600);
        stage.setTitle("Tela Principal");
        stage.setScene(scener);
        stage.setResizable(true);
        stage.show();
    }

    

    
    public static void main(String[] args) {
        launch(args);
    }
    
    public static void cadastroPet(){
        palco.setTitle("Cadastro do Animal");
        palco.setScene(sceneCadPet);        
    }
    
    public static void mostrarPet(){
        palco.setTitle("Visualizar Animal");
        palco.setScene(sceneVisualizarPet);
    }
    
    public static void telaPrincipal(){
        palco.setTitle("Tela Principal");
        palco.setScene(scener);
    }
    
    
}