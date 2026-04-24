package programs.inheritance.tricky;

public class StaticMethod4 {
    public static void main(String[] args) {
        Parent14 p = null;
        p.show(); // works, static call allowed
        Parent14.show();
    }
}

class Parent14 {
    static void show() {
        System.out.println("A");
    }
}
