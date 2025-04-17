package PhoneBook2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/PhoneBook";
        String user = "postgres";
        String password = ReaderInitiate.Initiate();
        try{
            Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("connected to database");

            System.out.println("Please choose a command:");
            System.out.println("1. Search in contacts");
            System.out.println("2. Add a new contact");
            System.out.println("3. Delete a contact");
            System.out.println("4. Edit a contact");
            System.out.println("5. See all contacts");

            String command = scanner.next();

            switch (command){
                case "1":
                    SearchContact.search(connection);
                    break;
                case "2":
                    AddContact.add(connection);
                    break;
                case "3":
                    DeleteContact.delete(connection);
                    break;
                case "4":
                    EditContact.edit(connection);
                    break;
                case "5":
                    SeeAll.see(connection);
                default:
                    System.out.println("Please input a valid command.");
                    break;
            }
        }   catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
