package programs.company.atos;

public class StringImmutable {
    public static void main(String[] args) {
        String s = "abc";
        s = "xyz";
        String s1 = "abc";

        System.out.println(s + " "+ s1);

        String s5 = "hello";
        String s6 = s5.concat(" world");

        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());

        String s7 = "country";
        String s8 = new String("country");

        System.out.println("------------------");
        System.out.println(s7.hashCode());
        System.out.println(s8.hashCode());
        System.out.println(s7 == s8);
        System.out.println(s7.equals(s8));

        String s9 = "country";
        System.out.println(s7 == s9);
    }

}
