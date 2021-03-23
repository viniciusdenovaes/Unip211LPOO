public class Funcionario {
    
    private String id;
    private String nome;
    private double salario;
    
    public Funcionario(String aId, String aNome, double aSalario){
        this.id = aId;
        this.nome = aNome;
        this.salario = aSalario;
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

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getPagamento(){
        return this.getSalario();
    }
    
}
