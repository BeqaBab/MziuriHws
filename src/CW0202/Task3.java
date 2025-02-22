package CW0202;

import java.util.ArrayList;
import java.util.Comparator;

public class Task3 {
    public static void main(String[] args){
        ArrayList <Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell", 19.50));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 15.50));
        books.add(new Book("Zebuloni", "Jemal Qarchxadze", 17.80));
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.author.toLowerCase().compareTo(o2.author.toLowerCase());
            }
        });
        System.out.println(books);

        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o1.price, o2.price);
            }
        });
        System.out.println(books);
    }
}
