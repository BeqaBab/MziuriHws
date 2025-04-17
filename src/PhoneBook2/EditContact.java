package PhoneBook2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EditContact {
    public static void edit(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter new contact_first_name, new contact_last_name, new contact_number and contact_id:");
            String editQuery = "UPDATE contacts SET contact_first_name = ?, contact_last_name = ?, contact_number = ? WHERE contact_id = ?";
            PreparedStatement stmt = connection.prepareStatement(editQuery);

            String firstName = scanner.next();
            String lastName = scanner.next();
            String contactNumber = scanner.next();
            int contactId = scanner.nextInt();

            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, contactNumber);
            stmt.setInt(4, contactId);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Contact updated successfully!");
            } else {
                System.out.println("No contact found with the given ID.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}