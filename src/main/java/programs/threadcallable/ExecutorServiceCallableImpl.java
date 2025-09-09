package programs.threadcallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceCallableImpl {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CustomCallable task1 = new CustomCallable("Task-1");
        CustomCallable task2 = new CustomCallable("Task-2");

        Future<String> future1 = executorService.submit(task1);
        Future<String> future2 = executorService.submit(task2);

        try {
            String result1 = future1.get();
            System.out.println(result1);

            String result2 = future2.get();
            System.out.println(result2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
