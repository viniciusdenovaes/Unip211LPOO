
import java.util.List;

public class TesteAcessoDados {
    
    public static void main(String[] args) {
        
        List<Animal> animais = AcessoDados.loadAnimais("files/animais.csv");
        
        System.out.println("");
        System.out.println("No teste animais");
        
        for(Animal animal: animais){
            System.out.println(animal);
        }
        
//        animais.add(new Animal("vacilo", 15, 10));
//        animais.add(new Animal("francis", 7, 2));
        
        System.out.println("");
        System.out.println("No teste animais depois de incluir um animal novo");
        
        for(Animal animal: animais){
            System.out.println(animal);
        }
        
        for(int i=0; i<animais.size(); i++){
            Animal animal = animais.get(i);
            if(animal.getNome().equals("vacilo")){
                animais.remove(i);
                break;
            }
        }
        
        System.out.println("");
        System.out.println("No teste animais depois de retirar o vacilo");
        
        AcessoDados.saveAnimais(animais, "files/animais.csv");
        
        
   
    }
    
}
