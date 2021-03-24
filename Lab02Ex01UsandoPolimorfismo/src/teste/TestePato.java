package teste;


import entidade.Pato;
import java.util.ArrayList;

public class TestePato {
    
    public static void main(String[] args) {
        ArrayList<Pato> patos = new ArrayList<>();
        patos.add(new Pato("Domingos", 5, 3));
        patos.add(new Pato("Oggi", 5, 7));
        patos.add(new Pato("Mimi", 17, 15));
        
        for(Pato pato: patos){
            pato.quack();
        }
   
    }
    
}
