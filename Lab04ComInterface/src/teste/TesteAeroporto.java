package teste;

import entidade.aeroporto.Aeroporto;
import entidade.animal.Pato;
import entidade.automovel.Aviao;
import entidade.heroi.SuperHomem;

public class TesteAeroporto {
    public static void main(String[] args) {
        SuperHomem superHomem = new SuperHomem("clark quente");
        Aeroporto.fazVoarSuperHomem(superHomem);
        
        Aviao aviao = new Aviao("14-bis");
        Aeroporto.fazVoarAviao(aviao);
        
        Pato pato = new Pato("Donald", 30);
        Aeroporto.fazVoarPato(pato);
        
    }
}
