package main;

import entidade.CadastroCompetidorCarro;
import entidade.Carro;
import entidade.Competidor;
import java.util.List;
import modelo.Modelo;
import view.View;

public class Main {
    
    public static void main(String[] args) {
        
        Modelo modelo = new Modelo();
        
        int opcao = -1;
        
        while(opcao!=0){
            opcao = View.getOpcao();
            switch(opcao){
                case 0: 
                    System.out.println("Saindo do programa");
                    System.exit(0);
                    break;
                case 1: 
                    System.out.println("Você selecionou o cadastro");
                    
                    Carro carro = View.insereCarro();
                    Competidor competidor = View.insereCompetidor();
                    
                    modelo.addCadastro(new CadastroCompetidorCarro(carro, competidor));
                    break;
                case 2:
                    System.out.println("Listando os cadastros");
                    
                    System.out.println(modelo);
                    break;
                    
                case 3:
                    System.out.println("Entre com os dois valor:");
                    
                    double valor1 = View.insereValor();
                    double valor2 = View.insereValor();
                    
                    List<CadastroCompetidorCarro> cadastros = 
                            modelo.getCadastrosComValores(valor1, valor2);
                    
                    View.imprimeCadastros(cadastros);
                    
                    
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
        
        
    }
    
}
