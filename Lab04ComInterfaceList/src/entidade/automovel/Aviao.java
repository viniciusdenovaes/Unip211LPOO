package entidade.automovel;

import entidade.Flyable;

public class Aviao extends Automovel implements Flyable{
    
    public Aviao(String aModelo) {
        super(aModelo);
    }
    
    @Override
    public void voa(){
        System.out.println("aviao " + getModelo() + " voando");
    }
    
}
