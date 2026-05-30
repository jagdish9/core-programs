package programs.company.accenture;

import java.util.concurrent.Semaphore;

public class CalculatorTask extends Semaphore {

    public CalculatorTask(int permits) {
        super(permits);
    }

    public int process(String operation, int a, int b) {
        int requiredPermits = getRequiredPermits(operation);

        //Try acquiring lock
        if(!this.tryAcquire(requiredPermits)) {
            throw new RuntimeException("Lock not available");
        }

        try {
            int result = switch (operation.toLowerCase()) {
                case "multiply" -> a * b;
                case "division" -> {
                    if (b == 0) throw new ArithmeticException("Divide by zero");
                    yield a / b;
                }
                default -> throw new IllegalArgumentException("Invalid operation");
            };

            System.out.println(operation + " => "+ result);
            return result;
        } finally {
            //Always release permits
            //System.out.println(operation + " operation is releasing lock");
            System.out.println("Available permits: "+this.availablePermits());
            this.release(requiredPermits);
            System.out.println("Available permits after release: "+this.availablePermits());
        }
    }

    private int getRequiredPermits(String operation) {
        return switch (operation.toLowerCase()) {
            case "multiply" -> 1;
            case "division" -> 2;
            default -> throw new IllegalArgumentException("Unknown operation");
        };
    }
}
