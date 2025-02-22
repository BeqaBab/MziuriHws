package HW1229;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Task5 {
    public static void main(String[] args){
        Random random = new Random();
        HashSet<StringBuffer> hashSet= new HashSet<>();
        ArrayList<StringBuffer> arrayList = new ArrayList<>();
        for(int i = 0; i < random.nextInt(1, 10000); i++){
            int length = random.nextInt(1,16);
            StringBuffer stringBuffer = new StringBuffer();
            for(int j = 0; j < length; j++){
                int element = random.nextInt('A','z');
                stringBuffer.append((char)element);
            }
            hashSet.add(stringBuffer);
            arrayList.add(stringBuffer);
        }
        for(StringBuffer i : hashSet){
            int cnt = 0;
            for (StringBuffer stringBuffer : arrayList) {
                if (stringBuffer.compareTo(i) == 0) {
                    cnt++;
                }
            }
            System.out.println(i + " : " + cnt);
        }
    }
}