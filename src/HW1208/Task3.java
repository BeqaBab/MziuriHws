package HW1208;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Input the name of your file: ");
            FileWriter fileWriter = new FileWriter(scanner.next());
            System.out.println("Input the length of the array and its members: ");
            int[] arr = new int[scanner.nextInt()];
            for(int i=0; i<arr.length; i++){
                arr[i] = scanner.nextInt();
                fileWriter.write(arr[i]);
            }
            System.out.println("Input the name of the file, you would like to read: ");
            FileReader fileReader = new FileReader(scanner.next());
            System.out.println(fileReader.read());
        } catch (IOException ex) {
            throw new IOException();
        }
    }
}
