package programs.company.capgemini;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> random = () -> Math.random();

        System.out.println(random.get());
    }
}
