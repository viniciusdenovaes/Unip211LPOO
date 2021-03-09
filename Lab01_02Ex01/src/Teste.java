public class Teste {
    
    public static void main(String[] args) {
        Carro carro = new Carro("jeep", 2010);
        carro.imprime();
        
        Posto.abasteceCarro(carro, 11);
        
        carro.imprime();
        
        Posto.abasteceCarro(carro.tanque, 34);
        
        carro.imprime();
   
    }
    
}
