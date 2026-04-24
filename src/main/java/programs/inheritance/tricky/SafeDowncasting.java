package programs.inheritance.tricky;

public class SafeDowncasting {
    public static void main(String[] args) {
        Parent9 p = new Child9();

        //safe downcasting
        if(p instanceof Child9) {
            Child9 c = (Child9) p;
            c.show();
        }
    }
}

class Parent9 {
    void show() {
        System.out.println("Parent show");
    }
}

class Child9 extends Parent9 {
    void show() {
        System.out.println("Child show");
    }
}