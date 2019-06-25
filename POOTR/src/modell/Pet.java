package modell;
public class Pet {
    private String raca;
    private String nome;
    private String sexo;
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  
    public void setNumero(String i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setRaca(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


    
    
    
    
    
    
}