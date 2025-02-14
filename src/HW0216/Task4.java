package HW0216;

import java.util.Scanner;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Predicate<Integer> isPrime = number ->{
            if(number == 1) return false;
            if(number == 2) return true;
            for(int i = 2; i < number - 1; i++){
                if(number % i == 0) return false;
            }
            return true;
        };
        if(isPrime.test(scanner.nextInt())){
            System.out.println("This number is prime.");
        }else System.out.println("This number is not prime.");
    }
}
