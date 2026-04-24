package programs.thread.reentrant;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        try {
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
