package HW0223;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        System.out.println("Please input the amount of members:");
        int n = scanner.nextInt();
        System.out.println("Please input the members:");
        for(int i = 0; i < n; i++){
            strings.add(scanner.next());
        }
        List<String> BStrings = strings.stream().filter(str -> str.toLowerCase().charAt(0) == 'b').collect(Collectors.toList());
        System.out.println(BStrings);
    }
}
