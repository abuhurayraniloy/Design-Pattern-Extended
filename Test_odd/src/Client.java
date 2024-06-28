public class Client {
    public static void main(String[] args) {
        DocumentContent document = new DocumentContent("Test Document");

        User user1 = new User("Niloy");
        User user2 = new User("Shaeakh");
        User user3 = new User("Amit");

        document.addEditor(user1);
        document.addEditor(user2);
        document.addEditor(user3);

        document.editDocument("29");
        System.out.println("------------------------");
        document.removeEditor(user3);
        document.editDocument("21");
    }// Decoupling between subject and observer
    // Reusability, Scalability
}
