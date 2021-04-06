package entidade.animal;

import entidade.CoisaQueVoa;

public class Pato extends Animal implements CoisaQueVoa {
    
    public Pato(String aNome, int aIdade) {
        super(aNome, aIdade);
    }
    
    @Override
    public void voa(){
        System.out.println("quaack, eu sou o pato " + getNome() + " e estou voando");
    }
    
}
