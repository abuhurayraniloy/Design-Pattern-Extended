// Concrete Observer
public class User implements Editor {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String documentName, String docLine) {
        System.out.println("Hey " + userName + ", update to line no: " + docLine + " in Document: " + documentName);
    }
}
