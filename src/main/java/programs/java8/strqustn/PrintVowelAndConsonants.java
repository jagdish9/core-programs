package programs.java8.strqustn;

public class PrintVowelAndConsonants {
    public static void main(String[] args) {
        String str = "Java 8 stream programming API";

        long vowelCount = str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();

        long consonantsCount = str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) == -1)
                .count();

        System.out.println(vowelCount);
        System.out.println(consonantsCount);
    }
}
