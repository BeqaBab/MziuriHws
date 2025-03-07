package Project0122;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("What would you like to do?");
        System.out.println("1. See all your contacts");
        System.out.println("2. Add a new contact");
        System.out.println("3. Delete an old contact");
        System.out.println("4. Change a contact with its name");
        System.out.println("5. Find a contact");
        Data data = new Data();
        data.ReadContacts();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println(data.GetInfo());
                break;
            case 2:
                data.AddContact();
                break;
            case 3:
                data.DeleteContact();
                break;
            case 4:
                data.ChangeContact();
                break;
            case 5:
                data.FindContact();
                break;
            default:
                System.out.println("Please input a valid command.");
                break;
        }
        data.SaveContacts();
    }
}
