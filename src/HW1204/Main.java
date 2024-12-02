package HW1204;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Input your string: ");
        String s = new String(scanner.next());
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                cnt++;
            }
        }
        System.out.println("The amount of numbers is " + cnt);


        System.out.println("Input your string: ");
        String s1 = new String(scanner.next());
        int cnt1=0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == '!' || s1.charAt(i) == '?' || s1.charAt(i) == ';' || s1.charAt(i) == '.'){
                cnt1++;
            }
        }
        System.out.println("The amount of sentences is " + cnt1);


        System.out.println("Input your string: ");
        String s2 = new String(scanner.next());
        boolean isPalindrome = true;
        for(int i=0; i<s2.length(); i++){
            if(s2.charAt(i) != s2.charAt(s2.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("This string is a palindrome");
        }   else System.out.println("This string is not a palindrome");


        System.out.println("Input your strings: ");
        String s01 = new String(scanner.next());
        String s02 = new String(scanner.next());
        boolean hasTheString = false;
        for(int i=0; i<s01.length()-s02.length(); i++){
            if (s01.substring(i, i + s02.length()).equals(s02)) {
                hasTheString = true;
                break;
            }
        }
        if(hasTheString){
            System.out.println("The second string is a substring of the first one.");
        }   else System.out.println("The second string is not a substring of the first one.");


        System.out.println("Input your string: ");
        String sWord = new String(scanner.next());
        sWord = sWord.toLowerCase();
        if(sWord.charAt(sWord.length()-1) < 'a' || sWord.charAt(sWord.length()-1) > 'z'){
            System.out.println("This word doesn't end with a letter.");
        }   else if(sWord.charAt(sWord.length()-1) == 'a' || sWord.charAt(sWord.length()-1) == 'o' || sWord.charAt(sWord.length()-1) == 'i' || sWord.charAt(sWord.length()-1) == 'u' || sWord.charAt(sWord.length()-1) == 'y' || sWord.charAt(sWord.length()-1) == 'e'){
            System.out.println("This word ends with a vowel.");
        }   else System.out.println("This word doesn't ends with a vowel.");


        System.out.println("Input your string: ");
        String s3 = new String(scanner.next());
        for(int i=0;  i<s3.length(); i+=2){
            System.out.print(s3.charAt(i));
        }


        System.out.println("Input your string: ");
        String s4 = new String(scanner.next());
        if(s4.length() < 10){
            System.out.println("This word isn't huge.");
        }   else {
            System.out.println("This word is huge and its abbreviation would be:");
            System.out.print(s4.charAt(0));
            System.out.print(s4.length());
            System.out.println(s4.charAt(s4.length()-1));
        }

    }
}
