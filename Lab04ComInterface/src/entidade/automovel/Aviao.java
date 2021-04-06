package entidade.automovel;

public class Aviao extends Automovel{
    
    public Aviao(String aModelo) {
        super(aModelo);
    }
    
    public void voa(){
        System.out.println("aviao " + getModelo() + " voando");
    }
    
}
