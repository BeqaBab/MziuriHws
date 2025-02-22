package HW1229;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            Student student = new Student("A", "B", random.nextInt(0,100), random.nextInt(60000000, 70000000));
            students.add(student);
        }
        BubbleSort.bubbleSort(students);
        for (Student student : students) {
            System.out.println("A B " + student.getSocialSecurity() + " " + student.getAverageScore());
        }
    }
}

class BubbleSort{
    public static void bubbleSort(ArrayList<Student> students){
        int n = students.size();
        Student temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (students.get(j - 1).getAverageScore() < students.get(j).getAverageScore()) {
                    temp = students.get(j - 1);
                    students.set(j - 1, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }
}

class Student{
    final String firstName;
    final String lastName;
    private final int socialSecurity;
    private final int averageScore;

    public Student(String firstName, String lastName, int averageScore, int socialSecurity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageScore = averageScore;
        this.socialSecurity = socialSecurity;
    }

    public int getSocialSecurity() {
        return socialSecurity;
    }

    public int getAverageScore() {
        return averageScore;
    }
}