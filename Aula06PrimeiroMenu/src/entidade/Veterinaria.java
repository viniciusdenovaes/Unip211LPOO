package entidade;

public class Veterinaria {

    public static void cuidaDoAnimal(Animal animal) {
        System.out.println();
        System.out.println("Tipo do animal: " + animal.getClass());
        System.out.println("Recebendo " + animal.getNome());
        String raca = animal.getRaca();
        if(!animal.getIsDoente()) {
            System.out.println("O " + raca + " está saudável");
            return;
        }

        System.out.println("Dando injeção para o " + raca);
        animal.darInjecao();
        animal.fazBarulho();
        animal.comer();
        animal.dormir();
        System.out.println();
    }


}