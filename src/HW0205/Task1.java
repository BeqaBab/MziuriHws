package HW0205;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A", "A", 10101010));
        employees.add(new Employee("B", "B", 124521));
        employees.add(new Employee("C", "C", 1234521));
        employees.add(new Employee("D", "D", 52561));
        employees.add(new Employee("E", "E", 125121244));

        Collections.sort(employees);
        System.out.println(employees);

        Collections.sort(employees, new SortByName());
        System.out.println(employees);

        System.out.println(Collections.min(employees));
        System.out.println(Collections.max(employees));

        Collections.reverse(employees);
        System.out.println(employees);
    }
}
