package CW0115;

public class Boat extends Transportation{
    int engines;
    Boat(String name, int mileage, int engines) {
        super(name, mileage);
        this.engines = engines;
    }

    void Stopped(){
        System.out.println(name + " is stopped with the other ships.");
    }

    void Swim(){
        System.out.println(name + " is swimming.");
    }
}
