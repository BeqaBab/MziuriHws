package HW0129;

import java.util.Comparator;

public class SortMiles implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.miles, o2.miles);
    }
}
