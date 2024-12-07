package HW1208;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the amount of members in the first array and them:");
        int[] arr1 = new int[scanner.nextInt()];
        for(int i=0; i<arr1.length; i++){
            arr1[i]= scanner.nextInt();
        }
        System.out.println("Input the amount of members in the second array and them:");
        int[] arr2 = new int[scanner.nextInt()];
        for(int i=0; i<arr2.length; i++){
            arr2[i]= scanner.nextInt();
        }
        System.out.println("Input the amount of members you would like to divide:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try{
            System.out.println(arr1[a]/arr2[b]);
        }catch (ArithmeticException e){
            System.out.println("ნულზე გაყოფა.");
        }
    }
}
