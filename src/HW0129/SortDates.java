package HW0129;

import java.util.Comparator;

public class SortDates implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.year != o2.year)  return Integer.compare(o1.year, o2.year);
        else if(o1.month != o2.month)   return Integer.compare(o1.month,o2.month);
        return Integer.compare(o1.date, o2.date);
    }
}
