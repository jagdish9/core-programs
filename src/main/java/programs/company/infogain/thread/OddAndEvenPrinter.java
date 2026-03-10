package programs.company.infogain.thread;

public class OddAndEvenPrinter {

    private int beginNumber = 1;
    private final int endNumber = 20;

    public synchronized void printOdd() {
        while(beginNumber <= endNumber) {

            while(beginNumber % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if(beginNumber <= endNumber) {
                System.out.println("Odd Thread: "+ beginNumber);
                beginNumber++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (beginNumber <= endNumber) {

            while (beginNumber % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if(beginNumber <= endNumber) {
                System.out.println("Even Thread: "+ beginNumber);
                beginNumber++;
                notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        OddAndEvenPrinter oddAndEvenPrinter = new OddAndEvenPrinter();

        // Create threads using lambda expressions (Java 8+)
        Thread oddThread = new Thread(() -> oddAndEvenPrinter.printOdd(), "OddThread");
        //Thread evenThread = new Thread(() -> oddAndEvenPrinter.printEven(), "EvenThread");
        Thread evenThread = new Thread(() -> oddAndEvenPrinter.printEven(), "EvenThread");

        oddThread.start();
        evenThread.start();

        oddThread.join();
        evenThread.join();
    }
}
