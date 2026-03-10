package programs.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        future.thenApply(x -> x * 2)
                .thenAccept(System.out::println);
    }
}
