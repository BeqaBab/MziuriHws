package PhoneBook2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddContact {
    public static void add(Connection connection){
        try{
            System.out.println("Please input contact_first_name, contact_last_name and contact_number:");
            Scanner scanner = new Scanner(System.in);
            String insertQuery = "INSERT INTO contacts(contact_first_name, contact_last_name, contact_number) VALUES(?, ?, ?);";

            String firstName = scanner.next();
            String lastName = scanner.next();
            String contactNumber = scanner.next();

            PreparedStatement stmt = connection.prepareStatement(insertQuery);

            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, contactNumber);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Contact added successfully!");
            } else {
                System.out.println("Contact couldn't be added.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
