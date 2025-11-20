package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestStringFromList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "springboot", "microservices", "ai");

        String output = list.stream()
                .max(Comparator.comparingInt(s -> s.length()))
                .orElse("");

        System.out.println(output);
    }
}
