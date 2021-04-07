package teste;

import entidade.Gato;
import java.util.ArrayList;
import java.util.Collections;
import utils.ComparadorDeGatosPorNome;
        
public class TesteGato {
    
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<>();
        
        gatos.add(new Gato("Oggi", 5, 3));
        gatos.add(new Gato("Ze", 7, 4));
        gatos.add(new Gato("Princesa", 8, 4));
        gatos.add(new Gato("Pichulo", 3, 2));
        gatos.add(new Gato("Romeu", 2, 8));
        gatos.add(new Gato("Princesa", 9, 4));
        gatos.add(new Gato("Princeso", 9, 5));
        
        for(Gato gato: gatos){
            System.out.println(gato);
        }
        
        Collections.sort(gatos, new ComparadorDeGatosPorNome());
        
        System.out.println("");
        System.out.println("Depois de ordenar");
        for(Gato gato: gatos){
            System.out.println(gato);
        }
    }
    
}
