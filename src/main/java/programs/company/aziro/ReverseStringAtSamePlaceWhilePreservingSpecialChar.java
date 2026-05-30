package programs.company.aziro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringAtSamePlaceWhilePreservingSpecialChar {

    public static void main(String[] args) {
        String str = "java!, programming @language";
        System.out.println(str);
        System.out.println(reverseStr(str));
    }

    public static String reverseStr(String str) {
        List<String> input = Arrays.asList(str.split(" "));

        return input.stream()
                .map(s -> {
                    List<Character> ot = s.chars()
                            .mapToObj(c -> (char) c)
                            .filter(Character::isLetter)
                            .collect(Collectors.toList());
                    Collections.reverse(ot);
                    Iterator<Character> iterator = ot.iterator();
                    List<Character> ot2 = s.chars()
                            .mapToObj(c -> (char) c)
                            .map(m -> Character.isLetter(m) ? iterator.next() : m)
                            .collect(Collectors.toList());
                    StringBuilder sb = new StringBuilder();
                    for(Character c : ot2) {
                        sb.append(c);
                    }

                    return sb.toString();
                })
                .collect(Collectors.joining(" "));
    }
}
