public class Gerente extends Funcionario {
    
    private double bonus;
    
    public Gerente(String aId, String aNome, double aSalario, double aBonus){
        super(aId, aNome, aSalario);
        this.bonus = aBonus;
    }
    
    public double getBonus(){
        return bonus;
    }
    
    @Override
    public double getPagamento(){
        double pagamento = getSalario() + getBonus();
        return pagamento;
    }

    
}
