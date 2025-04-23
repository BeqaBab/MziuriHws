package CW0115;

public class Car extends Transportation{
    int doors;
    Car(String name, int mileage, int doors) {
        super(name, mileage);
        this.doors = doors;
    }

    void WheelChange(){
        System.out.println(name + " needs to have wheels changed.");
    }

    void Mileage(){
        System.out.println(super.getMileage());
    }
}
