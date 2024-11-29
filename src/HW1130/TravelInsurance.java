package HW1130;

public class TravelInsurance implements Insurance{
    int days;
    int users;
    boolean isPackageInsured;
    TravelInsurance(int days, int users, boolean isPackageInsured){
        this.days=days;
        this.users=users;
        this.isPackageInsured=isPackageInsured;
    }
    double price = days * users * 1000;
    @Override
    public void packageInfo() {
        if(isPackageInsured){
            price*=1.1;
        }
        System.out.println(Insurance.name + " travel days: " + days + " travel users: " + users + " insurance price: " + price );
    }
}
