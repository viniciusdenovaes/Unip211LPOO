
import java.util.ArrayList;

public class TesteFuncionarios {
    
    public static void main(String[] args) {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        Funcionario f01 = new Funcionario("123", "vini", 100);
        funcionarios.add(f01);
        
        Funcionario g01 = new Gerente("124", "Brutus", 200, 20);
        funcionarios.add(g01);
        
        Horista h01 = new Horista("1235", "Oggi", 30, 110);
        funcionarios.add(h01);
        
        for(Funcionario f: funcionarios){
            Financeiro.fazPagamento(f);
        }
        
        
    }
    
}
