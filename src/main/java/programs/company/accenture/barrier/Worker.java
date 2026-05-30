package programs.company.accenture.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Worker implements Runnable {

    private final CyclicBarrier barrier;

    public Worker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            load();
            barrier.await();

            process();
            barrier.await();

            save();
            barrier.await();
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    public void load() {
        System.out.println(Thread.currentThread().getName() +" Loading...");
    }

    public void process() {
        System.out.println(Thread.currentThread().getName() + " Processing...");
    }

    public void save() {
        System.out.println(Thread.currentThread().getName() + " Saving...");
    }
}
