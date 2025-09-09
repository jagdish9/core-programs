package programs.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BreakUsingThreads {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(BreakUsingThreads::useSingleton);
        service.submit(BreakUsingThreads::useSingleton);
        service.submit(BreakUsingThreads::useSingleton);

        service.shutdown();
    }

    static void useSingleton() {
        SingletonLazyInitialization singletonLazyInitialization = SingletonLazyInitialization.getInstance();
        print("singleton", singletonLazyInitialization);
    }

    private static void print(String name, SingletonLazyInitialization singletonObject) {
        System.out.println(String.format("Object : %s, HashCode: %d", name, singletonObject.hashCode()));
    }
}
