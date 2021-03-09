public class Posto {
    
    public static void abasteceCarro(Carro carro, double gasolina){
        carro.tanque = carro.tanque + gasolina;
    }
    
    public static void abasteceCarro(double tanque, double gasolina){
        tanque = tanque + gasolina;
    }
    
}
