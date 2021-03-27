package menu;

import entidade.Animal;
import entidade.Cachorro;
import entidade.Cuidador;
import entidade.Gato;
import entidade.Pato;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static void iniciar(){
        
        Cuidador cuidador = new Cuidador("Fulano");
        
        // 1 - listar animais
        // 2 - incluir animais
        // 3 - pegar animal mais idoso
        // 4 - sair
        
        int opcao = 0;
        Scanner in = new Scanner(System.in);
        while(opcao!=4){
            System.out.println("Digite a opção:");
            System.out.println("1 - Para listar animais");
            System.out.println("2 - Para incluir animais");
            System.out.println("3 - Para encontrar animal mais idoso");
            System.out.println("4 - para sair");
            opcao = Integer.parseInt(in.nextLine());
            switch(opcao){
                case 1: listarAnimais(cuidador); break;
                case 2: incluirAnimal(cuidador); break;
                case 3: encontrarAnimalMaisIdoso(cuidador); break;
                case 4: break;
                default: System.out.println("Opção " + opcao + "inválida!");
            }
        }
        System.out.println("Saindo do programa!");
        
    }
    
    public static void listarAnimais(Cuidador cuidador){
        System.out.println("Listando animais: ");
        for(Animal animal: cuidador.getAnimais()){
            System.out.println(animal);
            System.out.println();
        }
    }
    
    public static void incluirAnimal(Cuidador cuidador){
        Animal animal = pegaAnimal();
        cuidador.addAnimal(animal);
    }
    
    public static Animal pegaAnimal(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Entre com os dados do animal");
        System.out.println("Nome:");
        String nome = in.nextLine();
        System.out.println("Idade");
        int idade = Integer.parseInt(in.nextLine());
        System.out.println("Peso:");
        double peso = Double.parseDouble(in.nextLine());
        System.out.println("1 para cachorro, 2 para gato, 3 para pato");
        int tipo = Integer.parseInt(in.nextLine());
        Animal animal = null;
        switch(tipo){
            case 1: animal = new Cachorro(nome, idade, peso); break;
            case 2: animal = new Gato(nome, idade, peso); break;
            case 3: animal = new Pato(nome, idade, peso); break;
        }
        return animal;
    }
    
    public static void encontrarAnimalMaisIdoso(Cuidador cuidador){
        ArrayList<Animal> animais = cuidador.getAnimais();
        Animal animalMaisIdoso = animais.get(0);
        for(Animal animal: animais){
            if(animal.getIdade() > animalMaisIdoso.getIdade()){
                animalMaisIdoso = animal;
            }
        }
        System.out.println("O animal mais idoso é ");
        System.out.println(animalMaisIdoso);
    }
    
}
