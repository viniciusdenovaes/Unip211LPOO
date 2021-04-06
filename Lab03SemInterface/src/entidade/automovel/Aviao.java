package entidade.automovel;

import entidade.CoisaQueVoa;

public class Aviao extends Automovel implements CoisaQueVoa{
    
    public Aviao(String aModelo) {
        super(aModelo);
    }
    
    @Override
    public void voa(){
        System.out.println("aviao " + getModelo() + " voando");
    }
    
}
