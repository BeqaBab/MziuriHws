package PhoneBook2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteContact {
    public static void delete(Connection connection){
        try{
            System.out.println("Please input contact_id:");
            Scanner scanner = new Scanner(System.in);
            int contact_id = scanner.nextInt();
            String deleteQuery = "DELETE FROM contacts WHERE contact_id = ?;";
            PreparedStatement stmt = connection.prepareStatement(deleteQuery);
            stmt.setInt(1, contact_id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
