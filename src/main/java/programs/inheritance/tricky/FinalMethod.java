package programs.inheritance.tricky;

public class FinalMethod {
    public static void main(String[] args) {

    }
}

class Parent6 {
    final void show() {
        System.out.println("Parent Final method");
    }
}

class Child6 extends Parent6 {
    /*void show() {
        System.out.println("Child Final method");
    }*/ //cannot override final method, showing compile error
}