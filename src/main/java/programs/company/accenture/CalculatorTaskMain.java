package programs.company.accenture;

public class CalculatorTaskMain {
    public static void main(String[] args) {
        CalculatorTask task = new CalculatorTask(3);

        String[][] inputs = {
                {"multiply", "2", "3"},
                {"division", "10", "2"},
                {"division", "8", "2"}
        };

        for(String[] input : inputs) {
            try {
                task.process(input[0],
                        Integer.parseInt(input[1]),
                        Integer.parseInt(input[2])
                );
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }

    }
}
