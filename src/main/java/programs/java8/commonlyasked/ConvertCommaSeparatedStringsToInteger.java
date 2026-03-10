package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;

public class ConvertCommaSeparatedStringsToInteger {
    public static void main(String[] args) {
        String input = "java, python, golang,rust,.net,c#, c++, kotlin,scala";

        List<String> output = Arrays.stream(input.split(","))
                .toList();

        System.out.println(output);

        String input2 = "1,2,3,4,5,6,7,8,9,10,11,12";

        List<Integer> output2 = Arrays.stream(input2.split(","))
                .map(m -> Integer.parseInt(m))
                .toList();

        System.out.println(output2);
    }
}
