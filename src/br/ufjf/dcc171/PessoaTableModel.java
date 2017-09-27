package br.ufjf.dcc171;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PessoaTableModel extends AbstractTableModel{

    private List<Pessoas> pessoas;
    
    public PessoaTableModel(List<Pessoas> dados) {
        pessoas = dados;
    }

    @Override
    public int getRowCount() {
        return pessoas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:
                return pessoas.get(rowIndex).getNome();

           case 1:
                return pessoas.get(rowIndex).getIdade();

           case 2:
                return pessoas.get(rowIndex).getEmail();
                
           default:
               throw new IndexOutOfBoundsException();

    }
       
       
    }

    @Override
    public String getColumnName(int column) {
          switch(column){
           case 0:
                return "Nome";

           case 1:
                return "Idade";

           case 2:
                return "E-mail";
                
           default:
               throw new IndexOutOfBoundsException();}
    
    }

    public void add(Pessoas p) {
        pessoas.add(p);
        //this.fireTableDataChanged();
        this.fireTableRowsInserted(pessoas.size()-1, pessoas.size()-1);
    }
    
}
