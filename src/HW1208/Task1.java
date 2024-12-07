package HW1208;

import java.util.Scanner;

public class Task1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the amount of members and them:");
        int[] arr = new int[scanner.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Input how many members you would like to count:");
        int n = scanner.nextInt();
        try{
            int sum=0;
            for(int i=0; i<n; i++){
                sum+=arr[i];
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ინდექსი, რომელსაც თქვენ მიმართავთ, არ აქვს მასივს.");
        }
    }
}
