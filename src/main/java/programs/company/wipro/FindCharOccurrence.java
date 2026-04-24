package programs.company.wipro;

import java.util.Map;
import java.util.stream.Collectors;

public class FindCharOccurrence {
    public static void main(String[] args) {
        String s = "pooja";

        Map<Character, Long> o = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        o.forEach((k, v) -> {
            System.out.println(k + " " +v);
        });
    }
}
