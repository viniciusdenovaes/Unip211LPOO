public class Aluno {
    
    public String ra;
    public String nome;
    public double notaNP1;
    public double notaNP2;
    
    public double media(){
        return (notaNP1+notaNP2)/2.;
    }
    
    public boolean isPassou(){
        return media()>=7.;
    }
    
    public void relatorio(){
        System.out.println("Ra: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Nota NP1: " + notaNP1);
        System.out.println("Nota NP2: " + notaNP2);
        System.out.println("Media: " + media());
        if(isPassou()){
            System.out.println("O aluno passou");
        }else{
            System.out.println("O aluno não passou");
        }
        System.out.println();
            
    }
    
}
