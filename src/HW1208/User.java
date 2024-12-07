package HW1208;

import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String socialSecurity;
    private int birthYear;
    private int birthMonth;
    private int birthDate;
    private String userName;
    private String password;
    void setFirstName() throws WrongNameException {
        System.out.println("შემოიყვანეთ თქვენი სახელი:");
        String n = scanner.next();
        if(n.length()<2){
            throw new WrongNameException("სახელი უნდა შედგებოდეს მინიმუმ 2 სიმბოლოსგან.");
        }   else this.firstName=n;
    }
    void setLastName() throws WrongLastNameException{
        System.out.println("შემოიყვანეთ თქვენი გვარი:");
        String n = scanner.next();
        if(n.length()<3){
            throw new WrongLastNameException("გვარი უნდა შედგებოდესდ მინიმუმ 3 სიმბოლოსგან.");
        }   else this.lastName=n;
    }
    void setSocialSecurity() throws WrongSocialSecurityException{
        System.out.println("შემოიყვანეთ თქვენი პირადი ნომერი:");
        String n = scanner.next();
        boolean hasCharacters = false;
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)<'0' || n.charAt(i)>'9'){
                hasCharacters = true;
                break;
            }
        }
        if(n.length()!=11 || hasCharacters){
            throw new WrongSocialSecurityException("პირადი ნომერი უნდა შედგებოდეს 11 სიმბოლოსგან.");
        } else this.socialSecurity=n;
    }
    void setBirthYear() throws IncorrectBirthYearException{
        System.out.println("შემოიყვანეთ თქვენი დაბადების წელი:");
        int n = scanner.nextInt();
        if(n>2023 || n<1900) {
            throw new IncorrectBirthYearException("დაბადების წელი უნდა იყოს 1900-2023 შუალედში.");
        }else this.birthYear=n;
    }
    void setBirthMonth() throws IncorrectBirthMonthException{
        System.out.println("შემოიყვანეთ თქვენი დაბადების თვე:");
        int n = scanner.nextInt();
        if(n>=1 && n<=12){
            this.birthMonth=n;
        }   else throw new IncorrectBirthMonthException("დაბადების თვე უნდა იყოს 1-12 შუალედში.");
    }
    void setBirthDate() throws IncorrectBirthDateException{
        System.out.println("შემოიყვანეთ თქვენი დაბადების რიცხვი:");
        int n = scanner.nextInt();
        if(n>=1 && n<=31){
            this.birthDate=n;
        }   else throw new IncorrectBirthDateException("დაბადების რიცხვი უნდა იყოს 1-31 შუალედში.");
    }void setUserName() throws IncorrectUserNameException{
        System.out.println("შემოიყვანეთ თქვენი მომხმარებლის სახელი:");
        String n = scanner.next();
        if(n.length()<4){
            throw new IncorrectUserNameException("მომხმარების სახელი უნდა აღემატებოდეს 3 სიმბოლოს.");
        }   else this.userName=n;
    }void setPassword() throws WrongPasswordException{
        System.out.println("შემოიყვანეთ თქვენი პაროლი:");
        String n = scanner.next();
        if(n.length()<8 || n.length()>15){
            throw new WrongPasswordException("პაროლი უნდა შედგებოდეს 8-15 სიმბოლოოსგან.");
        }
        this.password=n;
    }
    void Register() throws WrongNameException, WrongLastNameException, IncorrectBirthYearException, IncorrectBirthMonthException, IncorrectBirthDateException, WrongSocialSecurityException, IncorrectUserNameException, WrongPasswordException {
        setFirstName();
        setLastName();
        setBirthYear();
        setBirthMonth();
        setBirthDate();
        setSocialSecurity();
        setUserName();
        setPassword();
        System.out.println("თქვენ დარეგისტრირდით წარმატებით!");
    }
}
