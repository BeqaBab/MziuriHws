package HW1229;

import java.util.ArrayList;
import java.util.Random;

public class Task4 {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(int i = 0; i < random.nextInt(1, 100000); i++){
            arr1.add(random.nextInt(0, 1000));
        }
        for(int i = 0; i < random.nextInt(1, 100000); i++){
            arr2.add(random.nextInt(0, 1000));
        }
        for(int i = 0; i < random.nextInt(1, 100000); i++){
            arr3.add(random.nextInt(0, 1000));
        }
        for (int integer : arr1) {
            if (arr2.contains(integer) && arr3.contains(integer)) {
                System.out.print(integer + " ");
            }
        }
    }
}