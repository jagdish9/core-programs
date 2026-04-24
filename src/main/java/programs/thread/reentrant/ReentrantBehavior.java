package programs.thread.reentrant;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantBehavior {
    private ReentrantLock lock = new ReentrantLock();
    int count = 0;

    public void outerMethod() {
        lock.lock();

        try{
            System.out.println("Outer method locked");
            System.out.println("Current thread is executing: "+Thread.currentThread().getName());
            innerMethod();
            count++;
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();

        try{
            System.out.println("Inner method locked");
            System.out.println("Current thread is executing: "+Thread.currentThread().getName());
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

//If it wasn't reentrant, this would cause deadlock.
//If we will not use the unlock, it would cause deadlock. I have already tested it.
