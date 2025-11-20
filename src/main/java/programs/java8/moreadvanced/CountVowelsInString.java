package programs.java8.moreadvanced;

public class CountVowelsInString {
    public static void main(String[] args) {
        String str = "interview";

        long count = str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) >= 0)
                .count();

        System.out.println(count);
    }
}
