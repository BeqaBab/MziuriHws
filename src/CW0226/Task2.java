package CW0226;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of rows:");
        int numOfRows = scanner.nextInt();
        List<List<Integer>> pascalTriangle = new ArrayList<>(numOfRows);
        pascalTriangle.add(List.of(1));
        for(int i = 1; i < numOfRows; i++){
            int newRowSize = pascalTriangle.get(i - 1).size() + 1;
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for(int j = 1; j < newRowSize - 1; j++){
                newRow.add(pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j));
            }
            newRow.add(1);
            pascalTriangle.add(newRow);
        }
        for(int i = 0; i < numOfRows; i++){
            System.out.println(pascalTriangle.get(i));
        }
    }
}
