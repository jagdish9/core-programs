package programs.company.capgemini;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> print = msg -> System.out.println(msg);

        print.accept("Hello Java!");
    }
}
