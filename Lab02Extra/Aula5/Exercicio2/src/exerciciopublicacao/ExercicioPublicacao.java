package exerciciopublicacao;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ExercicioPublicacao {
    public static void main(String[] args) {
       
        ArrayList<Publicacao> publicacaoes = new ArrayList<>();
        
        Editora editora = new Editora();
        editora.setRazaoSocial(JOptionPane.showInputDialog("Razão Social"));
        editora.setCnpj(JOptionPane.showInputDialog("CNPJ"));
        
        Publicacao publicacao = new Publicacao();
        publicacao.setTitulo(JOptionPane.showInputDialog("Titulo 1"));
        publicacao.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código 1")));
        publicacao.setNumeroPaginas(Integer.parseInt(JOptionPane.showInputDialog("Número de Páginas 1")));
        publicacao.setEditora(editora);
        publicacao.calcularCusto();
        
        publicacaoes.add(publicacao);
        Publicacao publicacao2 = new Publicacao();
        publicacao2.setTitulo(JOptionPane.showInputDialog("Titulo 2 "));
        publicacao2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código 2 ")));
        publicacao2.setNumeroPaginas(Integer.parseInt(JOptionPane.showInputDialog("Número de Páginas 2")));
        publicacao2.setEditora(editora);
        publicacao2.calcularCusto();
                
        publicacaoes.add(publicacao2);
        
        Publicacao p;
        Iterator iter = publicacaoes.iterator();
        while (iter.hasNext()){
            p = (Publicacao) iter.next();
            JOptionPane.showMessageDialog(null, p.getTitulo() + '\n' + p.getCodigo()
        + '\n' + p.getNumeroPaginas() + '\n' + p.getCusto() + '\n' + p.getEditora().getRazaoSocial());
        }
        
       /* for (int i =0; i < 2; i++){
            p = publicacaoes.get(i);
             JOptionPane.showMessageDialog(null, p.getTitulo() + '\n' + p.getCodigo()
             + '\n' + p.getNumeroPaginas() + '\n' + p.getCusto()+ '\n' + p.getEditora().getRazaoSocial());
        }*/
       
       /*for (Publicacao p: publicacaoes){
       JOptionPane.showMessageDialog(null, p.getTitulo() + '\n' + p.getCodigo()
             + '\n' + p.getNumeroPaginas() + '\n' + p.getCusto() + '\n' + p.getEditora().getRazaoSocial());
       }*/
        
    }
    
}
