package programs.java8revision.thread;

public class PrintOddEvenByTwoThreads {

    private int beginNumber = 1;
    private final int endNumber = 20;

    public synchronized void printOdd() {
        while(beginNumber <= endNumber) {
            while (beginNumber % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(beginNumber <= endNumber) {
                System.out.println("Odd Number: "+beginNumber);
                beginNumber++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while(beginNumber <= endNumber) {
            while (beginNumber % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(beginNumber <= endNumber) {
                System.out.println("Even Number: "+beginNumber);
                beginNumber++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        PrintOddEvenByTwoThreads printOddEvenByTwoThreads =
                new PrintOddEvenByTwoThreads();

        Thread thread1 = new Thread(() -> printOddEvenByTwoThreads.printOdd(), "Odd Thread");
        Thread thread2 = new Thread(() -> printOddEvenByTwoThreads.printEven(), "Even Thread");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
