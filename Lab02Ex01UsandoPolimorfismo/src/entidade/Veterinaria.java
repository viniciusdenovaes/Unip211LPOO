package entidade;


import entidade.Gato;
import entidade.Pato;
import entidade.Cachorro;

public class Veterinaria {

    public static void cuidaDoCachorro(Cachorro cachorro) {
        System.out.println();
        System.out.println("Recebendo " + cachorro.getNome());
        if(!cachorro.getIsDoente()) {
            System.out.println("O cachorro está saudável");
            return;
        }

        System.out.println("Dando injeção para o animalzinho");
        cachorro.darInjecao();
        cachorro.latir();
        cachorro.comer();
        cachorro.dormir();
        System.out.println();
    }

    public static void cuidaDoGato(Gato gato) {
        System.out.println();
        System.out.println("Recebendo " + gato.getNome());
        if(!gato.getIsDoente()) {
            System.out.println("O cachorro está saudável");
            return;
        }

        System.out.println("Dando injeção para o animalzinho");
        gato.darInjecao();
        gato.miar();
        gato.comer();
        gato.dormir();
        System.out.println();
    }

    public static void cuidaDoPato(Pato pato) {
        System.out.println();
        System.out.println("Recebendo " + pato.getNome());
        if(!pato.getIsDoente()) {
            System.out.println("O cachorro está saudável");
            return;
        }

        System.out.println("Dando injeção para o animalzinho");
        pato.darInjecao();
        pato.quack();
        pato.comer();
        pato.dormir();
        System.out.println();
    }

}