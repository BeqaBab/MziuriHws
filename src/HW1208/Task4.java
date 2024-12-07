package HW1208;

import java.util.Scanner;

public class Task4 {
    public static void main(String args[]) throws IncorrectBirthMonthException, WrongNameException, IncorrectUserNameException, IncorrectBirthDateException, IncorrectBirthYearException, WrongSocialSecurityException, WrongLastNameException, WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("გსურთ დარეგისტრირება?");
        System.out.println("[1] დიახ");
        System.out.println("[2] არა");
        if(scanner.nextInt()==1){
            User user = new User();
            user.Register();
        }   else System.out.println("კარგით :(");
    }
}
