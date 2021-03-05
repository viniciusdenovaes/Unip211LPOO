public class Gato {
    
    private String nome;
    private int idade;
    private double peso;

    public Gato(String aNome, int aIdade, double aPeso) {
        this.nome = aNome;
        this.idade = aIdade;
        this.peso = aPeso;
    }
    
    public String getNome(){
        return "sr. " + this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getPeso(){
        return this.peso;
    }
    
    public void setIdade(int aIdade){
        this.idade = aIdade;
    }
    public void setPeso(double aPeso){
        this.peso = aPeso;
    }
    
    
    
    
    public void miar(){
        if(this.idade < 3){
            System.out.println("miau miau miau, meu nome é "+this.nome+", "
                    + "eu tenho "+this.peso+" quilos");
        }
        else if(this.idade>=3 && this.idade<=8){
            System.out.println("miaaau, meu nome é "+this.nome+", "
                    + "eu tenho "+this.peso+" quilos");
        }
        else {
            System.out.println("Grrr, meu nome é "+this.nome+", "
                    + "eu tenho "+this.peso+" quilos");
        }
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Nome: " + this.getNome() + "\n";
        res += "Idade: " + this.getIdade()+ "\n";
        res += "Peso: " + this.getPeso()+ "\n";
        return res;
    }
    
    
}
