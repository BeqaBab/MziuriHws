package HW1222;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int grade;
    Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
