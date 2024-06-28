public class Dish implements MenuComponent {
    private String name;
    private double price;

    public Dish(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void displayDetails() {
        System.out.println("Dish : " + name + "      Price: " + price);
    }
}
