public class Horista {
    
    private String id;
    private String nome;
    private double salario;
    private double horas;
    
    public Horista(String aId, String aNome, double aSalario, double aHoras){
        this.id = aId;
        this.nome = aNome;
        this.salario = aSalario;
        this.horas = aHoras;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
    public double getHoras(){
        return this.horas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getPagamento(){
        double pagamento = getSalario()*getHoras();
        return pagamento;
    }
    
}
