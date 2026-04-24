package programs.thread.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count;
    private ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();

        try{
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}
