package teste;


import entidade.Veterinaria;
import entidade.Gato;
import entidade.Pato;
import entidade.Cachorro;

public class TestaVeterinaria {

    public static void main(String[] args) {
        Cachorro cachorro01 = new Cachorro("Brutus", 12, 5.0);
        Veterinaria.cuidaDoAnimal(cachorro01);

        cachorro01.adoece();
        Veterinaria.cuidaDoAnimal(cachorro01);
        
        Gato g01 = new Gato("Oggi", 12, 5.0);
        Veterinaria.cuidaDoAnimal(g01);

        g01.adoece();
        Veterinaria.cuidaDoAnimal(g01);
        
        Pato p01 = new Pato("Don", 12, 5.0);
        Veterinaria.cuidaDoAnimal(p01);

        p01.adoece();
        Veterinaria.cuidaDoAnimal(p01);
    }

}
