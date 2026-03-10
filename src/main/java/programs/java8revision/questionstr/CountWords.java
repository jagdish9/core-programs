package programs.java8revision.questionstr;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {
        String str = "Stream API question and answer and query answer using java 8 Stream";

        long count = Arrays.stream(str.split(" ")).count();

        System.out.println(count);
    }
}
