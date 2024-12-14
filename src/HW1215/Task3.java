package HW1215;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\beqab\\MziuriHws\\src\\HW1215\\File.txt");
        FileWriter fileWriter = new FileWriter("C:\\Users\\beqab\\MziuriHws\\src\\HW1215\\File2.txt");
        int c;
        while((c = fileReader.read()) != -1){
            fileWriter.write((char)c);
        }
        fileWriter.close();
    }
}
