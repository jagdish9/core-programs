package programs.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample1 {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            return 10+20;
        };

        Future<Integer> future = executorService.submit(task);
        System.out.println(future.get());
        executorService.shutdown();
    }
}
