package programs.company.accenture.semaphore;

public class CalculatorFactory {

    public static Calculator getCalculator(String operation) {
        return switch (operation) {
            case "multiply" -> new MultiplicationTask();
            case "division" -> new DivisionTask();
            default -> throw new IllegalArgumentException("Invalid operation");
        };
    }
}
