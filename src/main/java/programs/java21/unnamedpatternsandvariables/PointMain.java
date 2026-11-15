package programs.java21.unnamedpatternsandvariables;

public class PointMain {
    public static void main(String[] args) {
        Point point = new Point(25, 23);
        printCoordinates(point);
    }

    private static void printCoordinates(Point p) {
        //Before java 21
        if(p instanceof Point(int x, int y)) {
            System.out.println(x);
        }

        //In java 21
        if(p instanceof Point(int x, int _)) {
            System.out.println(x);
        }
    }
}

/*
This was preview feature in Java 21 and become permanent in Java 22
 */

/*
Unnamed Patterns and Variables is a preview feature in Java 21 (JEP 443).

It introduces the underscore (_) as a way to indicate:

"I don't care about this variable or pattern. I won't use it."

This helps avoid creating meaningless variable names.
 */