
package tabelas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TabelaSerie extends AbstractTableModel{
    private static final String[] colNomes={
        "id_serie", "turma", "ano","turno"
    };
           
    private ArrayList<String[]> ResultSets;
    public TabelaSerie(ResultSet rs) throws SQLException{
            setResult( rs ); 
    }
  @Override
    public int getRowCount() {
        return ResultSets.size();
    }
    @Override
    public int getColumnCount() {
        return colNomes.length;
    }
    @Override
    public String getColumnName(int param) {
        return colNomes[param];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] row = ResultSets.get(rowIndex);
        return row[columnIndex];
    }
    public void setResult( ResultSet rs ) throws SQLException{  
        ResultSets = new ArrayList<String[]>();
        while (rs.next()){
            String[] row = { 
                rs.getString("id_serie"),
                rs.getString("turma"),
                rs.getString("ano"),
                rs.getString("turno")
            };
            ResultSets.add(row);                    
        }
        fireTableStructureChanged();
    }
    public void deleteRow (int row) {
        ResultSets.remove(row);
        fireTableRowsDeleted(row, row);
    }
   
}
