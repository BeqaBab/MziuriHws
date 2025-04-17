package HW0129;

public class Car {
    String make;
    String model;
    int productionYear;
    int miles;

    public Car(String make, String model, int productionYear, int miles) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.miles = miles;
    }

    public class Engine{
        String fuelType;
        int cylinders;
        int volume;

        public Engine(String fuelType, int cylinders, int volume) {
            this.fuelType = fuelType;
            this.cylinders = cylinders;
            this.volume = volume;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "fuelType='" + fuelType + '\'' +
                    ", cylinders=" + cylinders +
                    ", volume=" + volume +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", miles=" + miles +
                '}';
    }
}
