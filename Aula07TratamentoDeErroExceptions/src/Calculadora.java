public class Calculadora {
    
    public boolean isPrimoParaNumerosPositivos(int n) throws ExceptionNumeroEntradoZero, ExceptionNumerosNegativos {
        
        // flag para numeros negativos
        if(n<0){
            throw new ExceptionNumerosNegativos("entrada " + n + " nao pode ser negativa");
        }
        
        if(n==0){
            throw new ExceptionNumeroEntradoZero("numero entrado " + n + " nao pode ser zero");
        }
        
        if(n==1){
            return false;
        }
        
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public int divisao(int a, int b) throws ArithmeticException{
        return a/b;
    }
    
}
