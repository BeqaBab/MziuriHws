package HW0129;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    int year;
    int month;
    int date;
    private ArrayList <Integer> grades;

    public Student(String firstName, String lastName, int year, int month, int date) {
        this.date = date;
        this.month = month;
        this.year = year;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    int averageGrade(){
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }   return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", date=" + date +
                ", grades=" + grades +
                ", average grade=" + averageGrade() +
                '}';
    }
}
