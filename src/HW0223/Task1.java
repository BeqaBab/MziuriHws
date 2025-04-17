package HW0223;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        System.out.println("Please input the amount of members:");
        int n = scanner.nextInt();
        System.out.println("Please input the members:");
        for(int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        List<Integer> list = numbers.stream().map(number -> number * number).collect(Collectors.toList());
        for(Integer num:list){
            sum += num;
        }
        System.out.println("The sum of the squares is: " + sum);
    }
}
