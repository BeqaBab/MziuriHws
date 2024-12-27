package HW1229;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        Random r = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int a;
        do {
            a = r.nextInt(0, 50);
            arrayList.add(a);
        } while (a != 40);
        System.out.println("The length of the arraylist is " + arrayList.size() + " and its elements are:");
        for(int i : arrayList){
            System.out.print(i + " ");
        }
    }
}