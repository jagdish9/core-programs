package programs.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++) {
            final int taskId = i;
            executorService.execute(() -> {
                System.out.println("Executing task "+taskId + " on thread "+ Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch(InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // This initiates an orderly shutdown, allowing previously submitted tasks to complete.
        executorService.shutdown();
    }
}
