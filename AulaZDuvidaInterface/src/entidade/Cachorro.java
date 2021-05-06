package entidade;

public class Cachorro implements Corredor {
    
    int id;
    String nome;
    
    @Override
    public void correr() {
        System.out.println("cachorro corre muito");
    }
    
}
