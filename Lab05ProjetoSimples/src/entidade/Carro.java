package entidade;

public class Carro {
    
    private String modelo;
    private int ano;
    private double valor;
    
    public Carro(String aModelo, int aAno, double aValor){
        this.modelo = aModelo;
        this.ano = aAno;
        this.valor = aValor;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public double getValor(){
        return this.valor;
    }
    public double getTaxa(){
        return (this.valor*1.0)/100.0;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Modelo " + getModelo() + "\n";
        res += "Ano " + getAno() + "\n";
        res += "Valor " + getValor() + "\n";
        res += "Taxa: " + getTaxa() + "\n";
        return res;
    }
    
}
