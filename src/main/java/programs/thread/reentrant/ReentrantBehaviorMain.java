package programs.thread.reentrant;

public class ReentrantBehaviorMain {
    public static void main(String[] args) {
        ReentrantBehavior reentrantBehavior = new ReentrantBehavior();

        Runnable task = () -> {
            for(int i = 0; i < 1000; i++) {
                reentrantBehavior.outerMethod();
            }
        };

        Thread t1 = new Thread(task, "Thread-01");
        Thread t2 = new Thread(task, "Thread-02");

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

        System.out.println(reentrantBehavior.getCount());
    }
}
