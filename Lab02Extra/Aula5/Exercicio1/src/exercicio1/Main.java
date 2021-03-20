
package exercicio1;

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Departamento departamento = new Departamento();
       departamento.setDescricao(JOptionPane.showInputDialog("Descrição"));
       
       Funcionario funcionario = new Funcionario();
       funcionario.setNome(JOptionPane.showInputDialog("Nome"));
       funcionario.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código")));
       funcionario.setCargaHoraria(Double.parseDouble(JOptionPane.showInputDialog("Ch")));
       funcionario.setDepartamento(departamento);
       funcionario.definirSalario();

       JOptionPane.showMessageDialog(null, funcionario.getNome() + '\n' + funcionario.getCodigo() +'\n'
                                    + funcionario.getCargaHoraria() +'\n' + funcionario.getDepartamento().getDescricao() + '\n'
                                    + funcionario.getSalario());
      
}

}
