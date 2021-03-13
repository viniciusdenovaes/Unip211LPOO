
import java.util.ArrayList;

public class TesteGato {
    
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato("Domingos", 5, 3));
        gatos.add(new Gato("Oggi", 5, 7));
        gatos.add(new Gato("Mimi", 17, 15));
        
        for(Gato gato: gatos){
            gato.miar();
        }
   
    }
    
}
