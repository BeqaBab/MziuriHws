package HW0226;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        Random random = new Random();
        List<Integer> num = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            num.add(random.nextInt(10000));
        }
        List<Integer> newNum = num.stream().filter(number -> number % 2 == 0).toList();
        System.out.println("Only evens:");
        System.out.println(newNum);
        System.out.println();

        List<Integer> threeNewNum = newNum.stream().map(i -> 3 * i).toList();
        System.out.println("Only evens multiplied by 3:");
        System.out.println(threeNewNum);
        System.out.println();

        System.out.println("Skipping the first two:");
        threeNewNum.stream().skip(2).forEach(System.out::println);
        System.out.println();

        System.out.println("The maximum:");
        System.out.println(threeNewNum.stream().max(Integer::compare));
    }
}
