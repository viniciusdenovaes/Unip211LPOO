package entidade;

public class Gato implements Comparable<Gato> {
    
    private String nome;
    private int idade;
    private double peso;

    public Gato(String aNome, int aIdade, double aPeso) {
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
    public int compareTo(Gato outroGato) {
        Gato esteGato = this;
        if(esteGato.getIdade()<outroGato.getIdade()){
            return -1;
        }
        else if(esteGato.getIdade()==outroGato.getIdade()){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    @Override
    public String toString() {
        return "Gato{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + '}';
    }

    
    
}
