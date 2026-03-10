package programs.company.optimumforpayapclientpost;

public class InheritanceTest {
    public static class Parent {
        void print() {
            System.out.println("Parent in Parent");
        }
    }

    public static class Child extends Parent {
        void print() {
            System.out.println("Child in Child");
        }
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.print();
        Parent c = new Child();
        c.print();

        Child c1 = new Child();
        c1.print();

        /*Child p1 = new Parent();
        p1.print();*/
    }
}
