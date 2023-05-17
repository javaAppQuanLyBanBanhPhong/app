package ravenTable;

import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableActionCellEditor extends DefaultCellEditor{
    private TableActionEvent event;
    
    public TableActionCellEditor(TableActionEvent event){
        super(new JCheckBox());
        this.event = event;
    }
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelActionButton actionButton = new PanelActionButton();
        actionButton.setBackground(table.getSelectionBackground());
        actionButton.initEvent(event, row);
        return actionButton;
    }
}
