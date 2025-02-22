package CW0115;

public class Main {
    public static void main(String[] args){
        Transportation transportation = new Transportation("A", 125000);
        transportation.setId(12341);
        System.out.println(transportation.getId());
        transportation.Go();
        transportation.OilChange();
        
        Car car = new Car("B", 100000, 4);
        car.WheelChange();
        car.Go();
        car.OilChange();
        car.Mileage();

        Boat boat = new Boat("C", 80000, 2);
        boat.Stopped();
        boat.Swim();
        boat.Go();
        boat.OilChange();
    }
}
