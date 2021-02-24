public class Aluno {
    
    String nome;
    String sobreNome;
    double np1;
    double np2;
    
    public Aluno(String umNome, String umSobrenome, double umNp1, double umNp2){
        this.nome = umNome;
        this.sobreNome = umSobrenome;
        this.np1 = umNp1;
        this.np2 = umNp2;
    }
    
    public double pegarMedia(){
        double media = (this.np1 + this.np2)/2.0;
        return media;
    }
    
    
    @Override
    public String toString(){
        String res = ""; // result
        res = res + "Nome: " + this.nome + "\n";
        res += "Sobrenome: " + this.sobreNome + "\n";
        res += "np1: " + this.np1 + "\n";
        res += "np2: " + this.np2 + "\n";
        
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
