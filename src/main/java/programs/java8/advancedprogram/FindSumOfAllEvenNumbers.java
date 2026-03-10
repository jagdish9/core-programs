package programs.java8.advancedprogram;

import java.util.stream.IntStream;

public class FindSumOfAllEvenNumbers {
    public static void main(String[] args) {
       int sum =  IntStream.rangeClosed(1, 20)
                .filter(m -> m % 2 == 0)
                .sum();

       System.out.println(sum);
    }
}
