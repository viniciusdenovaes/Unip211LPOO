
import java.util.List;

public class TesteAcessoDados {
    
    public static void main(String[] args) {
        
        List<Animal> animais = AcessoDados.lerArquivo("files/animais.csv");
        
        System.out.println("");
        System.out.println("No teste animais");
        
        for(Animal animal: animais){
            System.out.println(animal);
        }
        
   
    }
    
}
