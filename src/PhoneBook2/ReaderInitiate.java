package PhoneBook2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderInitiate {
    public static String Initiate() throws FileNotFoundException {
        File obj = new File("C:\\Users\\beqab\\MziuriHws\\src\\PhoneBook2\\Password");
        Scanner myReader = new Scanner(obj);
        String password = "";
        while(myReader.hasNext()){
            password = myReader.nextLine();
        }
        myReader.close();

        return password;
    }
}
