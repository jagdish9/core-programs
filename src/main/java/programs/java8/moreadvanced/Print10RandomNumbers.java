package programs.java8.moreadvanced;

import java.util.Random;

public class Print10RandomNumbers {
    public static void main(String[] args) {
        new Random().ints()
                .limit(10)
                .forEach(System.out::println);
    }
}
