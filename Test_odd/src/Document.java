// Subject interface
public interface Document {
    void addEditor(Editor editor);
    void removeEditor(Editor editor);
    void notifyEditors(String docLine);
}
