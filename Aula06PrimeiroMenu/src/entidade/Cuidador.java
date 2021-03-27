package entidade;

import java.util.ArrayList;

public class Cuidador {
    
    private String nome;
    private ArrayList<Animal> animais;

    public Cuidador(String aNome) {
        this.nome = aNome;
        this.animais = new ArrayList<Animal>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Animal> getAnimais() {
        return this.animais;
    }
    
    public void addAnimal(Animal animal){
        this.animais.add(animal);
    }
    
    
    
}
