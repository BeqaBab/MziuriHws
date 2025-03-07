package HW0309;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task4 {
    public static void generateSecretCode(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.fillInStackTrace();
        }
        System.out.println((new Object()).hashCode());
}
    public static void main(String[] args){
        Thread thread = new Thread(Task4::generateSecretCode);
        thread.start();
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for(int i = 0; i < 100; i++){
            executorService.execute(Task4::generateSecretCode);
        }
        executorService.shutdown();
    }
}
