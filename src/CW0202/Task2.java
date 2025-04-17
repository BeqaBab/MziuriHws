package CW0202;

import java.util.ArrayList;
import java.util.Comparator;

public class Task2 {
    public static void main(String[] args){
        ArrayList <StudentSecond> studentSecondArrayList = new ArrayList<>();
        studentSecondArrayList.add(new StudentSecond("A", "A", 16));
        studentSecondArrayList.add(new StudentSecond("B", "B", 40));
        studentSecondArrayList.add(new StudentSecond("C", "C", 23));
        studentSecondArrayList.add(new StudentSecond("D", "D", 55));
        studentSecondArrayList.add(new StudentSecond("E", "E", 14));

        studentSecondArrayList.sort(new Comparator<StudentSecond>() {
            @Override
            public int compare(StudentSecond o1, StudentSecond o2) {
                return Integer.compare(o1.age, o2.age);
            }
        });

        System.out.println(studentSecondArrayList);
    }
}
