package HW0416;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/LibraryManagementSystem";
        String user = "postgres";
        String password = ReaderInitiate.Initiate();
        try{
            Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("connected to database");

            System.out.println("Please choose a command:");
            System.out.println("1. Read from books");
            System.out.println("2. Add new information into books");
            System.out.println("3. Delete information from books");
            System.out.println("4. Edit information in books");

            String command = scanner.next();

            switch (command){
                case "1":
                    ReadInformation.Read(connection);
                    break;
                case "2":
                    AddInformation.add(connection);
                    break;
                case "3":
                    DeleteInformation.delete(connection);
                    break;
                case "4":
                    EditInformation.edit(connection);
                    break;
                default:
                    System.out.println("Please input a valid command.");
                    break;
            }
        }   catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
