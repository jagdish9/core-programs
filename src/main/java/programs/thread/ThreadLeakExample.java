package programs.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLeakExample {

    private static final ExecutorService executor = Executors.newFixedThreadPool(5);

    private static final List<byte[]> memoryLeakList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            executor.submit(() -> {
                //Allocate 1 MB
                byte[] data = new byte[1024 * 1024];

                //Add to static list (never removed)
                memoryLeakList.add(data);

                System.out.println("Current size: " + memoryLeakList.size());

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
    }
}
