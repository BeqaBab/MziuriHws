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
            stmt.setString(1, scanner.nextLine());
            stmt.setInt(2, scanner.nextInt());
            stmt.setInt(3, scanner.nextInt());
            stmt.setString(4, scanner.nextLine());
            stmt.setInt(5, scanner.nextInt());
            stmt.setInt(6, scanner.nextInt());
            stmt.setInt(7, scanner.nextInt());
            stmt.executeUpdate();
            scanner.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
