
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class AcessoDados {
    public static List<Animal> lerArquivo(String filePath){
        
        List<Animal> animais = new ArrayList<>();
        
        try (   InputStream is = new FileInputStream(filePath); 
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
            ){
            String linha;
            int i=0;
            while((linha = br.readLine()) != null){
                
                System.out.println("linha " + i++);
                
                String[] palavras = linha.split(",");
                
                for(String p: palavras){
                    System.out.println("palavra: " + p);
                }
                
                String nome = palavras[0];
                int idade = Integer.parseInt(palavras[1]);
                double peso = Double.parseDouble(palavras[2]);
                
                Animal animal = new Animal(nome, idade, peso);
                animais.add(animal);
                
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return animais;
        
    }
    
    
}
