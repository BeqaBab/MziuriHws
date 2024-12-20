package HW1222;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Task2 {
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\beqab\\MziuriHws\\src\\HW1222\\Student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student[] students = new Student[5];
        int mx = 0; int mxIndex = -1;
        for(int i=0; i<students.length; i++){
            students[i] = (Student) objectInputStream.readObject();
            if(mx < students[i].getGrade()){
                mx = students[i].getGrade();
                mxIndex = i;
            }
        }
        System.out.println(students[mxIndex].getId() + " " + students[mxIndex].getName() + " " + students[mxIndex].getGrade());
    }
}
