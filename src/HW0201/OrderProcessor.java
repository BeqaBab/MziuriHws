package HW0201;

public class OrderProcessor {
    public static void processOrder(String customerName, String address, String product, int quantity) {
        //რადგანაც ამ ერთი მეთოდის გარდა არაფერი აქვს კლასს, გადავაკეთოთ ეს მეთოდი სტატიკურად, რათა არ მოგვიწიოს ობიქტის შექმნა
        double price;
        //if - ები გადავაკეთოთ switch - ად
        switch (product){
            case "Laptop":
                price = 1000.0;
                break;
            case "Phone":
                price = 500.0;
                break;
            case "Tablet":
                price = 300.0;
                break;
            default:
                price = 0.0;
                break;
        }
        double total = price * quantity;
        double discount;
        discount = total > 2000 ? total * 0.05 : 0; // გამოვიყენოთ ტერნარული if
        discount = total > 5000 ? total * 0.1 : discount;
        total -= discount;
        System.out.println("Order Summary:");
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price after Discount: $" + total);
    }
}