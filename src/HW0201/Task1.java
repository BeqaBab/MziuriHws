package HW0201;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(); //sc -> shoppingCart
        shoppingCart.add(new Product("Laptop", 1200.50));
        shoppingCart.add(new Product("Phone", 800.75));
        shoppingCart.add(new Product("Mouse", 25.99));
        shoppingCart.display();
    }
}