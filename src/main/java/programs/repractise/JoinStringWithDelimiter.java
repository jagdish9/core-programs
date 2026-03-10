package programs.repractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringWithDelimiter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Shyam","Mohan");

        String str = names.stream()
                .collect(Collectors.joining(","));

        System.out.println(str);
    }
}
