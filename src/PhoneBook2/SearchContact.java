package PhoneBook2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchContact {
    public static void search(Connection connection){
        try{
            System.out.println("Please input contact_id:");
            Scanner scanner = new Scanner(System.in);
            int contact_id = scanner.nextInt();
            String searchQuery = "SELECT * FROM contacts WHERE contact_id = ?;";
            PreparedStatement stmt = connection.prepareStatement(searchQuery);
            stmt.setInt(1, contact_id);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("contact_id");
                String contact_first_name = rs.getString("contact_first_name");
                String contact_last_name = rs.getString("contact_last_name");
                String contact_number = rs.getString("contact_number");

                System.out.println("contact_id: " + id);
                System.out.println("contact_first_name: " + contact_first_name);
                System.out.println("contact_last_name: " + contact_last_name);
                System.out.println("contact_number: " + contact_number);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
