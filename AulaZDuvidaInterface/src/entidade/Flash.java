package entidade;

public class Flash implements Corredor {
    
    String nomeSecreto;
    
    @Override
    public void correr(){
        System.out.println("flash corre na velocidade da luz");
    }
    
}
