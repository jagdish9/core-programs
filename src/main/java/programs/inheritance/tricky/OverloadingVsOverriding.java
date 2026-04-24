package programs.inheritance.tricky;

public class OverloadingVsOverriding {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        p.show("Hello");
    }
}

class Parent2 {
    void show(Object o) {
        System.out.println("Parent Object");
    }
}

class Child2 extends Parent2 {

    //@Override
    void show(String s) {
        System.out.println("Child String");
    }
}

/*
Why?
Overloading is resolved at compile time
Compiler sees reference type = Parent
So it calls show(Object)

Even though object is Child, method signature is chosen earlier
 */
