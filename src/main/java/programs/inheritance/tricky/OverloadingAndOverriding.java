package programs.inheritance.tricky;

public class OverloadingAndOverriding {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        p.show("Hello");
    }
}

class Parent3 {
    void show(Object o) {
        System.out.println("Parent Object");
    }
}

class Child3 extends Parent3 {
    @Override
    void show(Object o) {
        System.out.println("Child Object");
    }

    void show(String s) {
        System.out.println("Child String");
    }
}

/*
Explanation:
Compile-time → picks show(Object)
Runtime → overridden → calls Child version
 */