package programs.company.infogain.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

        //thread with runnable
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    queue.put("Java");
                    queue.put("Python");
                    queue.put("SpringBoot");
                    queue.put("C++");
                    queue.put("DB");
                    queue.put("AWS");
                    System.out.println("Producer produced the element");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();

        //thread with lambda expression
        Thread consumerThread = new Thread(() -> {
            try {
                while(!queue.isEmpty()) {
                    String element = queue.take();
                    System.out.println("Consumer consumed: " +element);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
