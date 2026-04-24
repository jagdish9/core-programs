package programs.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Runnable writeTask = () -> {
            lock.writeLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() + " is writing");
                for(int i = 1; i <= 5; i++)
                    inventory.put("item"+i, i*100);
            } finally {
                lock.writeLock().unlock();
            }
        };

        Runnable readTask = () -> {
            lock.readLock().lock();
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is reading");
                int item = inventory.get("item1");
                System.out.println("Item from inventory: "+item);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }
        };

        new Thread(writeTask, "writer1").start();
        new Thread(readTask, "reader1").start();
        new Thread(readTask, "reader2").start();
        new Thread(readTask, "reader3").start();
    }
}
