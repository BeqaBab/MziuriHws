package HW0201;

import java.util.ArrayList;

public class ShoppingCart { // public გავხადე
    ArrayList<Product> list = new ArrayList<>(); // ბარემ პირდაპირ Arraylist შევქმნათ

    public void add(Product p) {
        list.add(p);
    }

    public double calculate() {
        double total = 0; // t -> total
        for (Product product : list) {
            total += product.price;
        }
        return total;
    }

    public void display() {
        System.out.println("Items:");
        for (Product product : list) {
            System.out.println(product.name + " - $" + product.price);
        }
        System.out.println("Total: $" + calculate()); // $ დავამატე
    }
}