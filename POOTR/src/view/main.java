package view;

import dao.PetDAO;
import java.util.ArrayList;
import java.util.List;
import modell.Pet;


public class main {

   
    public static void main(String[] args) {
        PetDAO dao = new PetDAO();
        List<Pet> lista = new ArrayList<Pet>();
        lista = dao.pesquisarAll();
        
        for(Pet l : lista){
            System.out.println("Nome:" + l.getNome());
        }
    }
    
}