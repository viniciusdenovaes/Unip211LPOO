import java.util.Set;
import java.util.TreeSet;

public class SetDeCuidador {
    
    public static void main(String[] args) {
        
        Set<Cuidador> conjuntoCuidador = new TreeSet<>();
        
        conjuntoCuidador.add(new Cuidador("jose"));
        conjuntoCuidador.add(new Cuidador("vinicius"));
        conjuntoCuidador.add(new Cuidador("joao"));
        conjuntoCuidador.add(new Cuidador("vitor"));
        conjuntoCuidador.add(new Cuidador("vinicius"));
        conjuntoCuidador.add(new Cuidador("vinicius"));
        conjuntoCuidador.add(new Cuidador("joao"));
        conjuntoCuidador.add(new Cuidador("vitor"));
        
        for(Cuidador c: conjuntoCuidador){
            System.out.println(c);
        }
   
    }
    
}
