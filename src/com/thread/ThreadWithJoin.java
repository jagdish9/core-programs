package com.thread;

public class ThreadWithJoin {
    public static void main(String[] args) {
        Thread stopTestThread = new Thread(() -> {
            System.out.println("Hello from "+ Thread.currentThread().getName());
            for(int i = 0; i < 3; i++) {
                System.out.println("I'm running "+ (i+1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Now I'm going to stop");
        }, "StopTestThread");

        // the following line invokes the stopTestThread for the first time
        // the code in the lambda gets executed and the thread stops
        stopTestThread.start();

        try {
            stopTestThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // now it's main (root) thread's job
        // this is the thread that runs the app by default
        System.out.println();
        System.out.println("Hello from " + Thread.currentThread().getName());
        System.out.println("Trying to invoke " + stopTestThread.getName());

        // We'll get IllegalThreadStateException, because a thread
        // can't be started for the second time
        stopTestThread.start();
    }
}
