public class Animal {
    
    private String nome;
    private int idade;
    private double peso;

    public Animal(String aNome, int aIdade, double aPeso) {
        this.nome = aNome;
        this.idade = aIdade;
        this.peso = aPeso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + '}';
    }
    
    
}
