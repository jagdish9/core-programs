package programs.company.accenture.semaphore;

public class DivisionTask implements Calculator {

    public int calculate(int a, int b) {
        if(b == 0)
            throw new ArithmeticException("Divide by zero");
        return a / b;
    }
}
