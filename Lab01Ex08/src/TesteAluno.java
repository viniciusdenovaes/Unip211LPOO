public class TesteAluno {
    
    public static void main(String[] args) {
        Aluno.relatorioDeClasse();
        Aluno aluno = new Aluno("123", "vinicius");
        aluno.setNotaNP1(5.5);
        aluno.setNotaNP2(10);
        
        aluno.relatorio();
        
        System.out.println(aluno);
        Aluno.relatorioDeClasse();
        
        Aluno aluno02 = new Aluno("124", "Brutus");
        Aluno aluno03 = new Aluno("125", "Saori");
        
        Aluno.relatorioDeClasse();
    }
    
}
