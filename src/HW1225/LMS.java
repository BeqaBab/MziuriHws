package HW1225;

import java.io.Serializable;
import java.util.ArrayList;

public class LMS implements Serializable {
    ArrayList books = new ArrayList<Book>();
    public static final long serialVersionUID = 1234;
    public void addBook(Book b) {
        books.add(books.size(), b);
        b.isAvailable = true;
        System.out.println("The book has been added.");
    }

    public void removeBook(Book b) {
        boolean isHere = false;
        for(Object a:books){
            Book book = (Book) a;
            if(book.name.equals(b.name) && book.author.equals(b.author) && book.id==b.id){
                isHere = true;
                books.remove(book);
                book.isAvailable = false;
                break;
            }
        }
        if(!isHere){
            System.out.println("This book is already unavailable.");
        }else System.out.println("The book has been removed.");
    }
    public void Info(){
        for(Object a:books){
            System.out.println(a.toString());
        }
    }
}
