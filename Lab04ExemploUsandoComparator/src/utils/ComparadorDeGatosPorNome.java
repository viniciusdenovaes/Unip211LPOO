package utils;

import entidade.Gato;
import java.util.Comparator;

public class ComparadorDeGatosPorNome implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        if(! o1.getNome().equals(o2.getNome())){
            return o1.getNome().compareTo(o2.getNome());
        }
        else if(! (o1.getIdade() == o2.getIdade())){
            return Integer.compare(o1.getIdade(), o2.getIdade());
        }
        else{
            return Double.compare(o1.getPeso(), o2.getPeso());
        }
    }

}
