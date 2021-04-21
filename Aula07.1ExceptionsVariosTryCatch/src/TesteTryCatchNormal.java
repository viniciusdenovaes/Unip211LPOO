
import java.io.IOException;

public class TesteTryCatchNormal {
    
    public static void main(String[] args) {
        
        AlocadorDeRecurso alocador = null;
        
        try{
            
            alocador = new AlocadorDeRecurso(true);
            alocador.usarRecurso(true);
            
        }catch(IOException e){
            System.out.println("-----------------------------------------------------------");
            System.out.println("tratando erro dentro do primeiro catch");
            System.out.println("mensagem de erro: " + e.getMessage());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            if(alocador!=null){
                try{
                    alocador.close();
                }catch(IOException e2){
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("tratando erro ao fechar o arquivo dentro do segundo catch aninhado");
                    System.out.println("mensagem de erro: " + e2.getMessage());
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                }
            }
        }
        
        if(alocador!=null){
            if(!alocador.getIsClosed()){
                try{
                    alocador.close();
                }catch(IOException e){
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("tratando erro ao fechar o arquivo dentro do segundo catch nao aninhado");
                    System.out.println("mensagem de erro: " + e.getMessage());
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                }
            }
        }
        
    }
    
}
