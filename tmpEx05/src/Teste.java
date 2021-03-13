public class Teste {
    
    public static void main(String[] args) {
        
        Aluno aluno01 = new Aluno("123", "vinicius");
        aluno01.setNotaNP1(-5.0);
        aluno01.setNotaNP2(4.0);
        aluno01.relatorio();
        
        aluno01.setNotaNP1(10.0);
        aluno01.relatorio();
   
        Aluno aluno02 = new Aluno("124", "fulano");
        aluno02.setNotaNP1(7.0);
        aluno02.setNotaNP2(19.0);
        aluno02.relatorio();
   
    }
    
}
