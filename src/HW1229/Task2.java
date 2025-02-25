package HW1229;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        Random random = new Random();
        int[] a = {random.nextInt(0,50), random.nextInt(0,50), random.nextInt(0,50), random.nextInt(0,50), random.nextInt(0,50)};
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = -1, maxIndex = -1;
        for(int i = 0; i < 5; i++){
            arrayList.add(a[i]);
            if(a[i] > max){
                max = a[i];
                maxIndex = i;
            }
        }
        System.out.println("The biggest member of this array is " + max + " and its index is " + maxIndex);
        int maxArrayList = -1, maxArrayListIndex = -1;
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) > maxArrayList){
                maxArrayList = arrayList.get(i);
                maxArrayListIndex = i;
            }
        }
        System.out.println("The biggest member of this arraylist is " + maxArrayList + " and its index is " + maxArrayListIndex);
    }
}