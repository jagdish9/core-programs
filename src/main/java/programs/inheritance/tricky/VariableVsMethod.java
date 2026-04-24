package programs.inheritance.tricky;

public class VariableVsMethod {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        System.out.println(p.x);
    }
}

class Parent1 {
    int x = 10;
}

class Child1 extends Parent1 {
    int x = 20;
}

/*
Rule:
Variables → compile-time (reference type)
Methods → runtime (object type)
 */