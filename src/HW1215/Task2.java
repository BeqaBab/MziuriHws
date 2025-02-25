package HW1215;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\beqab\\MziuriHws\\src\\HW1215\\File.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\beqab\\MziuriHws\\src\\HW1215\\File2.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        while(bufferedInputStream.available() > 0){
            bufferedOutputStream.write(bufferedInputStream.read());
        }
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
}
