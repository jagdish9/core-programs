package programs.company.aziro;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringWhilePreservingSpecialChar {
    public static void main(String[] args) {
        String str = "java, @programming, language!";
        System.out.println(str);
        System.out.println(revereStr(str));
    }

    private static String revereStr(String str) {
        List<Character> reverseChars = str.chars()
                .mapToObj(c -> (char) c)
                .filter(f -> Character.isLetter(f))
                .collect(Collectors.toList());

        Collections.reverse(reverseChars);

        Iterator<Character> iterator = reverseChars.iterator();

        List<Character> output = str.chars()
                .mapToObj(c -> (char) c)
                .map(m -> Character.isLetter(m) ? iterator.next() : m)
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for(Character c : output) {
            sb.append(c);
        }

        return sb.toString();
    }
}
