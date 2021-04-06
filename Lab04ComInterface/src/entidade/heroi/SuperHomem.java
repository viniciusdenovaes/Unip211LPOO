package entidade.heroi;

public class SuperHomem extends SuperHeroi{
    
    public SuperHomem(String aNome) {
        super(aNome);
    }
    
    public void voa(){
        System.out.println("um passaro? nao, é o " + getNome() + " um superhomem");
    }
    
}
