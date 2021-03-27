package entidade;

public class Gato extends Animal {
    
    public Gato(String aNome, int aIdade, double aPeso) {
        super(aNome, aIdade, aPeso);
    }
    
    @Override
    public String getRaca(){
        return "Gato";
    }
    
    
    @Override
    public void fazBarulho(){
        this.miar();
    }
    
    
    public void miar(){
        System.out.println("miaaaauu");
    }

    @Override
    public void dormir() {
        System.out.println("foi dormir no alto");
    }

    @Override
    public void comer() {
        System.out.println("comendo ração de gato");
    }
    
    
    
}
