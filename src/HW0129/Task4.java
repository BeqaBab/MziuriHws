package HW0129;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IncorrectIdException {
        Corporation corporation = new Corporation();
        corporation.creation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1. Learn about us");
        System.out.println("2. Receive contact information");
        System.out.println("3. Total costs");
        String choice = scanner.next();
        switch (choice){
            case "1":
                System.out.println(corporation.AboutUs());
                break;
            case "2":
                System.out.println(corporation.contactInfo(scanner.next()));
                break;
            case "3":
                System.out.println("The total cost for operating are " + corporation.totalCost());
                break;
            default:
                System.out.println("Please input a valid command.");
        }
    }
}
