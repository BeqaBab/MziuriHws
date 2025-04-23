package CW0202;

import java.util.ArrayList;

public class StudentFirst implements Comparable<StudentFirst>{
    String firstName;
    String lastName;
    int age;

    public StudentFirst(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(StudentFirst studentFirst) {
        return Integer.compare(this.age, studentFirst.age);
    }

    public static void sort(ArrayList <StudentFirst> arrayList){
        for(int i = 0; i < arrayList.size(); i++){
            for(int j = i + 1; j < arrayList.size(); j++){
                StudentFirst studentFirst = arrayList.get(i);
                if(arrayList.get(i).compareTo(arrayList.get(j)) > 0){
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, studentFirst);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "StudentFirst{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
