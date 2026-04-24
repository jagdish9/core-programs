package programs.company.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterActiveString {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList(
                "name=\"abc\",id=25,status=\"active\"",
                "name=\"xyz\",id=20,status=\"inactive\"",
                "name=\"pqr\",id=30,status=\"active\""
        );

        List<String> output = ls.stream()
                .filter(s -> s.contains("status=\"active\""))
                .collect(Collectors.toList());

        if(output.isEmpty()) {
            throw new RuntimeException("No active records found");
        }

        output.forEach(System.out::println);
    }
}

/*
string contains active, if string is active, it will list otherwise throw message
 */