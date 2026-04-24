package programs.inheritance.tricky;

import java.io.FileNotFoundException;

public class MethodThrows {
}

class Parent16 {
    void show() throws FileNotFoundException {
        System.out.println("A");
    }
}

class Child16 extends Parent16 {
    void show() throws FileNotFoundException {
        System.out.println("B");
    }
}