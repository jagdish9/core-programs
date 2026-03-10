package programs.company.infogain.thread;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerClassicWay {

    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 5;

    private synchronized void produce(int data) {
        while(queue.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        boolean produced = queue.add(data);
        if(produced) {
            System.out.println("Produced: "+data);
        }
        notify();
    }

    private synchronized void consume() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        int consumedData = queue.poll();
        System.out.println("Consumed: "+consumedData);
        notify();
    }

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumerClassicWay pc = new ProducerConsumerClassicWay();
        Thread p = new Thread(() -> {
            for(int i = 0; i < 20; i++) {
                pc.produce(i);
            }
        });

        Thread c = new Thread(() -> {
            while (true) {
                pc.consume();
            }
        });

        p.start();
        c.start();

        p.join();
        c.join();
    }
}
