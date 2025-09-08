package com.threadcallable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomCallable implements Callable<String> {

    private final String taskName;

    //private volatile int volatileVar;
    AtomicInteger atomicInteger;

    public CustomCallable(String taskName) {
        this.taskName = taskName;
        atomicInteger = new AtomicInteger();
    }

    @Override
    public String call()  {
        System.out.println("Executing task: "+taskName + " in thread: "+Thread.currentThread().getName());
        int x = 100;
        int y = 90;
        atomicInteger.addAndGet(atomicInteger.get()+x+y);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Result from "+ taskName + " : "+ atomicInteger.get();
    }
}
