public class Aluno {
    
    public String ra;
    public String nome;
    public Boletim boletim = new Boletim();
    
    public void setNotaNP1(double valor){
        this.boletim.setNotaNP1(valor);
    }
    
    public void setNotaNP2(double valor){
        this.boletim.setNotaNP2(valor);
    }
    
    public void relatorio(){
        System.out.println("ra: " + this.ra);
        System.out.println("nome: " + this.nome);
        System.out.println("NP1: " + this.boletim.notaNP1.valor);
        System.out.println("NP1: " + this.boletim.notaNP2.valor);
        double media = (
                this.boletim.notaNP1.valor + 
                this.boletim.notaNP2.valor) / 2.0;
        if(media>=7.0){
            System.out.println("O aluno passou");
        }
        else{
            System.out.println("O aluno nao passou");
        }
    }
    
}
