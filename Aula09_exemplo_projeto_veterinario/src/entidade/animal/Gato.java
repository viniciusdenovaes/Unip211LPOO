package entidade.animal;

public class Gato extends Animal {

    public Gato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public int getIdadeHumana() {
        return 5*getIdade();
    }

    @Override
    public TiposDeAnimais getTipo() {
        return TiposDeAnimais.GATO;
    }
    
}
