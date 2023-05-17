package ravenTable;

public interface TableActionEvent {
    public void onEdit(int row);
    public void onDelere(int row);
    public void onView(int row);
    
}
