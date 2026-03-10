package programs.company.infogain.thread;

public class ThreadRun {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();

        a.start();
        b.start();

        a.join();
        b.join();

        C c = new C();
        c.start();
        //c.join();
    }
}

class A extends Thread {
    @Override
    public void run() {
        System.out.println("A");
    }
}

class B extends Thread {
    @Override
    public void run() {
        System.out.println("B");
    }
}

class C extends Thread {
    @Override
    public void run() {
        System.out.println("C");
    }
}

//Thread C starts after completion of Thread A and B in java
