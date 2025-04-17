package HW1130;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        City[] cities = new City[4];
        cities[0].area = 14; cities[0].name="Kutaisi"; cities[0].population=1255252525;
        cities[1].area = 98; cities[1].name="Tbilisi"; cities[1].population=56241245;
        cities[2].area = 24; cities[2].name="Rustavi"; cities[2].population=1245126;
        cities[3].area = 55; cities[3].name="Poti"; cities[3].population=1515626;
        Country country = new Country("Saqartvelo", "Tbilisi", cities);
        System.out.println(country.area());
        System.out.println(country.population());


        Doctor[] doctors = new Doctor[scanner.nextInt()];
        for(int i=0; i< doctors.length; i++){
            Doctor doctor = new Doctor(scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.next(), scanner.nextInt());
            doctors[i]=doctor;
        }
        BubbleSortAge.bubbleSort(doctors);
        doctors[0].Info();
        BubbleSortExperience.bubbleSort(doctors);
        doctors[0].Info();


        Customer customer = new Customer(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
        customer.Register();


        Country2[] country2 = new Country2[scanner.nextInt()];
        Country2.River[] rivers = new Country2.River[country2.length];
        for(int i=0; i<country2.length; i++){
            Country2 c = new Country2(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt());
            Country2.River e = c.new River(scanner.next(), scanner.nextInt());
            country2[i]=c;
            rivers[i]=e;
        }
        BubbleSortRiver.bubbleSort(country2,rivers);
        for(int i=0; i<country2.length; i++){
            country2[i].getInfo();
            rivers[i].getInfo();
        }
    }
}
