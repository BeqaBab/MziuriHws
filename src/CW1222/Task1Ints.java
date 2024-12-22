package CW1222;

import java.util.Scanner;

public class Task1Ints {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number:");
        int a = scanner.nextInt();
        int b = a;
        int cnt = 1;
        do{
            cnt++;
            b/=10;
        }
        while(b != 1);
        boolean isPalindrome = true;
        int l=1, r = cnt;
        while(l <= r){
            int x = PowerOfTen.powerOfTen(l) * 10;
            int y = PowerOfTen.powerOfTen(r);
            if((a % x) / (x / 10) != (a / y) % 10){
                isPalindrome = false;
                break;
            }
            else{
                l++;
                r--;
            }
        }
        if(isPalindrome){
            System.out.println("This is a palindrome.");
        }   else System.out.println("This is not a palindrome.");
    }
}

class PowerOfTen {
    public static int powerOfTen(int n){
        if(n == 1) return 1;
        return 10 * powerOfTen(n-1);
    }
}