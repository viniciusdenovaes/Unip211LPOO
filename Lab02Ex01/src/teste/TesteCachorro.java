package teste;


import entidade.Cachorro;
import java.util.ArrayList;

public class TesteCachorro {
    
    public static void main(String[] args) {
        ArrayList<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro("Brutus", 5, 3));
        cachorros.add(new Cachorro("Brutus", 5, 7));
        cachorros.add(new Cachorro("Brutus", 17, 15));
        
        for(Cachorro cachorro: cachorros){
            cachorro.latir();
        }
   
    }
    
}
