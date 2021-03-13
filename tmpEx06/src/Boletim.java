public class Boletim {
    
    private Nota notaNP1;
    private Nota notaNP2;
    
    public Boletim(){
        this.notaNP1 = new Nota(0);
        this.notaNP2 = new Nota(0);
    }
    
    public double getNotaNP1(){
        return this.notaNP1.getValor();
    }
    public void setNotaNP1(double valor){
        this.notaNP1 = new Nota(valor);
    }
    
    public double getNotaNP2(){
        return this.notaNP2.getValor();
    }
    public void setNotaNP2(double valor){
        this.notaNP2 = new Nota(valor);
    }
    
    public double getMedia(){
        return (this.notaNP1.getValor()+
                this.notaNP2.getValor())/2.;
    }
    

}
