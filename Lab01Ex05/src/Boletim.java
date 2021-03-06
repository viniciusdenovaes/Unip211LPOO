public class Boletim {
    
    Nota notaNP1;
    Nota notaNP2;

    public Boletim() {
        this.notaNP1 = new Nota(0);
        this.notaNP2 = new Nota(0);
    }
    
    public void setNotaNP1(double valor){
        this.notaNP1 = new Nota(valor);
    }
    
    public void setNotaNP2(double valor){
        this.notaNP2 = new Nota(valor);
    }
    
    
    
}
