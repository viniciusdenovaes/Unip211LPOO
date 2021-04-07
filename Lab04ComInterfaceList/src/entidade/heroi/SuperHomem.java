package entidade.heroi;

import entidade.Flyable;

public class SuperHomem extends SuperHeroi implements Flyable{
    
    public SuperHomem(String aNome) {
        super(aNome);
    }
    
    @Override
    public void voa(){
        System.out.println("um passaro? nao, é o " + getNome() + " um superhomem");
    }
    
}
