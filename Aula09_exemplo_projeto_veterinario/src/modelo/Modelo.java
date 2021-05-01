package modelo;

import entidade.Cuidador;
import entidade.animal.Animal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Modelo {
    
    Map<Cuidador, List<Animal>> relacaoCuidadorAnimal;

    public Modelo() {
        relacaoCuidadorAnimal = new TreeMap<>();
    }

    public void addAnimal(Animal a, Cuidador c){
        List<Animal> listaDoCuidador = relacaoCuidadorAnimal.get(c);
        listaDoCuidador.add(a);
    }
    
    public void addCuidador(Cuidador c){
        relacaoCuidadorAnimal.put(c, new ArrayList<>());
    }

    @Override
    public String toString() {
        String res = "";
        for(Cuidador c: relacaoCuidadorAnimal.keySet()){
            res += "Cuidador: " + c + "\n";
            List<Animal> listaDoCuidador = relacaoCuidadorAnimal.get(c);
            for(Animal a: listaDoCuidador){
                res += a + "\n";
            }
        }
        return res;
    }

    
    
    
    
    
    
    
}
