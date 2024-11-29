package HW1130;

public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void Info(){
        System.out.println(name + " " + age);
    }
}
