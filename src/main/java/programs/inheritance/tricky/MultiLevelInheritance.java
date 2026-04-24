package programs.inheritance.tricky;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Ax obj = new Cx();
        obj.show();
    }
}

class Ax {
    void show() {
        System.out.println("Ax");
    }
}

class Bx extends Ax {
    void show() {
        System.out.println("Bx");
    }
}

class Cx extends Bx {
    void show() {
        System.out.println("Cx");
    }
}
