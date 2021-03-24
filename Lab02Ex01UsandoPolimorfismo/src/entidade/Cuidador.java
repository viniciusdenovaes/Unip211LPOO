package entidade;

import java.util.ArrayList;

public class Cuidador {
    
    private String nome;
    private ArrayList<Cachorro> cachorros;
    private ArrayList<Gato> gatos;
    private ArrayList<Pato> patos;

    public Cuidador(String aNome) {
        this.nome = aNome;
        this.cachorros = new ArrayList<Cachorro>();
        this.gatos = new ArrayList<Gato>();
        this.patos = new ArrayList<Pato>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cachorro> getCachorros() {
        return cachorros;
    }

    public ArrayList<Gato> getGatos() {
        return gatos;
    }

    public ArrayList<Pato> getPatos() {
        return patos;
    }
    
    public void addCachorro(Cachorro cachorro){
        this.cachorros.add(cachorro);
    }
    public void addGato(Gato gato){
        this.gatos.add(gato);
    }
    public void addPato(Pato pato){
        this.patos.add(pato);
    }
    
    
    
}
