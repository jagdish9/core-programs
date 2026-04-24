package programs.company.altimetrik;

public class NoClassDefFoundHelper {

    public NoClassDefFoundHelper() {
        System.out.println("Helper constructor");
    }

    public NoClassDefFoundHelper(String arg) {
        System.out.println("Helper constructor with "+ arg);
    }

    public static void main(String[] args) {
       new NoClassDefFoundHelper("Arg constructor");
    }
}
