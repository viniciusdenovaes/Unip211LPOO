public class TesteFuncionarios {
    
    public static void main(String[] args) {
        System.out.println("\nFUNCIONARIO\n");
        Funcionario f01 = new Funcionario("123", "vini", 100);
        Financeiro.fazPagamento(f01);
        
        System.out.println("\nGERENTE\n");
        Gerente g01 = new Gerente("124", "Brutus", 200, 20);
        System.out.println(g01.getId());
        System.out.println(g01.getNome());
        System.out.println(g01.getSalario());
        System.out.println(g01.getBonus());
        System.out.println("Pagamento: " + g01.getPagamento());
        
        
        Financeiro.fazPagamentoGerente(g01);
        
        System.out.println("\nHORISTA\n");
        Horista h01 = new Horista("1235", "Oggi", 30, 110);
        System.out.println(h01.getId());
        System.out.println(h01.getNome());
        System.out.println(h01.getSalario());
        System.out.println(h01.getHoras());
        System.out.println("Pagamento: " + h01.getPagamento());
          
        Financeiro.fazPagamentoHorista(h01);
    }
    
}
