package CW0205;

import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        int maxIndex = 0;
        String maxString = new String();
        for(int i = 0; i < 10; i++){
            String string = scanner.next();
            if(hashMap.containsKey(string)){
                hashMap.replace(string, hashMap.get(string) + 1);
            }   else hashMap.put(string, 1);
            if(hashMap.get(string) > maxIndex){
                maxString = string;
                maxIndex = hashMap.get(string);
            }
        }
        System.out.println(maxString);
    }
}
