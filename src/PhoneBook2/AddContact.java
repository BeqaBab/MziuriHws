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
            PreparedStatement stmt = connection.prepareStatement(insertQuery);
            stmt.setString(1, scanner.next());
            stmt.setString(2, scanner.next());
            stmt.setString(3, scanner.next());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
