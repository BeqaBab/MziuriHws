package HW0416;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EditInformation {
    public static void edit(Connection connection){
        try{
            System.out.println("Please input new title, author_id, published_year, genre, publisher_id, category_id existing old book_id:");
            Scanner scanner = new Scanner(System.in);

            String selectQuery = "UPDATE books SET title = ?, SET author_id = ?, SET published_year = ?, SET genre = ?, SET publisher_id = ?, SET category_id = ? WHERE book_id = ?";
            PreparedStatement stmt = connection.prepareStatement(selectQuery);

            String title = scanner.nextLine();
            int author_id = scanner.nextInt();
            int published_year = scanner.nextInt();
            String genre = scanner.next();
            int publisher_id = scanner.nextInt();
            int category_id = scanner.nextInt();
            int book_id = scanner.nextInt();

            stmt.setString(1, title);
            stmt.setInt(2, author_id);
            stmt.setInt(3, published_year);
            stmt.setString(4, genre);
            stmt.setInt(5, publisher_id);
            stmt.setInt(6, category_id);
            stmt.setInt(7, book_id);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Book updated successfully!");
            } else {
                System.out.println("No book found with the given ID.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
