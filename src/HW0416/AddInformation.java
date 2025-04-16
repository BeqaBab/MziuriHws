package HW0416;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddInformation {
    public static void add(Connection connection){
        try{
            System.out.println("Please input title, author_id, published_year, genre, publisher_id and category_id:");
            Scanner scanner = new Scanner(System.in);
            String selectQuery = "INSERT INTO books(title, author_id, published_year, genre, publisher_id, category_id) VALUES(?, ?, ?, ?, ?, ?);";
            PreparedStatement stmt = connection.prepareStatement(selectQuery);
            stmt.setString(1, scanner.nextLine());
            stmt.setInt(2, scanner.nextInt());
            stmt.setInt(3, scanner.nextInt());
            stmt.setString(4, scanner.nextLine());
            stmt.setInt(5, scanner.nextInt());
            stmt.setInt(6, scanner.nextInt());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
