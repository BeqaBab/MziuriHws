package CW1222;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the array's size and its elements: ");
        int[] arr = new int[scanner.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        boolean[] used = new boolean[arr[arr.length-1]];
        ArrayList arrayList = MakeSet.makeSet(arr);
        for(Object a:arrayList){
            System.out.print(a + " ");
        }
    }
}
