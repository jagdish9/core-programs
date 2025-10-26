package programs.thread;

public class Printer {

    private volatile boolean isOdd;

    public synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
    }

    public synchronized void printOdd(int number) {
        while(isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(printer, 10, false), "Odd");
        Thread t2 = new Thread(new TaskEvenOdd(printer, 10, true), "Even");
        t1.start();
        t2.start();
    }
}

class TaskEvenOdd implements Runnable {

    private int max;
    private Printer print;
    private boolean isEvenNumber;

    public TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.max = max;
        this.print = print;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while(number <= max) {
            if(isEvenNumber)
                print.printEven(number);
            else
                print.printOdd(number);
            number += 2;
        }
    }
}
