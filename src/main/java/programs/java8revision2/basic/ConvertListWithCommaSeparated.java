package programs.java8revision2.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListWithCommaSeparated {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
          "Sanjay", "Matri", "vilayati", "jackie"
        );

        String str = list.stream()
                .collect(Collectors.joining(","));

        String str2 = String.join(",", list);

        System.out.println(str);
        System.out.println(str2);
    }
}
