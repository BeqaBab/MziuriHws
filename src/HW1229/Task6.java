package HW1229;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Task6 {
    public static void main(String[] args){
        Random random = new Random();
        st st = new st("60001235234", "Beka", "Beka");
        int amount = random.nextInt(5, 40);
        st.addScore("Math", 0);
        st.addScore("Georgian", 0);
        st.addScore("Geography", 0);
        st.addScore("Physics", 0);
        st.addScore("Java", 0);
        st.addScore("History", 0);

        while(amount > 0){
            int sub = random.nextInt(1, 7);
            int grade = random.nextInt(0, 100);
            switch (sub){
                case 1:
                    st.addScore("Math", grade);
                    break;
                case 2:
                    st.addScore("Georgian", grade);
                    break;
                case 3:
                    st.addScore("Geography", grade);
                    break;
                case 4:
                    st.addScore("Physics", grade);
                    break;
                case 5:
                    st.addScore("History", grade);
                    break;
                default:
                    st.addScore("Java", grade);
                    break;
            }
            amount--;
        }
        System.out.println(st.toString());
        st.subjectInfo();
    }
}

class st{
    private final String ID;
    String firstName;
    String lastName;
    HashMap<String, ArrayList<Integer>> classCredit = new HashMap<>();

    public st(String ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addScore(String subject, int score){
        ArrayList<Integer> temp = new ArrayList<>();
        if(classCredit.get(subject) != null){
            temp = classCredit.get(subject);
        }
        temp.add(score);
        classCredit.put(subject, temp);
    }

    @Override
    public String toString() {
        return "st{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName  + "'}";
    }

    public void subjectInfo(){
        ArrayList<Integer> classScores = classCredit.get("Math");
        int averageScore = 0;
        for(Integer i : classScores){
            averageScore += i;
        }   if(classCredit.get("Math").size() != 1){
            averageScore /= classCredit.get("Math").size() - 1;
        }   else averageScore = 0;
        System.out.println("Average score for Math is " + averageScore);

        classScores = classCredit.get("Georgian");
        averageScore = 0;
        for(Integer i : classScores){
            averageScore += i;
        }   if(classCredit.get("Georgian").size() != 1){
            averageScore /= classCredit.get("Georgian").size() - 1;
        }   else averageScore = 0;
        System.out.println("Average score for Georgian is " + averageScore);

        classScores = classCredit.get("Geography");
        averageScore = 0;
        for(Integer i : classScores){
            averageScore += i;
        }   if(classCredit.get("Geography").size() != 1){
            averageScore /= classCredit.get("Geography").size() - 1;
        }   else averageScore = 0;
        System.out.println("Average score for Geography is " + averageScore);

        classScores = classCredit.get("Physics");
        averageScore = 0;
        for(Integer i : classScores){
            averageScore += i;
        }   if(classCredit.get("Physics").size() != 1){
            averageScore /= classCredit.get("Physics").size() - 1;
        }   else averageScore = 0;
        System.out.println("Average score for Physics is " + averageScore);

        classScores = classCredit.get("History");
        averageScore = 0;
        for(Integer i : classScores){
            averageScore += i;
        }
        if(classCredit.get("History").size() != 1){
            averageScore /= classCredit.get("History").size() - 1;
        }   else averageScore = 0;

        System.out.println("Average score for History is " + averageScore);


        classScores = classCredit.get("Java");
        averageScore = 0;
        for(Integer i : classScores){
            averageScore += i;
        }   if(classCredit.get("Java").size() != 1){
            averageScore /= classCredit.get("Java").size() - 1;
        }   else averageScore = 0;
        System.out.println("Average score for Java is " + averageScore);
    }
}