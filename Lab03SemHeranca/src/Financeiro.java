public class Financeiro {
    
    static public void fazPagamento(Funcionario funcionario){
        double pagamento = funcionario.getPagamento();
        String nome = funcionario.getNome();
        String id = funcionario.getId();
        
        System.out.println("Pagando " + pagamento + " para " + nome + "("+id+")");
    }
    
    static public void fazPagamentoGerente(Gerente gerente){
        double pagamento = gerente.getPagamento();
        String nome = gerente.getNome();
        String id = gerente.getId();
        
        System.out.println("Pagando " + pagamento + " para " + nome + "("+id+")");
    }
    
    static public void fazPagamentoHorista(Horista horista){
        double pagamento = horista.getPagamento();
        String nome = horista.getNome();
        String id = horista.getId();
        
        System.out.println("Pagando " + pagamento + " para " + nome + "("+id+")");
    }
    
}
