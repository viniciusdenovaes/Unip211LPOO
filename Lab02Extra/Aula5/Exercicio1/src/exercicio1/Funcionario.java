/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio1;


public class Funcionario {
    private String nome;
    private int codigo;
    private double cargaHoraria;
    private double salario;
    private Departamento departamento;

    public Funcionario(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    

    
    public void definirSalario() {

        if (getCargaHoraria() < 130) {
            this.setSalario(20 * getCargaHoraria());
        }else{
            this.setSalario(25 * getCargaHoraria());
        }
        if (this.getDepartamento().getDescricao().equals( "Financeiro")){
            this.setSalario(this.getSalario() + 500);
        }
    }

    
    
}
