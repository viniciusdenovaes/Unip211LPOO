package entidade.animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public int getIdadeHumana() {
        return 8*getIdade();
    }

    @Override
    public TiposDeAnimais getTipo() {
        return TiposDeAnimais.CACHORRO;
    }
    
}
