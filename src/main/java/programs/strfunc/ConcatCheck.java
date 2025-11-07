package programs.strfunc;

public class ConcatCheck {
    public static void main(String[] args) {
        String s = "java";
        s.concat("programmer");
        System.out.println(s);

        System.out.println();

        String s1 = "java";
        s1 = s1.concat("programmer");
        System.out.println(s1);
    }
}
