
import java.util.ArrayList;

public class MaePaiDeGato {
    
    private String nome;
    private ArrayList<Gato> gatos;

    public MaePaiDeGato(String nome) {
        this.nome = nome;
        this.gatos = new ArrayList<Gato>();
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void addGato(Gato gato){
        this.gatos.add(gato);
    }
    
    public ArrayList<Gato> getGatos(){
        return this.gatos;
    }
    
    
    
}
