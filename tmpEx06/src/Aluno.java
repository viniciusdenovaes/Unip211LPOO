public class Aluno {
    
    private String ra;
    private String nome;
    private Boletim boletim;
    
    public Aluno(String aRa, String aNome){
        this.ra = aRa;
        this.nome = aNome;
        this.boletim = new Boletim();
    }
    
    public void setNotaNP1(double nota){
        this.boletim.setNotaNP1(nota);
    }
    
    public void setNotaNP2(double nota){
        this.boletim.setNotaNP2(nota);
    }
    
    public boolean isPassou(){
        return this.boletim.getMedia()>=7.;
    }
    
    public void relatorio(){
        System.out.println("Ra: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Nota NP1: " + this.boletim.getNotaNP1());
        System.out.println("Nota NP2: " + this.boletim.getNotaNP2());
        System.out.println("Media: " + this.boletim.getMedia());
        if(isPassou()){
            System.out.println("O aluno passou");
        }else{
            System.out.println("O aluno não passou");
        }
        System.out.println();
            
    }
    
}
