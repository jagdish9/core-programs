package programs.company.infogain.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadByExecutors {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<?> futureA = executorService.submit(() -> {
            System.out.println("Thread A running");
        });

        Future<?> futureB = executorService.submit(() -> {
            System.out.println("Thread B running");
        });

        futureA.get(); // wait
        futureB.get(); // wait

        executorService.submit(() -> {
            System.out.println("Thread C started after Thread A and B");
        });

        executorService.shutdown();
    }
}

//Thread C starts after completion of Thread A and B in java