
import java.io.IOException;

public class TesteTryWithResource {
    
    public static void main(String[] args) {
        
        try(AlocadorDeRecurso alocador = new AlocadorDeRecurso(true)){
            
            alocador.usarRecurso(false);
            
        }catch(IOException e){
            System.out.println("-----------------------------------------------------------");
            System.out.println("tratando erro dentro do primeiro catch");
            System.out.println("mensagem de erro: " + e.getMessage());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
        
    }
    
}
