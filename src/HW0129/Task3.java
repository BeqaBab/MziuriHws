package HW0129;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList <Car> cars = new ArrayList<>();
        ArrayList <Car.Engine> carEngine = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            Car car = new Car((char)random.nextInt(80, 150) + "", (char)random.nextInt(80, 150) + "", random.nextInt(1950, 2025), random.nextInt());
            Car.Engine engine = car.new Engine((char)random.nextInt(80, 150) + "", random.nextInt(), random.nextInt());
            cars.add(car);
            carEngine.add(engine);
        }
        System.out.println(cars);
        Collections.sort(cars, new SortProductionYear());
        System.out.println(cars);
        Collections.sort(cars, new SortMiles());
        System.out.println(cars);
        Collections.sort(carEngine, new SortEngineVolume());
        System.out.println(carEngine);
    }
}
