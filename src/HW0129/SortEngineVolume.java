package HW0129;

import java.util.Comparator;

public class SortEngineVolume implements Comparator<Car.Engine> {
    @Override
    public int compare(Car.Engine o1, Car.Engine o2) {
        return Integer.compare(o1.volume,o2.volume);
    }
}
