public class TesteAluno {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.ra = "123";
        aluno.nome = "vinicius";
        aluno.notaNP1 = 5.5;
        aluno.notaNP2 = 10;
        
        aluno.relatorio();
    }
    
}
