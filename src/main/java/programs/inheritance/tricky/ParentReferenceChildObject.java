package programs.inheritance.tricky;

public class ParentReferenceChildObject {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}

class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {

    @Override
    void show() {
        System.out.println("Child show()");
    }
}

/*
Key Rule:

Method call is decided at runtime (Dynamic Binding)
Based on actual object (Child), NOT reference (Parent)
 */