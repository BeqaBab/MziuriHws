package HW1215;


import java.io.File;

public class Task6 {
    public static void main(String[] args){
        File file = new File("C:\\Users\\beqab\\MziuriHws\\src\\HW1215\\File.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getFreeSpace());
    }
}
