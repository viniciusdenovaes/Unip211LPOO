public class TestaMaePaiDeGato {
    
    public static void main(String[] args) {
        Gato gato00 = new Gato("Joaquim", 5, 4);
        Gato gato01 = new Gato("Oggi", 5, 15);
        Gato gato02 = new Gato("Ze Pequeno", 15, 5);
        
        MaePaiDeGato pessoa = new MaePaiDeGato("vinicius");
        
        pessoa.addGato(gato00);
        pessoa.addGato(gato01);
        pessoa.addGato(gato02);
        pessoa.addGato(new Gato("Claudio", 3, 8));
        
        for(Gato gato: pessoa.getGatos()){
            System.out.println(gato);
            gato.miar();
        }

   
    }
    
}
