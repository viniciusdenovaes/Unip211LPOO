package teste;

import entidade.Competidor;
import view.View;

public class TesteView {
    
    public static void main(String[] args) {
        Competidor c = View.insereCompetidor();
        
        System.out.println(c);
    }
    
}
