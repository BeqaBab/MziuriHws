package HW0226;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    Random random = new Random();
    StringBuilder name;
    int grade;
    Student(){
        this.name = Randomizer.randomizer();
        this.grade = random.nextInt(100);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

class sortByGrades implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.grade, o2.grade);
    }
}

public class Task4 {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < 15; i++){
            students.add(new Student());
        }

        System.out.println("Only the students with the grade above 70:");
        List<Student> newStudents = students.stream().filter(student -> student.grade > 70).toList();
        System.out.println(newStudents);
        System.out.println();

        System.out.println("Students mapped:");
        Map<StringBuilder, Integer> newStudentMaps = newStudents.stream().collect(Collectors.toMap(i -> i.name, i -> i.grade));
        System.out.println(newStudentMaps);
        System.out.println();

        System.out.println("Mapped students sorted:");
        List<Student> tempStudents = newStudents.stream().sorted(new sortByGrades()).toList();
        Map<StringBuilder, Integer> newStudentMapsSorted = tempStudents.stream().collect(Collectors.toMap(i -> i.name, i -> i.grade));
        System.out.println(newStudentMapsSorted);
    }
}
