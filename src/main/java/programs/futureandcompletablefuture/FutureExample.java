package programs.futureandcompletablefuture;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

       Future<Integer> future = executor.submit(() -> {
            return 10;
        });

       Integer result = future.get(); // blocking call

        executor.shutdown();

       System.out.println(result);
    }
}
