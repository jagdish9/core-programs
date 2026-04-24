package programs.inheritance.tricky;

import java.io.FileNotFoundException;

public class StaticMethod5 {
    public static void main(String[] args) {

    }
}

class Parent15 {
    void show() {
        System.out.println("A");
    }
}

class Child15 extends Parent15 {
    void show() throws RuntimeException {
        System.out.println("B");
    }
}

//unchecked exception allowed
