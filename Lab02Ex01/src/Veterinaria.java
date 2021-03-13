public class Veterinaria {

    public static void cuidaDoCachorro(Cachorro cachorro) {
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
    }

}