package programs.threadtask;

public class AdditionTask extends Thread {

    @Override
    public void run() {
        int a = 70;
        int b = 20;
        System.out.println(Thread.currentThread().getName() +" Sum: "+ (a+b));
    }
}