package HW0216;

import java.util.Scanner;
import java.util.function.Consumer;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Consumer<String> log = string ->    {
            if(string.toLowerCase().contains("low") || string.toLowerCase().contains("danger") || string.toLowerCase().contains("need")){
                System.out.println("WARNING");
            } else if (string.toLowerCase().contains("crash") || string.toLowerCase().contains("error") || string.toLowerCase().contains("mistake")) {
                System.out.println("ERROR");
            }   else System.out.println("INFORMATION");
        };
        log.accept(scanner.nextLine());
    }
}
