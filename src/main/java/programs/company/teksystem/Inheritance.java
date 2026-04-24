package programs.company.teksystem;

public class Inheritance {
    public static void main(String[] args) {
        InParent p = new InChild();
        p.show();

        InParent p1 = new InParent();
        p1.show();

        InChild c = new InChild();
        c.show();

        p.display();
    }
}

class InParent {
    static void show() {
        System.out.println("Parent show");
    }

    void display() {
        System.out.println("Parent display");
    }
}

class InChild extends InParent {
    static void show() {
        System.out.println("Child show");
    }

    void display() {
        System.out.println("Child display");
    }
}
