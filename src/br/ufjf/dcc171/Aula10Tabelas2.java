package br.ufjf.dcc171;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Aula10Tabelas2 {

    public static void main(String[] args) {
            List<Pessoas> dados = getSampleData();
            JanelaTabela janela = new JanelaTabela(dados);
            janela.setSize(400, 300);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setLocationRelativeTo(null);
            janela.setVisible(true);
    }
    
    private static List<Pessoas> getSampleData()
    {
        List<Pessoas> pessoas = new ArrayList<Pessoas>(){
        {add(new Pessoas("Fulano", 18, "fulano@gmail.com"));
        add(new Pessoas("Beltrano", 18, "fulano@gmail.com"));
        add(new Pessoas("Ciclano", 18, "fulano@gmail.com"));}};
        
        return pessoas;
    }
    
}
