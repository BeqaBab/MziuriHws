package CW0205;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        ArrayList <Integer> integerArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            integerArrayList.add(scanner.nextInt());
        }
        HashSet <Integer> integerHashSet = new HashSet<>();
        for (Integer integer : integerArrayList) {
            integerHashSet.add(integer);
        }
        System.out.println(integerHashSet);
    }
}
