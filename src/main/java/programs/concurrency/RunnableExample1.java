package programs.concurrency;

public class RunnableExample1 {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Running task...");
        };

        new Thread(task).start();
    }
}
