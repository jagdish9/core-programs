package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementWhichGreater {
    public static void main(String[] args) {
        int f = 50;

        List<Integer> list = Arrays.asList(10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80);

        Integer output = list.stream()
                .sorted()
                .filter(ff -> ff > f)
                .findFirst()
                .get();

        System.out.println(output);
    }
}

//Find the first element greater than 50
