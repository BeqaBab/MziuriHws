package CW0205;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        boolean wasPrinted = false;
        for(int i = 0; i < string.length(); i++){
            boolean wasFound = false;
            for(int j = 0; j < string.length(); j++){
                if(string.charAt(i) == string.charAt(j) && i != j){
                    wasFound = true;
                    break;
                }
            }
            if(!wasFound){
                System.out.println(string.charAt(i));
                wasPrinted = true;
                break;
            }
        }
        if(!wasPrinted) System.out.println("There are no such elements.");
    }
}
