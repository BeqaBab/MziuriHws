package HW0309;

class CounterThread extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.fillInStackTrace();
            }
        }
    }
}

public class Task2 {
    public static void main(String[] args){
        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }
}
