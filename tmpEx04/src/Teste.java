public class Teste {
    
    public static void main(String[] args) {
        
        Aluno aluno01 = new Aluno();
        aluno01.ra = "123";
        aluno01.nome = "vinicius";
        aluno01.boletim.notaNP1.valor = 5.;
        aluno01.boletim.notaNP2.valor = 4.;
        aluno01.relatorio();
        
        aluno01.boletim.notaNP2.valor = 10.;
        aluno01.relatorio();
   
        Aluno aluno02 = new Aluno();
        aluno02.ra = "124";
        aluno02.nome = "fulano";
        aluno02.boletim.notaNP1.valor = 7.;
        aluno02.boletim.notaNP2.valor = 9.;
        aluno02.relatorio();
   
    }
    
}
