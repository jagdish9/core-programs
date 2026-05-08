package programs.company.accenture.barrier;

import java.util.concurrent.CyclicBarrier;

public class WorkerMain {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        new Thread(new Worker(barrier)).start();
        new Thread(new Worker(barrier)).start();
        new Thread(new Worker(barrier)).start();

        System.out.println(barrier.getParties());
    }
}
