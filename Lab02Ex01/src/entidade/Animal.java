package entidade;

abstract public class Animal {
    
    private String nome;
    private int idade;
    private double peso;
    private boolean isDoente;

    public Animal(String aNome, int aIdade, double aPeso) {
        this.nome = aNome;
        this.idade = aIdade;
        this.peso = aPeso;
        this.isDoente = false;
    }
    
    public String getNome(){ 
        return this.nome;
    }
    public int getIdade(){ 
        return this.idade;
    }
    public double getPeso(){ 
        return this.peso;
    }
    public void setPeso(double aPeso){
        this.peso = aPeso;
    }
    public boolean getIsDoente(){ 
        return this.isDoente;
    }
    
    abstract public String getRaca();
    
    public void aumentaIdade(){
        this.idade++;
    }
    
    abstract public void fazBarulho();
    
    abstract public void dormir();
    
    abstract public void comer();
    
    public void darInjecao(){
        this.isDoente = false;
    }
    public void adoece(){
        this.isDoente = true;
    }
    
    
    
    
    
}
