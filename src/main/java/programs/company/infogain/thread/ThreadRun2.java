package programs.company.infogain.thread;

public class ThreadRun2 {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Task("ThreadA"));
        Thread threadB = new Thread(new Task("ThreadB"));
        Thread threadC = new Thread(new Task("ThreadC"));

        threadA.start();
        threadB.start();

        // Wait for A and B to finish
        threadA.join();
        threadB.join();

        threadC.start();
    }
}

class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started");
        //Instant start = Instant.now();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Instant end = Instant.now();
        System.out.println(name + " completed");
    }
}
