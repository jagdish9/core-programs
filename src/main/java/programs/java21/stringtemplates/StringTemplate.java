package programs.java21.stringtemplates;

public class StringTemplate {
    public static void main(String[] args) {
        String name = "Sanjuy";
        int age = 20;

        formatStringBeforeJav21(name, age);
       // formatStringInJav21(name, age);
    }

    private static void formatStringInJav21(String name, int age) {
     //   String message = STR."Hello \{name}, age = \{age}";
     //   System.out.println(message);
    }

    private static void formatStringBeforeJav21(String name, int age) {
        String message = "Hello " + name + ", age = " + age;
        System.out.println(message);
    }
}

/*
Here:
This was preview feature in Java 21

STR is a template processor.
\{} is used to embed expressions inside a string template.
The processor evaluates the expressions and produces a regular String

Removed from Java 23
 */

