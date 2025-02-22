package CW1222;

import java.util.ArrayList;

public class MakeSet {
    public static ArrayList makeSet(int[] arr){
        boolean[] used = new boolean[arr[arr.length - 1] + 1];
        ArrayList arrayList = new ArrayList();
        for(int i = 0; i < arr.length; i++){
            if(!used[arr[i]]){
                arrayList.add(arr[i]);
                used[arr[i]] = true;
            }
        }
        return arrayList;
    }
}
