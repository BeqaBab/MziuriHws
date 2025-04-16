package PhoneBook2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeeAll {
    public static void see(Connection connection){
        try {
            String searchQuery = "SELECT * FROM contacts;";
            PreparedStatement stmt = connection.prepareStatement(searchQuery);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("contact_id");
                String contact_first_name = rs.getString("contact_first_name");
                String contact_last_name = rs.getString("contact_last_name");
                String contact_number = rs.getString("contact_number");

                System.out.println(id);
                System.out.println(contact_first_name);
                System.out.println(contact_last_name);
                System.out.println(contact_number);
            }
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
