import java.util.Map;
import java.util.TreeMap;

public class MapDeCuidador {
    
    public static void main(String[] args) {
        
        
        Map<Cuidador, Cachorro> mapaCuidadorParaCachorro = new TreeMap<>();
        
        mapaCuidadorParaCachorro.put(new Cuidador("joao"), new Cachorro("zeca dog", 10));
        mapaCuidadorParaCachorro.put(new Cuidador("vitor"), new Cachorro("entry dog", 11));
        mapaCuidadorParaCachorro.put(new Cuidador("jose"), new Cachorro("loro", 12));
        
        mapaCuidadorParaCachorro.put(new Cuidador("Joao"), new Cachorro("zeca dog", 13));
        mapaCuidadorParaCachorro.put(new Cuidador("Vitor"), new Cachorro("entry dog", 14));
        mapaCuidadorParaCachorro.put(new Cuidador("Jose"), new Cachorro("loro", 15));
        
        for(Cuidador cuidador: mapaCuidadorParaCachorro.keySet()){
            Cachorro cachorro = mapaCuidadorParaCachorro.get(cuidador);
            System.out.println("cuidador: " + cuidador);
            System.out.println("cachorro: " + cachorro);
            System.out.println("");
        }
        
        mapaCuidadorParaCachorro.put(new Cuidador("Jose"), new Cachorro("moreno", 15));
        
        
        for(Cuidador cuidador: mapaCuidadorParaCachorro.keySet()){
            Cachorro cachorro = mapaCuidadorParaCachorro.get(cuidador);
            System.out.println("cuidador: " + cuidador);
            System.out.println("cachorro: " + cachorro);
            System.out.println("");
        }
        

   
    }
    
}
