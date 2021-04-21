public class TestaCalculadora {
    
    
    public static void main(String[] args) {
        
        //testeIsPrimo();
        testeDivisaoPorZero();
    }
    
    public static void testeIsPrimo(){
        
        Calculadora calculadora = new Calculadora();
        
        for(int i=-2; i<=10; i++){
            boolean resultado;
            
            try{
                resultado = calculadora.isPrimoParaNumerosPositivos(i);
            
                if(resultado){
                    System.out.println("numero " + i + " eh primo");
                }else{
                    System.out.println("numero " + i + " nao eh primo");
                }
            }catch(ExceptionNumeroEntradoZero e){
                System.out.println("tratando erro de exception de numero igual a zero");
                e.printStackTrace();
                System.out.println("Mensagem de erro: " + e.getMessage());
            }catch(ExceptionNumerosNegativos e){
                System.out.println("tratando erro de exception de numero negativo");
                e.printStackTrace();
                System.out.println("Mensagem de erro: " + e.getMessage());
            }
            
        }
    }
    
    public static void testeDivisaoPorZero(){
        
        Calculadora calculadora = new Calculadora();
        
        System.out.println("começo do teste de divisao por zero");
        
        try{
            System.out.println("5/0 = " + calculadora.divisao(5, 0));
        }catch(ArithmeticException e){
            System.out.println("tentando dividir por zero???");
        }
        
        System.out.println("final do teste de divisao por zero");
   
    }
    
}
