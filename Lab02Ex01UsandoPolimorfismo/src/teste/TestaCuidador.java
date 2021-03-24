package teste;

import entidade.Cachorro;
import entidade.Cuidador;
import entidade.Gato;
import entidade.Pato;
import entidade.Veterinaria;
import java.util.ArrayList;

public class TestaCuidador {
    
    public static void main(String[] args) {
        Cachorro c01 = new Cachorro("Zeca", 5, 20);
        Cachorro c02 = new Cachorro("Brutinho", 15, 5);
        Cachorro c03 = new Cachorro("Vacilo", 10, 30);
        c03.adoece();
        
        Gato g01 = new Gato("Oggi", 10, 30);
        Gato g02 = new Gato("Alfredo", 5, 10);
        g02.adoece();
        Gato g03 = new Gato("Duque", 10, 5);
        
        Pato p01 = new Pato("Clovis", 10, 30);
        p01.adoece();
        Pato p02 = new Pato("Don", 5, 10);
        Pato p03 = new Pato("Margarida", 10, 5);
        
        Cuidador cuidador01 = new Cuidador("mae ou pai de pet");
        cuidador01.addCachorro(c01);
        cuidador01.addCachorro(c02);
        cuidador01.addCachorro(c03);
        cuidador01.addGato(g01);
        cuidador01.addGato(g02);
        cuidador01.addGato(g03);
        cuidador01.addPato(p01);
        cuidador01.addPato(p02);
        cuidador01.addPato(p03);
        
        ArrayList<Cachorro> cachorros = cuidador01.getCachorros();
        for(Cachorro cachorro: cachorros){
            Veterinaria.cuidaDoCachorro(cachorro);
        }
        for(Gato gato: cuidador01.getGatos()){
            Veterinaria.cuidaDoGato(gato);
        }
        for(Pato pato: cuidador01.getPatos()){
            Veterinaria.cuidaDoPato(pato);
        }
        
        
    }
    
}
