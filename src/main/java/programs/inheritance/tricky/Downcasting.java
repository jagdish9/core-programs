package programs.inheritance.tricky;

public class Downcasting {
    public static void main(String[] args) {
        Parent8 p = new Parent8();
        Child8 c = (Child8) p; // RuntimeException, it will throw ClassCastException
        //Child8 c1 = new Parent8(); // compile time exception
    }
}

class Parent8 {

}

class Child8 extends Parent8 {
    void show() {
        System.out.println("Child method");
    }
}
