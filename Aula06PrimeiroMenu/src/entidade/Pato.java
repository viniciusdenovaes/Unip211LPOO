package entidade;

public class Pato extends Animal {
    
    public Pato(String aNome, int aIdade, double aPeso) {
        super(aNome, aIdade, aPeso);
    }
    
    @Override
    public String getRaca(){
        return "Pato";
    }
    
    @Override
    public void fazBarulho(){
        this.quack();
    }
    
    public void quack(){
        System.out.println("quaaack quaack");
    }
    
    public void dormir(){
        System.out.println("foi dormir no quintal");
    }
    public void comer(){
        System.out.println("comendo o que o pato come");
    }
    
}
