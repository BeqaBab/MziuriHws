package HW0216;

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Function<String, StringBuilder> stringChange = string -> {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = string.length() - 1; i >= 0; i--){
                stringBuilder.append(string.charAt(i));
            }
            return stringBuilder;
        };
        System.out.println(stringChange.apply(scanner.next()));
    }
}
