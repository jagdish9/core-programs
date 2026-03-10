package demo;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {

        String str = "I am a Java devceloper";

        Map<Character, Long> output = str.chars()
                .mapToObj(c -> (char) c)
                .filter(f -> f != ' ')
                .collect(Collectors.groupingBy(f -> f, Collectors.counting()));

        output.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
// payment service

//id, currency, time, amount, time

//orderCreatedEvent

//consumer will listen the event
