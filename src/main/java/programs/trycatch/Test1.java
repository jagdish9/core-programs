package programs.trycatch;

public class Test1 {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
            System.out.println("try block");
        } catch(Exception e) {
            System.out.println("catch block");
          /*  int b = 4 + 5;
            System.out.println("b: "+b);*/
            e.printStackTrace();
        } finally {
            System.out.println("finally block");
        }
    }
}
