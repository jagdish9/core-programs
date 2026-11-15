package programs.java21.virtualthreads;

import java.util.concurrent.Executors;

public class VirtualThread {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> {
                System.out.println("Running in virtual thread");
            });
        }
    }
}

/*
One of the most significant additions from Project Loom.

Benefits:

Lightweight threads for massive concurrency
Easier scaling of server applications
Simpler programming model compared to reactive frameworks
 */