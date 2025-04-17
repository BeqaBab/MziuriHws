package HW0309;

class Hello implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(2000);
            }   catch (InterruptedException e){
                e.fillInStackTrace();
            }
        }
    }
}

public class Task1 {
    public static void main(String[] args){
        Thread thread = new Thread(new Hello());
        thread.start();
    }
}
