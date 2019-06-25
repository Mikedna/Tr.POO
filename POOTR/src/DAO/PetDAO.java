package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modell.Pet;

public class PetDAO {
    Connection con = null;
    public PetDAO(){
        con = conexao.abrirConexao();
    }
    
    public List<Pet> pesquisarAll(){
        List<Pet> lista = new ArrayList<>();
        try {            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM PET");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Pet pet = new Pet();
                pet.setRaca(rs.getInt("raca"));
                pet.setNome(rs.getString("nome"));
                pet.setSexo(rs.getString("sexo"));
                lista.add(pet);                
            }
            return lista;
        } catch (Exception e) {
        }
        return null;
    }
    
    public void pesquisar(int numero){}
    
    
    public String salvar(Pet pet){
        try {
            String sql = "INSERT INTO PET(RACA, NOME, SEXO) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pet.getRaca());
            ps.setString(2, pet.getNome());
            ps.setString(3, pet.getSexo());           
            ps.executeQuery();
            return "Pet cadastrado com sucesso";
        } catch (Exception e) {
            return "Deu erro";
        }
    }
    
}
