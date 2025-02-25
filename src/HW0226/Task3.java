package HW0226;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

class Product{
    Random random = new Random();
    StringBuilder name;
    int price;
    Product(){
        this.name = Randomizer.randomizer();
        this.price = random.nextInt(100000);
    }
    @Override
    public String toString() {
        return "Product{"  +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}

public class Task3 {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            products.add(new Product());
        }

        System.out.println("Products over 20 dollars:");
        List<Product> newProducts = products.stream().filter(product -> product.price > 20).toList();
        System.out.println(newProducts);
        System.out.println();

        System.out.println("Only names:");
        Map <Integer, StringBuilder> onlyNames = newProducts.stream().collect(Collectors.toMap(i -> i.price, i -> i.name));
        System.out.println(onlyNames);
        System.out.println();

        System.out.println("The sum of the prices:");
        int sum = newProducts.stream().mapToInt(product -> product.price).sum();
        System.out.println(sum);
        System.out.println();
    }
}
