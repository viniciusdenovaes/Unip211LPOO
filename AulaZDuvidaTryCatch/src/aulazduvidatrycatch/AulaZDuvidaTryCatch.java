package aulazduvidatrycatch;

import java.io.IOException;


public class AulaZDuvidaTryCatch {

    public static void main(String[] args) {
        boolean b = false;
        
        try{
            
            if(b==true){
                System.out.println("deu certo");
            }else{
                IOException e = new IOException();
                throw e;
            }
            System.out.println("fim do try");
            
        }catch(IOException ex){
            System.out.println("deu erro");
            ex.printStackTrace();
        }finally{
            System.out.println("sempre entra aqui");
        }
        
        System.out.println("fim do codigo");
        
    }
    
}
