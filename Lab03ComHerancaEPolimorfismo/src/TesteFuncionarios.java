public class TesteFuncionarios {
    
    public static void main(String[] args) {
        System.out.println("\nFUNCIONARIO\n");
        Funcionario f01 = new Funcionario("123", "vini", 100);
        Financeiro.fazPagamento(f01);
        
        System.out.println("\nGERENTE\n");
        Funcionario g01 = new Gerente("124", "Brutus", 200, 20);
        Financeiro.fazPagamento(g01);
        
        System.out.println("\nHORISTA\n");
        Horista h01 = new Horista("1235", "Oggi", 30, 110);
        h01.getHoras();
        Financeiro.fazPagamento(h01);
    }
    
}
