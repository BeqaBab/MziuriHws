package HW1130;

public class HealthCare implements Insurance{
    int age;
    int salary;
    boolean abroadPackage;
    HealthCare(int age, int salary, boolean abroadPackage){
        this.age=age;
        this.salary=salary;
        this.abroadPackage=abroadPackage;
    }
    double price= (double) salary /age;

    @Override
    public void packageInfo() {
        if(abroadPackage){
            price*=1.2;
        }
        System.out.println(Insurance.name + " person's age: " + age + " person's salary: " + salary + " insurance price: " + price );
    }
}
