package HW1222;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Student[] students = new Student[5];
        int[] grade = {15, 56, 64, 89, 23};
        String[] name = {"George", "Nina", "Bartek", "Anton", "Maja"};
        int[] id = {14251, 52621, 52415, 42521, 52666};
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\beqab\\MziuriHws\\src\\HW1222\\Student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for(int i=0; i<students.length; i++){
            Student student = new Student(id[i], name[i], grade[i]);
            students[i] = student;
            objectOutputStream.writeObject(students[i]);
        }
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
