package teste;

import entidade.Cuidador;
import entidade.animal.Cachorro;
import entidade.animal.Gato;
import modelo.Modelo;

public class TesteModelo {
    
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Cuidador c1 = new Cuidador("vinicius");
        modelo.addCuidador(c1);
        modelo.addAnimal(new Gato("duque", 10, 5), c1);
        modelo.addAnimal(new Cachorro("butus", 10, 5), c1);
        
        Cuidador c2 = new Cuidador("elio");
        modelo.addCuidador(c2);
        modelo.addAnimal(new Gato("floquinho", 10, 5), c2);
        modelo.addAnimal(new Cachorro("duda", 10, 5), c2);
        
        Cuidador c3 = new Cuidador("guiovani");
        modelo.addCuidador(c3);
        modelo.addAnimal(new Gato("ubuntuzinho", 10, 5), c3);
        modelo.addAnimal(new Cachorro("kdezinho", 10, 5), c3);
        
        System.out.println(modelo);
        
        
    }
    
}
