public class Gerente {
    
    private String id;
    private String nome;
    private double salario;
    private double bonus;
    
    public Gerente(String aId, String aNome, double aSalario, double aBonus){
        this.id = aId;
        this.nome = aNome;
        this.salario = aSalario;
        this.bonus = aBonus;
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
    
    public double getBonus() {
        return bonus;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getPagamento(){
        double pagamento = getSalario() + getBonus();
        return pagamento;
    }
    
}
