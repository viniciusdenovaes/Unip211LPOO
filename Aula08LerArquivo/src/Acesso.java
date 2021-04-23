
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Acesso {
    
    public static void lerArquivo(){
        
        
        
        try (   InputStream is = new FileInputStream("files/arquivo.in"); 
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
            ){
            String linha;
            int i=0;
            while((linha = br.readLine()) != null){
                System.out.println("linha numero " + i++ + " - " + linha);
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
