package entidade;

public class Competidor {
    
    private String nome;
    private int idade;
    
    public Competidor(String aNome, int aIdade){
        this.nome = aNome;
        this.idade = aIdade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Nome: " + getNome() + "\n";
        res += "Idade: " + getIdade() + "\n";
        return res;
    }
    
    
}
