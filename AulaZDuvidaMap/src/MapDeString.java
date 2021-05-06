import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MapDeString {
    
    public static void main(String[] args) {
        Map<String, String> nomeDoCachorro = new TreeMap<>();
        // {'joao': 'zeca dog', 'vitor': 'entry dog', 'jose': 'loro'}

        
        nomeDoCachorro.put("joao", "zeca dog");
        nomeDoCachorro.put("vitor", "entry dog");
        nomeDoCachorro.put("jose", "loro");
        
        nomeDoCachorro.put("Joao", "zeca dog");
        nomeDoCachorro.put("Vitor", "entry dog");
        nomeDoCachorro.put("Jose", "loro");
        
        for(String nome: nomeDoCachorro.keySet()){
            String cachorro = nomeDoCachorro.get(nome);
            System.out.println("nome: " + nome);
            System.out.println("cachorro: " + cachorro);
            System.out.println("");
        }
        
    }
    
}
