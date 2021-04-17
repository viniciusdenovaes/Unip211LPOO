package teste;

import entidade.Carro;

public class TesteCarro {
    
    public static void main(String[] args) {
        Carro carro = new Carro("ford", 2010, 12300);
        System.out.println("VOU IMPRIMIR O CARRO:");
        System.out.println(carro);
    }
    
}
