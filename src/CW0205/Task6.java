package CW0205;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the amount of words:");
        int n = scanner.nextInt();
        System.out.println("Please input the words:");
        ArrayList <ArrayList <String> > arrayLists = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String s = scanner.next();
            boolean wasAdded = false;
            for (ArrayList<String> arrayList : arrayLists) {
                String temp = arrayList.getFirst();
                if (temp.length() == s.length()) {
                    boolean[] used = new boolean[temp.length()];
                    for (int z1 = 0; z1 < temp.length(); z1++) {
                        boolean wasFound = false;
                        wasAdded = false;
                        for (int z2 = 0; z2 < temp.length(); z2++) {
                            if (s.charAt(z1) == temp.charAt(z2) && !used[z2]) {
                                wasFound = true;
                                wasAdded = true;
                                used[z2] = true;
                            }
                        }
                        if (!wasFound) {
                            break;
                        }
                    }
                    if (wasAdded) {
                        arrayList.add(s);
                        break;
                    }
                }
            }
            if(!wasAdded){
                ArrayList <String> tempArraylist = new ArrayList<>();
                tempArraylist.add(s);
                arrayLists.add(tempArraylist);
            }
        }
        System.out.println(arrayLists);
    }
}
