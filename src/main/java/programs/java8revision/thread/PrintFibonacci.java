package programs.java8revision.thread;

public class PrintFibonacci {
    public static void main(String[] args) {
        int a0 = 0;
        int a1 = 1;

        System.out.print(a0 + " " + a1 + " ");
        for(int i = 0; i < 20; i++) {
            int next = a0 + a1;
            a0 = a1;
            a1 = next;
            System.out.print(next + " ");
        }
    }
}
