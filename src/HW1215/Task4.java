package HW1215;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("C:\\Users\\beqab\\MziuriHws\\src\\HW1215\\File3.txt");
        System.out.println("Input the amount of members in the array and their values:");
        int[] arr = new int[scanner.nextInt()];
        fileWriter.write(arr.length + "\n");
        int sum=0;
        for(int i=0; i<arr.length; i++){
            arr[i]=scanner.nextInt();
            fileWriter.write(arr[i] + " ");
            sum+=arr[i];
        }
        fileWriter.write("\nThe sum would be " + sum);
        fileWriter.close();
    }
}
