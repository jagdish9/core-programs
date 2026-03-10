package programs.company.infogain.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,
                () -> System.out.println("All threads reached barrier"));

        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " waiting");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName() + " resumed");
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });*/

        /*Thread thread = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + " resumed");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });*/

        Runnable thread = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + " resumed");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };

        for(int i = 0; i < 3; i++) {
           new Thread(thread).start();
        }
    }
}
