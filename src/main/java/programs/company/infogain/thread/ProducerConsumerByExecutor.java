package programs.company.infogain.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerByExecutor {

    private static final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 10; i ++) {
                    try {
                        queue.put(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Produced: "+ i);
                }
            }
        });

        executorService.submit(() -> {
            while(true) {
                Integer element = queue.take();
                System.out.println("Consumed: "+ element);
            }
        });

        executorService.shutdown();
    }
}
