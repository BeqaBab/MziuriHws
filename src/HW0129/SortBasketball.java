package HW0129;

import java.util.Comparator;

public class SortBasketball implements Comparator<Basketball> {
    @Override
    public int compare(Basketball o1, Basketball o2) {
        return Double.compare(o1.calculateScore(), o2.calculateScore());
    }
}
