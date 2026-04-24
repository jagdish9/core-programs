package programs.thread.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {
    private ReentrantLock lock = new ReentrantLock();

    public void access() {
        if(lock.tryLock()) {
            try {
                System.out.println(Thread.currentThread().getName() + " acquired the lock");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " could not get the lock");
        }
    }
}

//tryLock() allows a thread to avoid waiting indefinitely.
//Useful for deadlock prevention.
