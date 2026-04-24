package programs.inheritance.tricky;

public class ConstructorAndInheritance {
    public static void main(String[] args) {
        new Child7();
    }
}

class Parent7 {
    Parent7() {
        System.out.println("Parent Constructor");
    }
}

class Child7 extends Parent7 {
    Child7() {
        System.out.println("Child Constructor");
    }
}

/*
Rule:

Parent constructor executes FIRST
 */