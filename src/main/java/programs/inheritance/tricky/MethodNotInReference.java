package programs.inheritance.tricky;

public class MethodNotInReference {
    public static void main(String[] args) {
        Parent13 p = new Child13();
        //p.display(); //compile error because method is not in reference
    }
}

class Parent13 {
    void show() {
        System.out.println("A");
    }
}

class Child13 extends Parent13 {
    void display() {
        System.out.println("B");
    }
}
