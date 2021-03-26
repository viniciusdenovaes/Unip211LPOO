package teste;

import entidade.Animal;
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
        
        Gato g01 = new Gato("Oggi", 11, 30);
        Gato g02 = new Gato("Alfredo", 6, 10);
        g02.adoece();
        Gato g03 = new Gato("Duque", 12, 5);
        
        Pato p01 = new Pato("Clovis", 13, 30);
        p01.adoece();
        Pato p02 = new Pato("Don", 7, 10);
        Pato p03 = new Pato("Margarida", 14, 5);
        
        Cuidador cuidador01 = new Cuidador("mae ou pai de pet");
        cuidador01.addAnimal(c01);
        cuidador01.addAnimal(c02);
        cuidador01.addAnimal(c03);
        cuidador01.addAnimal(g01);
        cuidador01.addAnimal(g02);
        cuidador01.addAnimal(g03);
        cuidador01.addAnimal(p01);
        cuidador01.addAnimal(p02);
        cuidador01.addAnimal(p03);
        
        ArrayList<Animal> animais = cuidador01.getAnimais();
        for(Animal a: animais){
            Veterinaria.cuidaDoAnimal(a);
        }
        
        Animal umAnimal = animais.get(0);
        System.out.println(umAnimal);
        
        
        Animal animalMaisIdoso = encontraAnimalMaisIdoso(animais);
        System.out.println("Animal mais idoso:");
        System.out.println(animalMaisIdoso);
        System.out.println();
        
        Animal animalMaisNovo = encontraAnimalMaisNovo(animais);
        System.out.println("Animal mais novo:");
        System.out.println(animalMaisNovo);
        
        
        
    }
    
    public static Animal encontraAnimalMaisIdoso(ArrayList<Animal> animais){
        Animal animalMaisIdoso = animais.get(0);
        for(Animal animal: animais){
            if(animal.getIdade() > animalMaisIdoso.getIdade()){
                animalMaisIdoso = animal;
            }
        }
        return animalMaisIdoso;
    }
    
    public static Animal encontraAnimalMaisNovo(ArrayList<Animal> animais){
        Animal animalMaisNovo = null;
        int menorIdade = Integer.MAX_VALUE;
        for(Animal animal: animais){
            int idade = animal.getIdade();
            if(idade < menorIdade){
                animalMaisNovo = animal;
                menorIdade = animal.getIdade();
            }
        }
        return animalMaisNovo;
    }
    
}
