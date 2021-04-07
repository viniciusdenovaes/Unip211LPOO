package entidade.animal;

import entidade.Flyable;

public class Pato extends Animal implements Flyable {
    
    public Pato(String aNome, int aIdade) {
        super(aNome, aIdade);
    }
    
    @Override
    public void voa(){
        System.out.println("quaack, eu sou o pato " + getNome() + " e estou voando");
    }
    
}
