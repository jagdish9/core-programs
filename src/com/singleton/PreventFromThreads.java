package com.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PreventFromThreads {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(BreakUsingThreads::useSingleton);
        service.submit(BreakUsingThreads::useSingleton);
        service.submit(BreakUsingThreads::useSingleton);

        service.shutdown();
    }

    static void useSingleton() {
        SingletonCheckOnThreads singletonCheckOnThreads = SingletonCheckOnThreads.getInstance();
        print("singleton", singletonCheckOnThreads);
    }

    private static void print(String name, SingletonCheckOnThreads singletonObject) {
        System.out.println(String.format("Object : %s, HashCode: %d", name, singletonObject.hashCode()));
    }
}

class SingletonCheckOnThreads {
    private static volatile SingletonCheckOnThreads soleInstance = null;
    // used volatile keyword to save the latest value accessed by multiple threads

    private SingletonCheckOnThreads() {
        System.out.println("Creating...");
    }

    public static SingletonCheckOnThreads getInstance() {
        //Double check locking
        if (soleInstance == null) { //check 1
            synchronized (SingletonCheckOnThreads.class) {
                if(soleInstance == null) { //check 2
                    soleInstance = new SingletonCheckOnThreads();
                }
            }
        }
        return soleInstance;
    }
}
