package HW0129;

import java.util.Comparator;

public class SortAverageScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.averageGrade(), o2.averageGrade());
    }
}
