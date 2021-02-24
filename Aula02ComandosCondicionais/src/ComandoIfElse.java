
public class ComandoIfElse {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 2;

        if(a<b) {
            System.out.println("a eh menor que b");
        } else {
            System.out.println("a eh maior ou igual a b");
        }

        System.out.println("\nVerificacao com if else if:\n");

        if(a<b) {
            System.out.println("a eh menor que b");
        } else if(a>b) {
            System.out.println("a eh maior que b");
        } else if (a==b) {
            System.out.println("a eh igual a b");
        } else{
            System.out.println("nenhuma condicao foi satisfeita");
        }


    }

}
