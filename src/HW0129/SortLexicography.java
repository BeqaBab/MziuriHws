package HW0129;

import java.util.Comparator;

public class SortLexicography implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.firstName + o1.lastName ).compareTo(o2.firstName + o2.lastName);
    }
}
