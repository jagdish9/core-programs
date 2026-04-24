package programs.futureandcompletablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            //Step 1: Async task
            System.out.println("Thread 1: "+ Thread.currentThread().getName());
            return "order created";
        }, executor)

                //Step 2: Transform result
                .thenApply(result -> {
                    System.out.println("Thread 2: "+Thread.currentThread().getName());
                    return result + " -> payment initiated";
                })

                //Step 3: Async chaining (dependent call)
                .thenCompose(result ->
                        CompletableFuture.supplyAsync(() -> {
                            System.out.println("Thread 3: "+ Thread.currentThread().getName());
                            return result + " -> payment completed";
                        }))

                //Step 4: Combine with another async task
                .thenCombine(
                        CompletableFuture.supplyAsync(() -> {
                            System.out.println("Thread 4: "+ Thread.currentThread().getName());
                            return " -> Notification sent";
                        }, executor),
                        (paymentResult, notification) -> paymentResult + " " + notification
                )

                // Step 5: Exception handling
                .exceptionally(ex -> {
                    System.out.println("Exception: "+ ex.getMessage());
                    return "Fallback Response";
                });

        //Final result
        System.out.println("Final output: "+ future.join());

        executor.shutdown();
    }
}
