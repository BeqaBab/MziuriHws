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

            String title = scanner.nextLine();
            int author_id = scanner.nextInt();
            int published_year = scanner.nextInt();
            String genre = scanner.next();
            int publisher_id = scanner.nextInt();
            int category_id = scanner.nextInt();

            stmt.setString(1, title);
            stmt.setInt(2, author_id);
            stmt.setInt(3, published_year);
            stmt.setString(4, genre);
            stmt.setInt(5, publisher_id);
            stmt.setInt(6, category_id);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Book added successfully!");
            } else {
                System.out.println("Book couldn't be added.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
