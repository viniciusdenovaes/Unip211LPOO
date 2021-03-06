public class TesteAluno {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.ra = "123";
        aluno.nome = "vinicius";
        aluno.setNotaNP1(5.5);
        aluno.setNotaNP2(10);
        
        aluno.relatorio();
    }
    
}
