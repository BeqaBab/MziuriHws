package CW0205;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int cnt = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == string.charAt(0)) cnt ++;
        }
        System.out.println(string.charAt(0) + "=" + cnt);
        for(int i = 1 ; i < string.length(); i++){
            int cnt1 = 0;
            boolean wasBefore = false;
            for(int j = 0 ; j < string.length(); j++){
                if(string.charAt(i) == string.charAt(j)){
                    if(j < i){
                        wasBefore = true;
                        break;
                    }
                    else cnt1++;
                }
            }
            if(!wasBefore) System.out.println((char) string.charAt(i) + "=" + cnt1);
        }
    }
}
