package teste;


import entidade.Veterinaria;
import entidade.Gato;
import entidade.Pato;
import entidade.Cachorro;

public class TestaVeterinaria {

    public static void main(String[] args) {
        Cachorro cachorro01 = new Cachorro("Brutus", 12, 5.0);
        Veterinaria.cuidaDoCachorro(cachorro01);

        cachorro01.adoece();
        Veterinaria.cuidaDoCachorro(cachorro01);
        
        Gato g01 = new Gato("Oggi", 12, 5.0);
        Veterinaria.cuidaDoGato(g01);

        g01.adoece();
        Veterinaria.cuidaDoGato(g01);
        
        Pato p01 = new Pato("Don", 12, 5.0);
        Veterinaria.cuidaDoPato(p01);

        p01.adoece();
        Veterinaria.cuidaDoPato(p01);
    }

}
