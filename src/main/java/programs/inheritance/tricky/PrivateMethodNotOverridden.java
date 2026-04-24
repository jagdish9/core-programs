package programs.inheritance.tricky;

public class PrivateMethodNotOverridden {
    public static void main(String[] args) {
        Parent4 p = new Child4();
        p.callShow();
    }
}

class Parent4 {
    private void show() {
        System.out.println("Parent show()");
    }

    void callShow() {
        show();
    }
}

class Child4 extends Parent4 {
    //@Override //not override
    void show() {
        System.out.println("Child show()");
    }
}

/*
Rule:
private methods are not overridden
They are class-specific
 */
