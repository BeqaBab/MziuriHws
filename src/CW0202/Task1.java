package CW0202;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args){
        ArrayList <StudentFirst> studentFirstArrayList = new ArrayList<>();
        studentFirstArrayList.add(new StudentFirst("A", "A", 16));
        studentFirstArrayList.add(new StudentFirst("B", "B", 40));
        studentFirstArrayList.add(new StudentFirst("C", "C", 23));
        studentFirstArrayList.add(new StudentFirst("D", "D", 55));
        studentFirstArrayList.add(new StudentFirst("E", "E", 14));
        StudentFirst.sort(studentFirstArrayList);
        System.out.println(studentFirstArrayList);
    }
}
