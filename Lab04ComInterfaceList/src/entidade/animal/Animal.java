package entidade.animal;

public class Animal {
    
    private String nome;
    private int idade;

    public Animal(String aNome, int aIdade) {
        this.nome = aNome;
        this.idade = aIdade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
}
