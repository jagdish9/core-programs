package programs.java8.strqustn;

import java.util.stream.Collectors;

public class SortCharAscending {
    public static void main(String[] args) {
        String str = "stream";

        String strByAscOrder = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted()
                .collect(Collectors.joining());

        System.out.println(strByAscOrder);
    }
}
