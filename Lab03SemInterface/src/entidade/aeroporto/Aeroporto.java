package entidade.aeroporto;

import entidade.CoisaQueVoa;

public class Aeroporto {
    
    static public void fazVoar(CoisaQueVoa coisaQueVoa){
        System.out.println("Recebendo entidade");
        System.out.println(coisaQueVoa);
        coisaQueVoa.voa();
    }
    
}
