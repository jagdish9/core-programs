package programs.java21.patternmatchingforswitch;

public class SwitchMain {
    public static void main(String[] args) {
        Integer i = 25;
        String s = "AbcXyz";

        System.out.println(format(i));
        System.out.println(format(s));
        System.out.println(format(null));
    }

    private static String format(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "Null";
            default -> "Unknown";
        };
    }
}

/*
Switch statements can directly match types.

Benefits:

No explicit casting
More expressive control flow
Better type safety
 */