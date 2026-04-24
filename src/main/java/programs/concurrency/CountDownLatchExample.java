package programs.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " starting...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " ready...");
            countDownLatch.countDown();
        };

        new Thread(task, "Order Service").start();
        new Thread(task, "Inventory Service").start();
        new Thread(task, "Payment Service").start();

        System.out.println("Main Thread waiting...");
        try {
            countDownLatch.await(); // wait until count reaches zero
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("All services are ready. Starting the application");
    }
}
