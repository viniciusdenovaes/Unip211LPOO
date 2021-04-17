package view;

import entidade.CadastroCompetidorCarro;
import entidade.Carro;
import entidade.Competidor;
import java.util.List;
import java.util.Scanner;

public class View {
    
    public static int getOpcao(){
        System.out.println("Entre com a opcao:");
        System.out.println("0 - para sair");
        System.out.println("1 - para adiciona cadastro");
        System.out.println("2 - listar");
        System.out.println("3 - listar carros entre dois valores");
        
        Scanner in = new Scanner(System.in);
        int opcao = Integer.parseInt(in.nextLine());
        return opcao;
    }
    
    public static Competidor insereCompetidor(){
        System.out.println("Entre com os dados do competidor");
        Scanner in = new Scanner(System.in);
        
        System.out.println("Entre com o nome:");
        String nome = in.nextLine();
        
        System.out.println("Entre com a idade");
        int idade = Integer.parseInt(in.nextLine());
        
        return new Competidor(nome, idade);
        
    }
    
    public static Carro insereCarro(){
        System.out.println("Entre com os dados do carro");
        Scanner in = new Scanner(System.in);
        
        System.out.println("Entre com o modelo");
        String modelo = in.nextLine();
        
        System.out.println("Entre com o ano");
        int ano = Integer.parseInt(in.nextLine());
        
        System.out.println("Entre com o valor");
        double valor = Double.parseDouble(in.nextLine());
        
        return new Carro(modelo, ano, valor);
        
    }
    
    public static double insereValor(){
        System.out.println("Entre com o valor");
        Scanner in = new Scanner(System.in);
        
        double valor = Double.parseDouble(in.nextLine());
        return valor;
    }
    
    public static void imprimeCadastros(List<CadastroCompetidorCarro> cadastros){
        System.out.println("Imprimindo Cadastros");
        for(CadastroCompetidorCarro cadastro: cadastros){
            System.out.println(cadastro);
        }
    }
    
}
