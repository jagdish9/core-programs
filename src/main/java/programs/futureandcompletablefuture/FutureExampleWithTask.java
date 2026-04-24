package programs.futureandcompletablefuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExampleWithTask {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> task = () -> {
            System.out.println("Running in: "+Thread.currentThread().getName());
            Thread.sleep(3000); //simulate delay
            return "order processed";
        };

        Future<String> future = executor.submit(task);

        String result = future.get(); //blocking call

        System.out.println("Result: "+ result);

        executor.shutdown();
    }
}
