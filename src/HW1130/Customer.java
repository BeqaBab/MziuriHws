package HW1130;

import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    String fName;
    String lName;
    int age;
    int socialSecurity;
    Customer(String fName, String lName, int age, int socialSecurity){
        this.fName=fName;
        this.lName=lName;
        this.age=age;
        this.socialSecurity=socialSecurity;
    }

    void Register(){
        System.out.println("Select one of the options: ");
        System.out.println("[1] AutoInsurance");
        System.out.println("[2] HealthCare");
        System.out.println("[3] TravelInsurance");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Input your car's age and initial price");
                AutoInsurance autoInsurance = new AutoInsurance(scanner.nextInt(), scanner.nextInt());
                autoInsurance.packageInfo();
                break;
            case 2:
                System.out.println("Input your salary and whether or not you'd like an abroad package");
                HealthCare healthCare = new HealthCare(age, scanner.nextInt(), scanner.nextBoolean());
                healthCare.packageInfo();
                break;
            case 3:
                System.out.println("Input your how many days you'll spend abroad, how many people are you insuring and whether or not you want your package to be insured");
                TravelInsurance travelInsurance = new TravelInsurance(scanner.nextInt(), scanner.nextInt(), scanner.nextBoolean());
                travelInsurance.packageInfo();
                break;
            default:
                System.out.println("You have entered the wrong number");
        }
    }
}
