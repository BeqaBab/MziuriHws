package HW1130;

public class AutoInsurance implements Insurance{
    int carAge;
    int carPrice;
    AutoInsurance(int carAge, int carPrice){
        this.carAge=carAge;
        this.carPrice=carPrice;
    }
    @Override
    public void packageInfo() {
        System.out.println(Insurance.name + " car's age: " + carAge + " car's price: " + carPrice + " insurance price: " + carPrice/carAge);
    }
}
