package programs.thread;

public class CustomRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("This is runnable thread");
    }

    public static void main(String[] args) {
        CustomRunnable customRunnable = new CustomRunnable();
        Thread thread = new Thread(customRunnable);
        thread.start();
    }
}
