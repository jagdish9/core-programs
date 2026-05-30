package programs.java11.newstringmethods;

public class strip {
    public static void main(String[] args) {
        String s = "    Hello   ";

        System.out.println(s.strip());
        System.out.println(s.stripLeading());
        System.out.println(s.stripTrailing());
    }
}
