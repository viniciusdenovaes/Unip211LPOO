
import java.io.Closeable;
import java.io.IOException;

public class AlocadorDeRecurso implements Closeable {
    
    boolean isClosed;

    public AlocadorDeRecurso(boolean disponivel) throws IOException {
        
        System.out.println("Tentando alocar o recurso");
        if(!disponivel){
            throw new IOException("recurso nao esta diponivel");
        }
        
        isClosed = false;
        System.out.println("Recurso alocado");
        
    }
    
    public boolean getIsClosed(){
        return isClosed;
    }
    
    public void usarRecurso(boolean disponivel) throws IOException {
        System.out.println("tentando usar o recurso");
        if(!disponivel){
            throw new IOException("recurso nao disponivel");
        }
        
        System.out.println("recurso usado");
    }
    
    @Override
    public void close() throws IOException{
        System.out.println("tentando fechar o recurso");
        if(isClosed){
            throw new IOException("nao foi possivel fechar o recurso ja esta fechado");
        }
        
        isClosed = true;
        System.out.println("recurso liberado");
    }
    
    
    
    
}
