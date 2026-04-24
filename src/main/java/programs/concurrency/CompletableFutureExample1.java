package programs.concurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample1 {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            return 10;
        }).thenApply(r -> r * 2)
                .thenAccept(System.out::println);

        System.out.println("Main thread");
    }
}
