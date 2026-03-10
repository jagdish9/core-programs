package programs.company.broadridge;

import java.util.List;

public class FilterListOfStrings {
    public static void main(String[] args) {
        List<String> list = List.of("user@mail.com", "olduser", "user2@hotmail.com");

        List<String> output = list.stream()
                .filter(l -> l.contains("@"))
                .toList();

        System.out.println(output);
    }
}
