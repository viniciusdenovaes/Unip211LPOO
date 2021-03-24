package entidade;

public class Cachorro extends Animal {
    
    public Cachorro(String aNome, int aIdade, double aPeso) {
        super(aNome, aIdade, aPeso);
    }
    
    @Override
    public void fazBarulho(){
        this.latir();
    }
    
    public void latir(){
        if(this.getPeso()<4.0){
            System.out.println("au au au");
        }else if(this.getPeso()>=4.0 && this.getIdade()<=10.0){
            System.out.println("AU AU AU");
        }else if(this.getPeso()>=4.0 && this.getIdade()>10.0){
            System.out.println("ROOF ROOF ROOF");
        }
    }
    
    @Override
    public void dormir(){
        System.out.println("foi dormir no sofa");
    }
    @Override
    public void comer(){
        System.out.println("comendo ração de cachorro");
    }

    @Override
    public String getRaca() {
        return "Cachorro";
    }
    
    
    
}
