package HW1225Ver2;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        LMS lms = new LMS();
        File file = new File("C:\\Users\\beqab\\MziuriHws\\src\\HW1225Ver2\\LMS.txt");
        if(file.length() > 0){
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\beqab\\MziuriHws\\src\\HW1225Ver2\\LMS.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            lms = (LMS) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }

        lms.Info();
        System.out.println("What would you like to do:");
        System.out.println("1. Add a book");
        System.out.println("2. Take a book");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("Input the book's name, author and id:");
                lms.addBook(new Book(scanner.next(), scanner.next(), scanner.nextInt()));
                break;
            case 2:
                System.out.println("Input the book's name, author and id:");
                lms.removeBook(new Book(scanner.next(), scanner.next(), scanner.nextInt()));
                break;
            default:
                System.out.println("Please input a valid command");
        }
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\beqab\\MziuriHws\\src\\HW1225Ver2\\LMS.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(lms);
        fileOutputStream.close();
        objectOutputStream.close();
    }
}

