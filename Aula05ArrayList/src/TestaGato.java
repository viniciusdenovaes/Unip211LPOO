
import java.util.ArrayList;

public class TestaGato {
    
    public static void main(String[] args) {
        
        Gato gato00 = new Gato("Joaquim", 5, 4);
        
//        System.out.println(gato00);
//        gato00.miar();
        
        ArrayList<Gato> gatosLista = new ArrayList<Gato>();
        gatosLista.add(gato00);
        
        Gato gato01 = new Gato("Oggi", 5, 15);
        Gato gato02 = new Gato("Ze Pequeno", 15, 5);
        gatosLista.add(gato01);
        gatosLista.add(gato02);
        gatosLista.add(new Gato("Claudio", 3, 8));
        
        for(Gato gato: gatosLista){
            System.out.println(gato);
            gato.miar();
        }
        
        gato01.setPeso(20);
        
        for(int i=0; i<gatosLista.size(); i++){
            Gato gato = gatosLista.get(i);
            System.out.println(gato);
            gato.miar();
        }
        
   
    }
    
}
