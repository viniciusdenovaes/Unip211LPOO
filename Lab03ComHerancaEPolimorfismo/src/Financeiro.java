public class Financeiro {
    
    static public void fazPagamento(Funcionario funcionario){
        double pagamento = funcionario.getPagamento();
        String nome = funcionario.getNome();
        String id = funcionario.getId();
        
        System.out.println("Pagando " + pagamento + " para " + nome + "("+id+")");
    }
    
}
