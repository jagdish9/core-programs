package programs.company.accenture.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Aggregator {

    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(3);
        AtomicInteger result = new AtomicInteger();

        Runnable service = () -> {
            //double value = Math.random() * 10;
            int value = 10 * 10;
            result.addAndGet(value);
            System.out.println("Service returned by Thread: "+value + " "+ Thread.currentThread().getName());
            latch.countDown();
        };

        new Thread(service).start();
        new Thread(service).start();
        new Thread(service).start();

        latch.await(); // main thread wait for all threads
        System.out.println("Final Result: "+ result.get());
    }
}
