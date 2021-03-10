public class Aluno {
    
    public String ra;
    public String nome;
    public Nota notaNP1 = new Nota();
    public Nota notaNP2 = new Nota();
    
    public double media(){
        return (notaNP1.valor+notaNP2.valor)/2.;
    }
    
    public boolean isPassou(){
        return media()>=7.;
    }
    
    public void relatorio(){
        System.out.println("Ra: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Nota NP1: " + notaNP1.valor);
        System.out.println("Nota NP2: " + notaNP2.valor);
        System.out.println("Media: " + media());
        if(isPassou()){
            System.out.println("O aluno passou");
        }else{
            System.out.println("O aluno não passou");
        }
        System.out.println();
            
    }
    
}
