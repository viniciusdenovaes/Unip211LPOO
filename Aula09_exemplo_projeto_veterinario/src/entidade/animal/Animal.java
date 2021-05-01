package entidade.animal;

abstract public class Animal {
    
    private String nome;
    private int idade;
    private double peso;

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
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
    
    abstract public int getIdadeHumana();
    
    abstract public TiposDeAnimais getTipo();

    @Override
    public String toString() {
        String res = "";
        res += getTipo() + ": \n";
        res += "\tNome: " + getNome() + "\n";
        res += "\tIdade: " + getIdade()+ "\n";
        res += "\tPeso: " + getPeso()+ "\n";
        res += "\tIdade Humana: " + getIdadeHumana()+ "\n";
        
        return res;
    }
    
    
    
    
}
