public class Aluno {
    
    private String nome;
    private String sobreNome;
    private double np1;
    private double np2;
    
    public Aluno(String umNome, String umSobrenome, double umNp1, double umNp2){
        this.nome = umNome;
        this.sobreNome = umSobrenome;
        this.np1 = umNp1;
        this.np2 = umNp2;
    }
    
    public Aluno(String umNome, String umSobrenome){
        this.nome = umNome;
        this.sobreNome = umSobrenome;
        this.np1 = 0.0;
        this.np2 = 0.0;
    }
    
    public String getNome(){
        return "sr. " + this.nome;
    }
    
    public void setNome(String aNome){
        this.nome = aNome;
    }
    
    public String getSobreNome(){
        return this.sobreNome;
    }
    
    public void setSobreNome(String aSobreNome){
        this.sobreNome = aSobreNome;
    }
    
    public double getNp1(){
        return this.np1;
    }
    
    public void setNp1(double aNp1){
        this.np1 = aNp1;
    }
    
    public double getNp2(){
        return this.np2;
    }
    
    public void setNp2(double aNp2){
        this.np2 = aNp2;
    }
    
    public double pegarMedia(){
        double media = (this.np1 + this.np2)/2.0;
        return media;
    }
    
    @Override
    public String toString(){
        String res = ""; // result
        res = res + "Nome: " + this.getNome() + "\n";
        res += "Sobrenome: " + this.getSobreNome() + "\n";
        res += "np1: " + this.getNp1() + "\n";
        res += "np2: " + this.getNp2() + "\n";
        
        double media = this.pegarMedia();
        res += "Media: " + media + "\n";
        if(media>7.0){
            res += "o aluno passou" + "\n";
        }else{
            res += "tente " + "\n";
        }
        res += "\n";
        
        return res;
    }
    
}
