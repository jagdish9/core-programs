package programs.company.accenture.semaphore;

public class CalculatorDriverMain {
    public static void main(String[] args) {
        CalculatorTask task = new CalculatorTask(2);

        String[][] inputs = {
                {"multiply", "2", "3"},
                {"division", "10", "2"},
                {"division", "8", "2"}
        };

        for(String[] input : inputs) {
            try {
                String operation = input[0];
                int a = Integer.parseInt(input[1]);
                int b = Integer.parseInt(input[2]);

                Calculator calculator = CalculatorFactory.getCalculator(operation);

                task.execute(operation, calculator, a, b);
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
    }
}
