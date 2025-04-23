package HW0205;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return -1 * (o1.firstName + o1.lastName ).compareTo(o2.firstName + o2.lastName);
    }
}
