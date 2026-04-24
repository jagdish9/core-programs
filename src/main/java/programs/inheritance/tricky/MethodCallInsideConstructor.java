package programs.inheritance.tricky;

public class MethodCallInsideConstructor {
    public static void main(String[] args) {
        new Child10();
    }
}

class Parent10 {
    Parent10() {
        show();
    }

    void show() {
        System.out.println("Parent show");
    }
}

class Child10 extends Parent10 {
    int x = 10;

    void show() {
        System.out.println("Child show: "+ x);
    }
}

/*
Output:

Child show: 0
Why?
Child constructor not executed yet
x not initialized → default = 0
 */
