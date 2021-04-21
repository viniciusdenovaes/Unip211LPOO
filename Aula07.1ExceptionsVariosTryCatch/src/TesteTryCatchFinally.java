
import java.io.IOException;

public class TesteTryCatchFinally {
    
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
        }finally{
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
    
}
