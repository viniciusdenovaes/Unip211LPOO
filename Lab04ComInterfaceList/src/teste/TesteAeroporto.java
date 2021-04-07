package teste;

import entidade.aeroporto.Aeroporto;
import entidade.animal.Pato;
import entidade.automovel.Aviao;
import entidade.heroi.SuperHomem;

public class TesteAeroporto {
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto();
        
        SuperHomem superHomem = new SuperHomem("clark quente");
        aeroporto.addFlyable(superHomem);
        
        Aviao aviao = new Aviao("14-bis");
        aeroporto.addFlyable(aviao);
        
        Pato pato = new Pato("Donald", 30);
        aeroporto.addFlyable(pato);
        
        Aviao aviao01 = new Aviao("antonov");
        aeroporto.addFlyable(aviao01);
        
        SuperHomem outroHeroi = new SuperHomem("falcao");
        aeroporto.addFlyable(outroHeroi);
        
        aeroporto.fazVoar();
        
    }
}
