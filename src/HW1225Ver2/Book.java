package HW1225Ver2;

import java.io.Serializable;

public class Book implements Serializable {
    final String name;
    final String author;
    int id;
    final static long serialVersionUID = 1L;
    boolean isAvailable;
    public Book(String name, String author, int id) {
        this.name = name;
        this.id = id;
        this.author = author;
    }
}