package HW1215;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\beqab\\MziuriHws\\src\\HW1215\\File.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = new String(" ");
        int zr=0, pz=0, ne=0;
        while((str = bufferedReader.readLine()) != null) {
            int i = 1;
            while (i < str.length()-1) {
                if (str.charAt(i) == '-' && i != str.length() - 1) {
                    if (str.charAt(i + 1) > '0' && str.charAt(i + 1) <= '9') {
                        ne++;
                        while (str.charAt(i + 1) > '0' && str.charAt(i + 1) <= '9' && i < str.length() - 1) {
                            i++;
                        }
                    }
                } else if (str.charAt(i) > '0' && str.charAt(i) <= '9' && str.charAt(i - 1) != '-') {
                    pz++;
                    while (str.charAt(i) != ' ' && i < str.length() - 1) {
                        i++;
                    }
                } else if (str.charAt(i) == '0' && str.charAt(i - 1) == ' ' && str.charAt(i + 1) == ' ') {
                    zr++;
                    i++;
                }
                else i++;
            }
        }
        System.out.println("The amount of positive numbers is " + pz);
        System.out.println("The amount of zeroes is " + zr);
        System.out.println("The amount of negative numbers is " + ne);
    }
}