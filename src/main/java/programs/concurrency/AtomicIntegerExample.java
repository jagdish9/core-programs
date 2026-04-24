package programs.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);

        Runnable task = () -> {
            System.out.println("Performing the task...");
            counter.incrementAndGet();
            //counter.getAndIncrement();
            counter.compareAndSet(1, 5);
        };

        Thread t1 = new Thread(task, "t1");
        Thread t2 = new Thread(task, "t2");
        Thread t3 = new Thread(task, "t3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println(counter.get());

        System.out.println("Main thread completes");
    }
}
