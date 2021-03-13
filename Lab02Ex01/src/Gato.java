public class Gato {
    
    private String nome;
    private int idade;
    private double peso;
    private boolean isDoente;

    public Gato(String aNome, int aIdade, double aPeso) {
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
    
    public void miar(){
        System.out.println("miaaaauu");
    }
    
    public void dormir(){
        System.out.println("foi dormir no alto");
    }
    public void comer(){
        System.out.println("comendo ração de gato");
    }
    public void darInjecao(){
        this.isDoente = false;
    }
    public void adoece(){
        this.isDoente = true;
    }
    
    
    
}
