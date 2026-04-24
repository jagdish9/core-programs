package programs.thread.reentrant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TimeoutLockExample {
    private ReentrantLock lock = new ReentrantLock();

    private void access() {
        try {
            if (lock.tryLock(2, TimeUnit.SECONDS)) {
                try {
                    System.out.println(Thread.currentThread().getName() + " acquired the lock");
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

//Thread waits only for limited time.
//Very useful in distributed systems / microservices.