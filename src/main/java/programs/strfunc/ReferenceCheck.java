package programs.strfunc;

public class ReferenceCheck {
    public static void main(String[] args) {
        EmpDemo e1 = new EmpDemo(12, 20000);
        EmpDemo e2 = new EmpDemo(12, 20000);

        if(e1 == e2) {
            System.out.println(1);
        } else if(e1.equals(e2)) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}

class EmpDemo {
    private int id;
    private double salary;

    public EmpDemo(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }
}