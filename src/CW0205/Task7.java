package CW0205;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int lastSpace = 0;
        for(int i = 0 ; i < string.length(); i++){
            if(string.charAt(i) == ' ') lastSpace = i;
        }
        System.out.println(string.length() - lastSpace - 1);
    }
}
