package programs.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return 10;
        });

        System.out.println("Task submitted");

        Integer result = future.get(); //blocking call
        System.out.println("Result: "+ result);

        executorService.shutdown();
    }
}
