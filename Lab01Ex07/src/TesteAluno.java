public class TesteAluno {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno("123", "vinicius");
        aluno.setNotaNP1(5.5);
        aluno.setNotaNP2(10);
        
        aluno.relatorio();
        
        System.out.println(aluno);
    }
    
}
