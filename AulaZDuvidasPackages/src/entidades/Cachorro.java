package entidades;

public class Cachorro {
    
    int id;
    String nome;
    
    static int maxId = 0;
    
    public Cachorro(String nome) {
        this.id = Cachorro.maxId;
        Cachorro.maxId++;
        
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "id=" + id + ", nome=" + nome + '}';
    }
    
    
}
