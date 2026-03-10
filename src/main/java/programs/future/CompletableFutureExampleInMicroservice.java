package programs.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExampleInMicroservice {
    public static void main(String[] args) {
        /*CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(() -> getUser());
        CompletableFuture<String> paymentFuture = CompletableFuture.supplyAsync(() -> getPayment());
        CompletableFuture<String> inventoryFuture = CompletableFuture.supplyAsync(() -> getInventory());

        CompletableFuture<Void> all = CompletableFuture.allOf(userFuture, paymentFuture, inventoryFuture);

        all.join();

        String user = userFuture.join();
        String payment = paymentFuture.join();
        String inventory = inventoryFuture.join();

        System.out.println(user);
        System.out.println(payment);
        System.out.println(inventory);*/
    }
}

/*
User user = userService.getUser(id);
Payment payment = paymentService.getPayment(id);
Inventory inventory = inventoryService.getInventory(id);
*/
