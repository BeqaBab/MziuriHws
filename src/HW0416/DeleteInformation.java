package HW0416;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteInformation {
    public static void delete(Connection connection){
        try{
            System.out.println("Please input book_id:");
            Scanner scanner = new Scanner(System.in);
            int book_id = scanner.nextInt();
            String selectQuery = "DELETE FROM books where book_id = ?;";
            PreparedStatement stmt = connection.prepareStatement(selectQuery);
            stmt.setInt(1, book_id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
