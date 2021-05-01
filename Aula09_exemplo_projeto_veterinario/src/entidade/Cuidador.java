package entidade;

import java.util.Objects;

public class Cuidador implements Comparable<Cuidador>{
    private String nome;

    public Cuidador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    @Override 
    public int compareTo(Cuidador outro){
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuidador other = (Cuidador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
