package HW0216;

import java.util.Random;
import java.util.function.Supplier;

public class Task1 {
    public static void main(String[] args){
        Supplier<StringBuilder> password = () -> {
            Random random = new Random();
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < 16; i++){
                if(random.nextBoolean()){
                    stringBuilder.append(random.nextInt('0',  '9'));
                }   else{
                    if(random.nextBoolean()){
                        stringBuilder.append((char)random.nextInt('a', 'z'));
                    }   else stringBuilder.append((char)random.nextInt('A', 'Z'));
                }
            }
            return stringBuilder;
        };
        System.out.println(password.get());
    }
}