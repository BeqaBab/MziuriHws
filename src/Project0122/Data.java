package Project0122;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    Scanner scanner = new Scanner(System.in);
    ArrayList<PhoneContact> phoneContactArrayList = new ArrayList<>();
    void ReadContacts() throws IOException, ClassNotFoundException {
        File file = new File("C:\\Users\\beqab\\MziuriHws\\src\\Project0122\\PhoneBook.txt");
        if(file.length() > 0){
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\beqab\\MziuriHws\\src\\Project0122\\PhoneBook.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            phoneContactArrayList = (ArrayList<PhoneContact>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }
    }
    void SaveContacts() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\beqab\\MziuriHws\\src\\Project0122\\PhoneBook.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(phoneContactArrayList);
        fileOutputStream.close();
        objectOutputStream.close();
    }

    public StringBuilder GetInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (PhoneContact phoneContact : phoneContactArrayList) {
            stringBuilder.append(phoneContact.firstName).append(" ").append(phoneContact.lastName).append(" ").append(phoneContact.phoneNumber).append(" ").append(phoneContact.Email).append('\n');
        }
        if(!phoneContactArrayList.isEmpty())  return stringBuilder;
        else return new StringBuilder("You don't have any contacts yet");
    }

    public void AddContact(){
        if(phoneContactArrayList.size() >= 30){
            System.out.println("Warning: This application was made for only 30 contacts.");
        }
        System.out.println("Please input your new contact's first name, last name, phone number and email.");
        PhoneContact phoneContact = new PhoneContact(scanner.next(), scanner.next(), scanner.next(), scanner.next());
        phoneContactArrayList.add(phoneContact);
    }

    public void DeleteContact(){
        System.out.println("Please input your new contact's first name, last name, phone number and email.");
        PhoneContact phoneContact = new PhoneContact(scanner.next(), scanner.next(), scanner.next(), scanner.next());
        boolean isHere = false;
        for(PhoneContact phoneContact1:phoneContactArrayList){
            if(phoneContact1.firstName.equals(phoneContact.firstName) && phoneContact1.lastName.equals(phoneContact.lastName) && phoneContact1.phoneNumber.equals(phoneContact.phoneNumber)){
                isHere = true;
                phoneContactArrayList.remove(phoneContact1);
                break;
            }
        }
        if(!isHere){
            System.out.println("This contact couldn't be found.");
        }else System.out.println("The contact has been removed.");
    }

    public void ChangeContact(){
        System.out.println("Please input your new contact's first name, last name, phone number and email.");
        PhoneContact phoneContact = new PhoneContact(scanner.next(), scanner.next(), scanner.next(), scanner.next());
        boolean isHere = false;
        for(PhoneContact phoneContact1:phoneContactArrayList){
            if(phoneContact1.firstName.equals(phoneContact.firstName) && phoneContact1.lastName.equals(phoneContact.lastName)){
                isHere = true;
                phoneContact1.phoneNumber = phoneContact.phoneNumber;
                phoneContact1.Email=phoneContact.Email;
                break;
            }
        }
        if(!isHere){
            System.out.println("This contact couldn't be found.");
        }else System.out.println("The contact has been changed");
    }

    public void FindContact(){
        System.out.println("Please input your contact's first name and last name.");
        String firstName = scanner.next();  String lastName = scanner.next();
        boolean isHere = false;
        for(PhoneContact phoneContact1:phoneContactArrayList){
            if(phoneContact1.firstName.equals(firstName) && phoneContact1.lastName.equals(lastName)){
                isHere = true;
                System.out.println(phoneContact1.firstName + " " + phoneContact1.lastName + " " + phoneContact1.phoneNumber + " " + phoneContact1.Email);
                break;
            }
        }
        if(!isHere) System.out.println("This contact couldn't be found.");
    }
}
