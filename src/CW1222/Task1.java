package CW1222;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string:");
        String s = scanner.next();
        boolean isPalindrome = true;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("This is a palindrome.");
        }   else System.out.println("This is not a palindrome.");
    }
}
