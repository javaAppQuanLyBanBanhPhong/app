package ravenTable;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRender extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        PanelActionButton action = new PanelActionButton();
        if(isSelected == false && row % 2 == 0)
            action.setBackground(new java.awt.Color(255, 255, 255));
        else
            action.setBackground(com.getBackground());
        return action;
    }
    
}
