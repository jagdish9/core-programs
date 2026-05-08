package programs.hackerranktest;

public class SampleDemo implements Runnable {

    private Thread t;
    private String threadName;

    public SampleDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        /*while (true)
            System.out.println(threadName);*/
        for(int i = 0; i <= 10; i++)
            System.out.println(threadName);
    }

    public void start() {
        if(t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        SampleDemo A = new SampleDemo("A");
        SampleDemo B = new SampleDemo("B");

        B.start();
        A.start();
    }
}
