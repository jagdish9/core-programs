package programs.regex;

public class MatchString {
    public static void main(String[] args) {
        String str = "u__hello_world123";

        boolean matches = str.matches("^[a-zA-Z0-9_]+$");
        System.out.println(matches);
    }
}
