package PhoneBook2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EditContact {
    public static void edit(Connection connection){
        try{
            System.out.println("Please input contact_first_name, contact_last_name, contact_number and old category_id:");
            Scanner scanner = new Scanner(System.in);
            String editQuery = "UPDATE contacts SET contact_first_name = ?, SET contact_last_name = ?, SET contact_number = ? WHERE contact_id = ?";
            PreparedStatement stmt = connection.prepareStatement(editQuery);
            stmt.setString(1, scanner.next());
            stmt.setString(2, scanner.next());
            stmt.setString(3, scanner.next());
            stmt.setInt(4, scanner.nextInt());
            stmt.executeUpdate();
            scanner.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
