package programs.company.atos;

public class MethodOverloading {

    public int cal(int a, int b) {
        return a + b;
    }

    public double cal(double a, double b) {
        return a + b;
    }

    public void cal(int a, double b) {
        System.out.println(a + "-"+b);
    }

    public void cal(int x, int y, int z) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.cal(5, 3));
        System.out.println(mo.cal(5.4, 2.1));
        mo.cal(5, 3.4);
        mo.cal(4, 5, 7);
    }
}
