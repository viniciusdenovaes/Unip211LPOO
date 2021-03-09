public class Carro {
    public String modelo;
    public int ano;
    public double tanque;
    
    public Carro(String aModelo, int aAno){
        this.modelo = aModelo;
        this.ano = aAno;
        this.tanque = 0;
    }
    
    public void imprime(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Tanque: " + this.tanque);
        System.out.println("");
    }
    
}
