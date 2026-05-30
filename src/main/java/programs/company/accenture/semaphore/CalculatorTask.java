package programs.company.accenture.semaphore;

import java.util.concurrent.Semaphore;

public class CalculatorTask extends Semaphore {

    public CalculatorTask(int permits) {
        super(permits);
    }

    public void execute(String operation, Calculator calculator, int a, int b) {
        int permits = getPermits(operation);

        if(!this.tryAcquire()) {
            throw new RuntimeException("Lock not available");
        }

        try {
            int result = calculator.calculate(a, b);
            System.out.println("operation: "+operation + " and result: "+result);
        } finally {
            this.release();
            System.out.println("Available permits: "+this.availablePermits());
        }
    }

    private int getPermits(String operation) {
        return switch (operation.toLowerCase()) {
            case "multiply" -> 1;
            case "division" -> 2;
            default -> throw new IllegalArgumentException("Unknown operation");
        };
    }
}
