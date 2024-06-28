import java.util.ArrayList;
import java.util.List;

public class Catagory implements MenuComponent {
    private String name;
    private List<MenuComponent> children;

    public Catagory(String name){
        this.name = name;
        children = new ArrayList<>();
    }

    public void addComponent(MenuComponent component) {
        children.add(component);
    }

    public void removeComponent(MenuComponent component) {
        children.remove(component);
    }

    @Override
    public void displayDetails() {
        System.out.println(name);
        //System.out.println("Contents:");
        for (MenuComponent component : children) {
            component.displayDetails();
        }
    }
}
