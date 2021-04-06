package entidade.animal;

public class Pato extends Animal{
    
    public Pato(String aNome, int aIdade) {
        super(aNome, aIdade);
    }
    
    public void voa(){
        System.out.println("quaack, eu sou o pato " + getNome() + " e estou voando");
    }
    
}
