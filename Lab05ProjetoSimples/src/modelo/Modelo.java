package modelo;

import entidade.CadastroCompetidorCarro;
import java.util.ArrayList;
import java.util.List;

public class Modelo {
    
    List<CadastroCompetidorCarro> cadastros;
    
    public Modelo(){
        cadastros = new ArrayList<>();
    }
    
    public void addCadastro(CadastroCompetidorCarro cadastro){
        cadastros.add(cadastro);
    }
    
    public double getValorPremio(){
        double premio = 0;
        
        for(CadastroCompetidorCarro cadastro: cadastros){
            premio += cadastro.getCarro().getTaxa();
        }
        
        return premio;
    }
    
    public double getMediaTaxas(){
        double soma = 0;
        
        for(CadastroCompetidorCarro cadastro: cadastros){
            soma += cadastro.getCarro().getTaxa();
        }
        
        double media = soma / cadastros.size();
        
        return media;
    }
    
    public List<CadastroCompetidorCarro> getCadastrosComValores(
            double valor1, double valor2){
        
        List<CadastroCompetidorCarro> cadastrosFiltrados = new ArrayList<>();
        
        double valorMenor = Math.min(valor1, valor2);
        double valorMaior = Math.max(valor1, valor2);
        
        
        for(CadastroCompetidorCarro cadastro: cadastros){
            double valor = cadastro.getCarro().getValor();
            if(valor >= valorMenor && valor <= valorMaior){
                cadastrosFiltrados.add(cadastro);
            }
        }
        return cadastrosFiltrados;
    }
    
    
    @Override
    public String toString(){
        String res = "";
        
        for(CadastroCompetidorCarro cadastro: cadastros){
            res += cadastro + "\n";
        }
        
        res += "Premio: " + getValorPremio() + "\n";
        res += "Media Taxas: " + getMediaTaxas() + "\n";
        
        return res;
    }
    
}
