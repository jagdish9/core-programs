package programs.java11.newstringmethods;

public class Lines {
    public static void main(String[] args) {
        String s = "Java\nPython\nGolang";

        s.lines()
                .forEach(System.out::println);
    }
}
