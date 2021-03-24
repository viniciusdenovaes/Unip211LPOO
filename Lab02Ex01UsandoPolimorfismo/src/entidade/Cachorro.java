package entidade;

public class Cachorro {
    
    private String nome;
    private int idade;
    private double peso;
    private boolean isDoente;

    public Cachorro(String aNome, int aIdade, double aPeso) {
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
    
    public void latir(){
        if(this.peso<4.0){
            System.out.println("au au au");
        }else if(this.peso>=4.0 && this.idade<=10.0){
            System.out.println("AU AU AU");
        }else if(this.peso>=4.0 && this.idade>10.0){
            System.out.println("ROOF ROOF ROOF");
        }
    }
    
    public void dormir(){
        System.out.println("foi dormir no sofa");
    }
    public void comer(){
        System.out.println("comendo ração de cachorro");
    }
    public void darInjecao(){
        this.isDoente = false;
    }
    public void adoece(){
        this.isDoente = true;
    }
    
    
    
}
