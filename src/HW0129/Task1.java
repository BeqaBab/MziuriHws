package HW0129;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList <Basketball> basketballs = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            Basketball basketball = new Basketball((char) random.nextInt(80, 130) + "", (char) random.nextInt(80, 130) + "", random.nextInt(0, 20), random.nextInt(0, 20), random.nextInt(0, 20), random.nextInt(0, 20), random.nextInt(0, 20) );
            basketballs.add(basketball);
        }
        Collections.sort(basketballs, new SortBasketball());
        System.out.println(basketballs);
        Collections.reverse(basketballs);
        System.out.println(basketballs);
    }
}
