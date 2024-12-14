package HW1215;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\beqab\\MziuriHws\\src\\HW1215\\File.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        while(bufferedInputStream.available()>0){
            System.out.print((char)bufferedInputStream.read());
        }
    }
}
