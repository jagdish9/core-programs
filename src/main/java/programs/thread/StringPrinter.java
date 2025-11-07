package programs.thread;

public class StringPrinter {
    public static void main(String[] args) {
        String part1 = "Hello ";
        String part2 = "World!";

        Thread thread1 = new Thread(new StringPrintClass(part1), "Thread-1");
        Thread thread2 = new Thread(new StringPrintClass(part2), "Thread-2");

        thread1.start();
        thread2.start();
    }
}

class StringPrintClass implements Runnable {

    private String message;

    public StringPrintClass(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + message);
    }
}
