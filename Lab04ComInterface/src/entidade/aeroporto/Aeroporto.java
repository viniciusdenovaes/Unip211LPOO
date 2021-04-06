package entidade.aeroporto;

import entidade.animal.Pato;
import entidade.automovel.Aviao;
import entidade.heroi.SuperHomem;

public class Aeroporto {
    
    static public void fazVoarSuperHomem(SuperHomem superHomem){
        System.out.println("Recebendo entidade");
        System.out.println(superHomem);
        superHomem.voa();
    }
    
    static public void fazVoarAviao(Aviao aviao){
        System.out.println("Recebendo entidade");
        System.out.println(aviao);
        aviao.voa();
    }
    
    static public void fazVoarPato(Pato pato){
        System.out.println("Recebendo entidade");
        System.out.println(pato);
        pato.voa();
    }
    
}
