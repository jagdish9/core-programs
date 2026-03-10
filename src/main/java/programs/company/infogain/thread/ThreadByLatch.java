package programs.company.infogain.thread;

import java.util.concurrent.CountDownLatch;

public class ThreadByLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);

        Thread threadA = new Thread(new TaskWorker("threadA", countDownLatch));
        Thread threadB = new Thread(new TaskWorker("threadB", countDownLatch));

        threadA.start();
        threadB.start();

        countDownLatch.await(); // wait until A and B finish

        /*countDownLatch.countDown();
        Thread threadC = new Thread(new TaskWorker("threadC", countDownLatch));
        threadC.start();*/

        Thread threadC = new Thread(() -> {
                    System.out.println("Thread C started after thread A and B");
                });
        threadC.start();
    }
}

class TaskWorker implements Runnable {
    private String name;
    private CountDownLatch countDownLatch;

    public TaskWorker(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(name + " started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
         System.out.println(e.getMessage());
        }
        System.out.println(name + " completed");
    }
}

//Thread C starts after completion of Thread A and B in java