package programs.inheritance.tricky;

public class StaticMethod2 {
}

class Parent11 {
    static void show() {
    }
}

class Child11 extends Parent11 {
    /*void show() {
    } */ //compile error
}

//cannot override static with instance
