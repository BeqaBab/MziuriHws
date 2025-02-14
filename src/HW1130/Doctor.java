package HW1130;

public class Doctor extends Person{
    String department;
    String position;
    String hospital;
    int experience;
    Doctor(String name, int age, String department, String position, String hospital, int experience) {
        this.department=department;
        this.position=position;
        this.hospital=hospital;
        this.experience=experience;
        super(name, age);
    }
    @Override
    void Info(){
        System.out.println(name + " " + age + " " + department + " " + position + " " + hospital + " " + experience);
    }
}
