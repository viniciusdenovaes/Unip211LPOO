public class TestaVeterinaria {

    public static void main(String[] args) {
        Cachorro cachorro01 = new Cachorro("Brutus", 12, 5.0);
        Veterinaria.cuidaDoCachorro(cachorro01);

        cachorro01.adoece();
        Veterinaria.cuidaDoCachorro(cachorro01);
    }

}
