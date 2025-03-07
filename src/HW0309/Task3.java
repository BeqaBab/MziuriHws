package HW0309;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    private AtomicInteger count = new AtomicInteger();
    void increment(){
        this.count.incrementAndGet();
    }
    public AtomicInteger getCount() {
        return count;
    }
}

public class Task3 {
    public static void main(String[] args){
        Counter counter = new Counter();
        Thread threadOne = new Thread(() ->{
            for(int i = 0; i < 1000; i++){
                counter.increment();
            }
        });
        Thread threadTwo = new Thread(() ->{
            for(int i = 0; i < 1000; i++){
                counter.increment();
            }
        });
        threadOne.start();
        threadTwo.start();
        try{
            threadOne.join();
            threadTwo.join();
        }   catch (InterruptedException e){
            e.fillInStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
