public class Aluno {
    
    public String ra;
    public String nome;
    public Boletim boletim;
    
    public Aluno(){
        this.boletim = new Boletim();
    }
    
    public double media(){
        return (boletim.notaNP1.valor+
                boletim.notaNP2.valor)/2.;
    }
    
    public boolean isPassou(){
        return media()>=7.;
    }
    
    public void relatorio(){
        System.out.println("Ra: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Nota NP1: " + boletim.notaNP1.valor);
        System.out.println("Nota NP2: " + boletim.notaNP2.valor);
        System.out.println("Media: " + media());
        if(isPassou()){
            System.out.println("O aluno passou");
        }else{
            System.out.println("O aluno não passou");
        }
        System.out.println();
            
    }
    
}
