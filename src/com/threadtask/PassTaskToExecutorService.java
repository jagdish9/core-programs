package com.threadtask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PassTaskToExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new AdditionTask());
        }

        //executorService.shutdown();

        try {
            if(!executorService.awaitTermination(30, TimeUnit.SECONDS)) {
                // If tasks are still running after the timeout, force shutdown.
                System.out.println("Stopping the server");
                executorService.shutdown();
            }
        } catch (InterruptedException e) {
            // Force shutdown if interrupted
            executorService.shutdown();
            throw new RuntimeException(e);
        }
    }
}
