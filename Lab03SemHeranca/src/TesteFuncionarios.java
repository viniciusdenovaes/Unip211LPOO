public class TesteFuncionarios {
    
    public static void main(String[] args) {
        Funcionario f01 = new Funcionario("123", "vini", 100);
        Financeiro.fazPagamento(f01);
        
        Gerente g01 = new Gerente("124", "Brutus", 200, 20);
        Financeiro.fazPagamentoGerente(g01);
        
        Horista h01 = new Horista("1235", "Oggi", 30, 110);
        Financeiro.fazPagamentoHorista(h01);
    }
    
}
