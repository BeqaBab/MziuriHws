package HW0129;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Corporation {
    Scanner scanner = new Scanner(System.in);
    String name;
    Address address;
    HashMap<String, String> contactInformation = HashMap.newHashMap(4);
    ArrayList<Employee> employees = new ArrayList<>();

    public void creation() throws IncorrectIdException {
        name = "Corporation inc.";
        address = new Address("Georgia", "Kutaisi", "Nike", "5A");
        for(int i = 0; i < 5; i++){
            System.out.println("Please input first and last name, salary and ID:");
            Employee employee = new Employee(scanner.next(), scanner.next(), scanner.nextInt());
            String s = scanner.next();
            if(s.length() != 11)  throw new IncorrectIdException("ID must have 11 symbols.");
            for(int j = 0; j < 11; j++){
                if(s.charAt(j) < '0' || s.charAt(j) > '9') throw new IncorrectIdException("Id must contain only numbers.");
            }
            employees.add(employee);
        }
        contactInformation.put("Business", "557238525");
        contactInformation.put("Informative", "555234241");
        contactInformation.put("Commercial", "552442412");
        contactInformation.put("Emergency Helpline", "112");
    }

    public String contactInfo(String request){
        if(contactInformation.get(request) == null) return "Sorry, we don't have the contact to satisfy your request.";
        return contactInformation.get(request);
    }

    public String AboutUs(){
        return address.toString() + " Contact information: " + "Business " + contactInformation.get("Business") +
                " " + "Informative " + contactInformation.get("Informative") + " " + "Commercial " +contactInformation.get("Commercial") +
                " " + "Emergency Helpline " + contactInformation.get("Emergency Helpline");
    }

    public int totalCost(){
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.salary;
        }
        return sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContactInformation(HashMap<String, String> contactInformation) {
        this.contactInformation = contactInformation;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
