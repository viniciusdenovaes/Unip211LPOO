package teste;

import entidade.CadastroCompetidorCarro;
import entidade.Carro;
import entidade.Competidor;
import modelo.Modelo;

public class TesteModelo {
    
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        
        Carro carro01 = new Carro("ford", 2010, 12300);
        Competidor competidor01 = new Competidor("fulano", 20);
        modelo.addCadastro(new CadastroCompetidorCarro(carro01, competidor01));
        
        Carro carro02 = new Carro("montana", 2008, 14700);
        Competidor competidor02 = new Competidor("sicrano", 22);
        modelo.addCadastro(new CadastroCompetidorCarro(carro02, competidor02));
        
        Carro carro03 = new Carro("montana", 2018, 14700);
        Competidor competidor03 = new Competidor("coisa", 25);
        modelo.addCadastro(new CadastroCompetidorCarro(carro03, competidor03));
        
        System.out.println(modelo);
        
        
        
    }
    
}
