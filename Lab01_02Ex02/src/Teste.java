public class Teste {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro(2011);
        
        carro.imprime();
        
        Cartorio.mudaDonoCarro(carro, new Pessoa("primeiro", "dono"));
        
        carro.imprime();
        
        Cartorio.mudaDonoCarro(carro, new Pessoa("segundo", "dono"));
        
        carro.imprime();
        
        Cartorio.mudaDono(carro.dono, new Pessoa("terceiro", "dono"));
        
        carro.imprime();
        
    }
    
}
