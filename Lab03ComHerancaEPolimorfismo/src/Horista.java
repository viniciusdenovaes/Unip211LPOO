public class Horista extends Funcionario{
    
    private double horas;

    public Horista(String aId, String aNome, double aSalario, double aHoras) {
        super(aId, aNome, aSalario);
        this.horas = aHoras;
    }
    
    public double getHoras(){
        return this.horas;
    }
    
    @Override
    public double getPagamento(){
        double pagamento = this.getSalario()*this.getHoras();
        return pagamento;
    }
    
    
}
