public class Aluno {
    
    private String ra;
    private String nome;
    private Boletim boletim = new Boletim();
    
    private static int quantidadeDeAlunos = 0;

    public Aluno(String aRa, String aNome) {
        this.ra = aRa;
        this.nome = aNome;
        Aluno.quantidadeDeAlunos+=1;
    }
    
    public void setNotaNP1(double valor){
        this.boletim.setNotaNP1(valor);
    }
    
    public double getNotaNP1(){
        return this.boletim.getNotaNP1();
    }
    
    public void setNotaNP2(double valor){
        this.boletim.setNotaNP2(valor);
    }
    
    public double getNotaNP2(){
        return this.boletim.getNotaNP2();
    }
    
    public static void relatorioDeClasse(){
        System.out.println("A quantidade de alunos criada foi " + Aluno.quantidadeDeAlunos);
    }
    
    public void relatorio(){
        System.out.println("ra: " + this.ra);
        System.out.println("nome: " + this.nome);
        System.out.println("NP1: " + this.getNotaNP1());
        System.out.println("NP1: " + this.getNotaNP2());
        double media = (
                this.getNotaNP1() + 
                this.getNotaNP2()) / 2.0;
        if(media>=7.0){
            System.out.println("O aluno passou");
        }
        else{
            System.out.println("O aluno nao passou");
        }
    }
    
}
