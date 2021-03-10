public class Carro {
    
    Pessoa dono;
    int ano;

    public Carro(int aAno) {
        this.ano = aAno;
    }
    
    public Carro(int aAno, Pessoa aDono) {
        this.ano = aAno;
        this.dono = aDono;
    }
    
    public void imprime(){
        if(this.dono==null){
            System.out.println("Sem dono");
        }
        else{
            System.out.println("Dono: " + this.dono.nome + " " + this.dono.sNome);
        }
        System.out.println("Ano: " + this.ano);
        System.out.println();
    }
    
}
