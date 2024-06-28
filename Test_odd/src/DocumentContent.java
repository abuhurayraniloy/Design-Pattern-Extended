import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class DocumentContent implements Document {
    private List<Editor> editors = new ArrayList<>();
    private String documentName;

    public DocumentContent(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public void addEditor(Editor editor) {
        editors.add(editor);
    }

    @Override
    public void removeEditor(Editor editor) {
        editors.remove(editor);
    }

    @Override
    public void notifyEditors(String docLine) {
        for (Editor editor : editors) {
            editor.update(documentName, docLine);
        }
    }

    public void editDocument(String docLine) {
        System.out.println("New update on line no: " + docLine + " uploaded to document: " + documentName + "!");
        notifyEditors(docLine);
    }
}