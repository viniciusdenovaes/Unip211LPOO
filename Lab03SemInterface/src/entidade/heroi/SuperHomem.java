package entidade.heroi;

import entidade.CoisaQueVoa;

public class SuperHomem extends SuperHeroi implements CoisaQueVoa{
    
    public SuperHomem(String aNome) {
        super(aNome);
    }
    
    @Override
    public void voa(){
        System.out.println("um passaro? nao, é o " + getNome() + " um superhomem");
    }
    
}
