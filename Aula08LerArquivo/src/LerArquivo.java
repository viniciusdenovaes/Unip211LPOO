
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class LerArquivo {
    
    public static void lerArquivo(){
        
        InputStream is;
        InputStreamReader isr;
        BufferedReader br;
        
        try {
            is = new FileInputStream("files/arquivo.in");
            isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            br = new BufferedReader(isr);
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
