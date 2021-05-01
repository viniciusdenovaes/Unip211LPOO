package teste;


import entidade.Cuidador;
import entidade.animal.Animal;
import entidade.animal.Cachorro;
import entidade.animal.Gato;
import entidade.animal.TiposDeAnimais;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteEntidades {
    
    public static void main(String[] args) {
        
        for(TiposDeAnimais tipo: TiposDeAnimais.values()){
            System.out.println(tipo);
        }
        
        Animal a1 = new Cachorro("brutos", 10, 20);
        System.out.println(a1);
        
        Animal a2 = new Gato("Oggi", 10, 5);
        System.out.println(a2);
        
        Cuidador c1 = new Cuidador("vinicius");
        System.out.println(c1);
        
        System.out.println("Conjunto de cuidadores");
        
        Set<Cuidador> conjuntoDeCuidadores = new TreeSet<>();
        
        conjuntoDeCuidadores.add(new Cuidador("Vinicius"));
        conjuntoDeCuidadores.add(new Cuidador("Elio"));
        conjuntoDeCuidadores.add(new Cuidador("Vinicius"));
        conjuntoDeCuidadores.add(new Cuidador("Giovani"));
        conjuntoDeCuidadores.add(new Cuidador("Rafael"));
        conjuntoDeCuidadores.add(new Cuidador("Joao"));
        conjuntoDeCuidadores.add(new Cuidador("Elio"));
        conjuntoDeCuidadores.add(new Cuidador("Rafael"));
        
        System.out.println(conjuntoDeCuidadores);
        
   
    }
    
}
