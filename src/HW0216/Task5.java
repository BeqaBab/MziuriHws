package HW0216;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       if(scanner.nextInt() == 1){
           System.out.println(intToString(scanner.nextInt()));
       }    else{
           System.out.println(evenOrOdd(scanner.nextInt()));
       }
    }
    static String intToString(int a){
        return "Your number is " + a + ".";
    }
    static String evenOrOdd(int a){
        if(a % 2 == 0)  return "This number is even.";
        return "This number is odd.";
    }
}
