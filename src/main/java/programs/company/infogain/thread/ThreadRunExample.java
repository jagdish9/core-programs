package programs.company.infogain.thread;

public class ThreadRunExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunExample("producer"));
        thread1.start();

        RunExample runExample = new RunExample("Tester");
        runExample.run();
    }
}

class RunExample implements Runnable {

    private String name;

    public RunExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Started: "+ name);
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed: "+ name);
    }
}
