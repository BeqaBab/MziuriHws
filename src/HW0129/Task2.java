package HW0129;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList <Student> students = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            Student student = new Student((char)random.nextInt(80, 130) + "", (char)random.nextInt(80, 130) + "", random.nextInt(1900,2025), random.nextInt(1,12), random.nextInt(1,31));
            ArrayList <Integer> arrayList = new ArrayList<>();
            arrayList.add(random.nextInt(1,100));
            arrayList.add(random.nextInt(1,100));
            arrayList.add(random.nextInt(1,100));
            arrayList.add(random.nextInt(1,100));
            arrayList.add(random.nextInt(1,100));
            student.setGrades(arrayList);
            students.add(student);
        }

        System.out.println(students);
        Collections.sort(students, new SortLexicography());
        System.out.println(students);
        Collections.sort(students, new SortAverageScore());
        System.out.println(students);
        Collections.sort(students, new SortDates());
        System.out.println(students);
    }
}
