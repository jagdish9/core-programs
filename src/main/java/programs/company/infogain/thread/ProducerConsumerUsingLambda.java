package programs.company.infogain.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingLambda {
    public static void main(String[] args) {
        BlockingQueue<String> q = new ArrayBlockingQueue<>(5);

        Runnable p = () -> {
            q.add("A");
            q.add("B");
            q.add("C");
            System.out.println("Item is added to queue");
        };

        Runnable c = () -> {
            while(!q.isEmpty()) {
                String element = null;
                try {
                    element = q.take();
                } catch(InterruptedException ie) {
                    ie.printStackTrace();
                }
                System.out.println("Consumer has consumed: "+element);
            }
        };

        Thread t1 = new Thread(p, "producer");
        Thread t2 = new Thread(c, "consumer");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
