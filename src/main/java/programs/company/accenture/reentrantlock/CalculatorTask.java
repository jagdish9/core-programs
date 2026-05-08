package programs.company.accenture.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class CalculatorTask {

    private final ReentrantLock lock = new ReentrantLock();

    public void execute(String operation, int a, int b) {
        System.out.println("Trying by: "+Thread.currentThread().getName());
        if(!lock.tryLock()) {
            throw new RuntimeException("Lock not available");
        }

        try {
            int result = switch (operation.toLowerCase()) {
                case "multiply" -> a * b;
                case "division" -> {
                    if(b == 0) throw new ArithmeticException("Divide by zero");
                    yield a / b;
                }
                default -> throw new IllegalArgumentException("Unknown operation");
            };

            System.out.println(operation + ": " + result);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        CalculatorTask task = new CalculatorTask();

        Runnable service = () -> {
            task.execute("multiply", 4, 5);
            task.execute("division", 10, 2);
        };

        new Thread(service).start();
        new Thread(service).start();
    }
}
