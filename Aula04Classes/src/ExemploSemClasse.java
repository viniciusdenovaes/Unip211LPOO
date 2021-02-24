public class ExemploSemClasse {

    public static void main(String[] args) {
        String nome01 = "vinicius";
        String sobreNome01 = "pereira";
        double np101 = 5.5;
        double np201 = 7.8;
        
        imprime(nome01, sobreNome01, np101, np201);
        
        String nome02 = "Joao";
        String sobreNome02 = "Davi";
        double np102 = 10;
        double np202 = 9.9;
        
        imprime(nome02, sobreNome02, np102, np202);
        
    }
    
    public static void imprime(String nome, String sobreNome, double np1, double np2){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobreNome);
        System.out.println("np1: " + np1);
        System.out.println("np2: " + np2);
        
        double media = (np1+np2)/2.0;
        System.out.println("Media: " + media);
        if(media>7.0){
            System.out.println("o aluno passou");
        }else{
            System.out.println("tente ");
        }
        System.out.println("");
    }

}
