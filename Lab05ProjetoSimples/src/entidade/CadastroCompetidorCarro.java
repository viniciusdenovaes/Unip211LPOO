package entidade;

public class CadastroCompetidorCarro {
    
    private Carro carro;
    private Competidor competidor;

    public CadastroCompetidorCarro(Carro carro, Competidor competidor) {
        this.carro = carro;
        this.competidor = competidor;
    }

    public Carro getCarro() {
        return carro;
    }

    public Competidor getCompetidor() {
        return competidor;
    }

    @Override
    public String toString() {
        String res = "";
        res += getCompetidor();
        res += getCarro();
        return res;
    }
    
    
}
