package programs.javaeight;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaVerify {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Using a lambda expression to print each number
        Consumer<Integer> printNumber = System.out::println;
        numbers.forEach(printNumber);

        // Or directly within forEach
        numbers.forEach((n) -> {
            if (n % 2 == 0) {
                System.out.println("Even: " + n);
            }
        });

        numbers.forEach(n -> {
            if(n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
