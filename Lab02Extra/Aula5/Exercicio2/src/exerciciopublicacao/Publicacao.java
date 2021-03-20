
package exerciciopublicacao;


public class Publicacao {
     private String titulo;
    private int codigo;
    private int numeroPaginas;
    private double custo;
    private Editora editora;
        
    public Publicacao(){
    
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
   public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
     
   
    public void calcularCusto() {
        if( getNumeroPaginas() > 200) {
            this.setCusto(0.085 * this.getNumeroPaginas());
        }
        else{
            this.setCusto(0.2 * this.getNumeroPaginas());
        }
    }

    

}