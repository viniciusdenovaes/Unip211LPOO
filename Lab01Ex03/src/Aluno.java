public class Aluno {
    
    public String ra;
    public String nome;
    public Nota notaNP1;
    public Nota notaNP2;
    
    public void relatorio(){
        System.out.println("ra: " + this.ra);
        System.out.println("nome: " + this.nome);
        System.out.println("NP1: " + this.notaNP1);
        System.out.println("NP1: " + this.notaNP2);
        double media = (this.notaNP1.valor + this.notaNP2.valor) / 2.0;
        if(media>=7.0){
            System.out.println("O aluno passou");
        }
        else{
            System.out.println("O aluno nao passou");
        }
    }
    
}
