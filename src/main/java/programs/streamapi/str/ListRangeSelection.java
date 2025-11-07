package programs.streamapi.str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListRangeSelection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Zero", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve"
        );

        int startIndex = 6;
        int endIndex = 11;

        if(startIndex < 0 || startIndex >= list.size() ||
        endIndex < 0 || endIndex >= list.size() ||
        startIndex > endIndex) {
            System.out.println("Invalid index range provided");
            return;
        }

        List<String> subList = IntStream.rangeClosed(startIndex, endIndex)
                .mapToObj(list::get)
                .toList();

        subList.forEach(System.out::println);

        System.out.println();
        List<String> newList = list.stream()
                .limit(endIndex+1)
                .skip(startIndex)
                .toList();
        newList.forEach(System.out::println);

    }
}
