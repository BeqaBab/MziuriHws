package HW0416;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadInformation {
    public static void Read(Connection connection){
        try{
            System.out.println("Please input book_id:");
            Scanner scanner = new Scanner(System.in);
            int book_id = scanner.nextInt();
            String selectQuery = "SELECT * FROM books WHERE book_id = ?;";
            PreparedStatement stmt = connection.prepareStatement(selectQuery);
            stmt.setInt(1, book_id);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("book_id");
                String title = rs.getString("title");
                String author_id = rs.getString("author_id");
                String published_year = rs.getString("published_year");
                String genre = rs.getString("genre");
                String publisher_id = rs.getString("publisher_id");
                String category_id = rs.getString("category_id");

                System.out.println(id);
                System.out.println(title);
                System.out.println(author_id);
                System.out.println(published_year);
                System.out.println(genre);
                System.out.println(publisher_id);
                System.out.println(category_id);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
