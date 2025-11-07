package programs.thread;

public class StringPrinter2 {
    public static void main(String[] args) {
        String str = "This is a multi-threaded string example";

        int midIndex = str.length() / 2;

        String part1 = str.substring(0, midIndex);
        String part2 = str.substring(midIndex + 1);

        Thread t1 = new Thread(new StringPrinterClass2(part1), "Thread-1");
        Thread t2 = new Thread(new StringPrinterClass2(part2), "Thread-2");

        t1.start();
        t2.start();
    }
}

class StringPrinterClass2 implements Runnable {
    private String message;

    public StringPrinterClass2(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + message);
    }
}
