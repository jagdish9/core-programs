package com.threadcallable;

import com.threadtask.AdditionTask;

import java.util.concurrent.*;

public class ScheduledExecutorServiceImpl {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        CustomCallable task1 = new CustomCallable("Task-1");
        AdditionTask task2 = new AdditionTask();

        Future<String> resultFuture = scheduledExecutorService.schedule(task1, 1, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(task2, 100, 450, TimeUnit.MILLISECONDS);

        try {
            resultFuture.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scheduledExecutorService.shutdown();
    }
}
