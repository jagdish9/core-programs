package programs.strfunc;

public class OverloadCheck {
    public static void printValue(String s1) {
        System.out.println("String method invoked: "+s1);
    }

    public static void printValue(Object o1) {
        System.out.println("Object method invoked: "+o1);
    }

    public static void printValue(int i1) {
        System.out.println("Int method invoked: "+11);
    }

    public static void printValue(double d1) {
        System.out.println("Double method invoked: "+d1);
    }

    public static void main(String[] args) {
        printValue(null);
        printValue("AbcXyz");
        printValue(57);
        printValue(57.0);
    }
}
