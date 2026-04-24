package programs.inheritance.tricky;

public class StaticMethod {
    public static void main(String[] args) {
        Parent5 p = new Child5();
        p.show();
    }
}

class Parent5 {
    static void show() {
        System.out.println("Parent static");
    }
}

class Child5 extends Parent5 {
    //@Override //
    static void show() {
        System.out.println("Child static");
    }
}
/*
(BIG INTERVIEW FAVORITE)

Rule:
Static methods are hidden, not overridden
Resolved using reference type
 */
