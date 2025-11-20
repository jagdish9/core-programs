package programs.java8.moreadvanced;

import java.util.List;
import java.util.stream.IntStream;

public class LimitAndExitExample {
    public static void main(String[] args) {
        List<Integer> output = IntStream.rangeClosed(1, 20)
                .skip(4)
                .limit(5)
                .boxed()
                .toList();

        System.out.println(output);
    }
}
