package entidade;

public class Pato {
    
    private String nome;
    private int idade;
    private double peso;
    private boolean isDoente;

    public Pato(String aNome, int aIdade, double aPeso) {
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
    
    public void aumentaIdade(){
        this.idade++;
    }
    
    public void quack(){
        System.out.println("quaaack quaack");
    }
    
    public void dormir(){
        System.out.println("foi dormir no quintal");
    }
    public void comer(){
        System.out.println("comendo o que o pato come");
    }
    public void darInjecao(){
        this.isDoente = false;
    }
    public void adoece(){
        this.isDoente = true;
    }
    
    
    
}
