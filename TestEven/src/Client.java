public class Client {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Fries", 250.00);
        Dish dish2 = new Dish("Burger", 299.00);
        Dish dish3 = new Dish("Omlette", 99.00);
        Dish dish4 = new Dish("Ice Coffee", 250.00);
        Dish dish5 = new Dish("Cold Coffee", 229.00);
        Dish dish6 = new Dish("Latte", 199.00);


        Catagory catagory1 = new Catagory("Appitizer");
        catagory1.addComponent(dish1);
        catagory1.addComponent(dish3);

        Catagory catagory2 = new Catagory("Main Course");
        catagory2.addComponent(dish2);

        Catagory catagory3 = new Catagory("Coffee");
        catagory3.addComponent(dish4);
        catagory3.addComponent(dish5);
        catagory3.addComponent(dish6);

        Catagory sub = new Catagory("Morning Sub Category: ");
        sub.addComponent(catagory3);
        sub.addComponent(catagory1);

        Catagory rootCatagory = new Catagory("Menu: ");
        rootCatagory.addComponent(sub);
        rootCatagory.addComponent(catagory1);
        rootCatagory.addComponent(catagory2);


        rootCatagory.displayDetails();
    }
}
